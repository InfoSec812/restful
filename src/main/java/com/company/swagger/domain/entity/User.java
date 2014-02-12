/**
 * 
 */
package com.company.swagger.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

import org.mindrot.jbcrypt.BCrypt;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

/**
 * @author joseph.phillips
 *
 */
@Entity
@Table
@Data
@ApiModel(value="A User entity", description="User's are accounts which have login privileges on the system")
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(value="The unique account ID number", dataType="Long")
	@XmlAttribute(name="id")
	private Long id ;

	@ApiModelProperty("The user's given name")
	private String givenName ;

	@ApiModelProperty("The user's family name")
	private String familyName ;

	@ApiModelProperty("The user's login ID")
	@Column(unique=true)
	private String login ;

	@ApiModelProperty("The user's password (stored using BCrypt")
	@JsonIgnore
	@XmlTransient
	private String password ;

	public void setPassword(String password) {
		this.password = BCrypt.hashpw(password, BCrypt.gensalt(4)) ;
	}

	public boolean verifyPassword(String password) {
		return BCrypt.checkpw(password, this.password) ;
	}
}

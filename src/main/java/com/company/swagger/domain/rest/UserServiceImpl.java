/**
 * 
 */
package com.company.swagger.domain.rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

import com.company.swagger.domain.access.UserDAO;
import com.company.swagger.domain.entity.User;

/**
 * @author joseph.phillips
 *
 */
@Stateless
public class UserServiceImpl implements UserService {

	@EJB
	private UserDAO dao ;

	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		if (dao==null) {
			throw new WebApplicationException(new NullPointerException("UserDAO is null"), Status.INTERNAL_SERVER_ERROR) ;
		}
		return dao.getUserById(id) ;
	}
}

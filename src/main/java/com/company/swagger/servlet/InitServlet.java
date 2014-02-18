/**
 * 
 */
package com.company.swagger.servlet;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.company.swagger.domain.entity.User;

/**
 * @author joseph.phillips
 *
 */
@WebServlet(loadOnStartup=1, displayName="InitServlet")
public class InitServlet extends HttpServlet {

	private static final long serialVersionUID = -9075164812907847494L;

//	@EJB
//	private UserDAO dao ;

	@Override
	public void init() throws ServletException {
//		dao.createUser(User.builder().givenName("John").familyName("Smith").login("jsmith").build()) ;
//		dao.createUser(User.builder().givenName("Jose").familyName("Chavez").login("jchavez").build()) ;
//		dao.createUser(User.builder().givenName("Ari").familyName("Sharon").login("asharon").build()) ;
//		dao.createUser(User.builder().givenName("Mohammed").familyName("Keshavarzi").login("mkeshavarzi").build()) ;
//		dao.createUser(User.builder().givenName("Jean").familyName("Depardeaux").login("jdepardeaux").build()) ;
//		dao.createUser(User.builder().givenName("Gunter").familyName("Vaux").login("gvaux").build()) ;
	}
}
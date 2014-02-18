/**
 * 
 */
package com.company.swagger.domain.rest;

import javax.ejb.Stateless;
import javax.ws.rs.core.Response;

/**
 * @author joseph.phillips
 *
 */
@Stateless
public class UserServiceImpl implements UserService {

//	@EJB
//	private UserDAO dao ;

	public Response getUserById(Long id) {
		// TODO Auto-generated method stub
		return Response.ok().entity(id).build() ;
	}
}

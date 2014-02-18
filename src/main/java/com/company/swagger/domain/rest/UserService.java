/**
 * 
 */
package com.company.swagger.domain.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * @author <a href="
 *
 */
@Path("/user")
@Api(value="User restful service endpoints")
@Produces({MediaType.APPLICATION_JSON})
public interface UserService {

	@GET
	@Path("/id/{id: [0-9]*}")
	@ApiOperation(value="Get the user for the given unique user ID")
	public Response getUserById(
			@ApiParam(value="The unique ID of this user account") @PathParam(value="id") Long id) ;
}
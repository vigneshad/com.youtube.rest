/**
 * 
 */
package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author Vignesh
 *
 */
@Path("/v1/status")
public class V1_Status {

	/**
	 * 
	 */
	public V1_Status() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 *	 
	 */
	@GET
	//@Produces(MediaType.TEXT_HTML)
	public String returnTitle()
	{
		return " <p> JAVA Webservice </p> ";
	}
	
	/**
	 *	 
	 */
	@GET
	//@Produces(MediaType.TEXT_HTML)
	@Path ("/version")
	public String returnVersion()
	{
		return " <p> Version 1.0.0 </p> ";
	}

}

package com.github.cloud;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

/**
 * [FACADE] Expôe a interface externa para acesso aos serviços REST
 * @author Daniel Menezes <tt>daniel.menezes@coffey.com</tt>
 */
@Path("/service")
public class RestService extends Application {
	
	@GET
	@Path("testCall")
	public Response testCall() {
		System.out.println("Chamou");
		return Response.ok().entity("Chamda realizada com sucesso").build();
	}
	
}

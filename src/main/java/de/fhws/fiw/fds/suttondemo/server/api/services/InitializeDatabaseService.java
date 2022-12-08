package de.fhws.fiw.fds.suttondemo.server.api.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.fhws.fiw.fds.sutton.server.api.services.AbstractService;
import de.fhws.fiw.fds.suttondemo.server.database.utils.InitializeDatabase;

@Path("initializedatabase")
public class InitializeDatabaseService extends AbstractService {
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response initializeDatabase() {
		System.out.println("INITIALIZE DATABASE");

		initialize();

		return Response.ok().build();
	}

	private void initialize() {
		InitializeDatabase.initialize();
	}
}
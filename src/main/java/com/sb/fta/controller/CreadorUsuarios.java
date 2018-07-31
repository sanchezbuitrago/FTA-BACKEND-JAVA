package com.sb.fta.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("crearusuario")
public class CreadorUsuarios {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getCrearUsuaior() 
	{
		return Response.status(Response.Status.ACCEPTED)
				.entity("API CREAR USUARIO GET ::::::::")
				/*
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Headers","origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Credentials", "true")
		        .header("Access-Control-Allow-Methods","GET, POST, PUT, DELETE, OPTIONS, HEAD")
				*/
				.build();
	}
}

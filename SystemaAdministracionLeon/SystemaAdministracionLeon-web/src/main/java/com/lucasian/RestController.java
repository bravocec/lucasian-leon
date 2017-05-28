/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucasian;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucasian.ejb.UsersBusinessBeanRemote;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Alan
 */
@Path("users")
@RequestScoped
public class RestController {

    @Context
    private UriInfo context;
    
    @EJB(mappedName = "UsersBusinessBean")
    private UsersBusinessBeanRemote usersBusinessBean;

    /**
     * Creates a new instance of RestController
     */
    public RestController() {
    }

    /**
     * Retrieves representation of an instance of com.lucasian.RestController
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        Map<String,Object> map = new HashMap<>();
        
        map.put("usuarios" , this.usersBusinessBean.businessMethod());
        String fi = null;
        try{
            fi = new ObjectMapper().writeValueAsString(map);
        }catch(Exception e){
            e.printStackTrace();
        }
        return fi;
    }

    /**
     * PUT method for updating or creating an instance of RestController
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}

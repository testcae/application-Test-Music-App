package i5.las2peer.services.uatMusic;

import java.io.Serializable;
import java.net.HttpURLConnection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import i5.las2peer.api.Context;
import i5.las2peer.api.ManualDeployment;
import i5.las2peer.api.ServiceException;
import i5.las2peer.restMapper.RESTService;
import i5.las2peer.restMapper.annotations.ServicePath;
import i5.las2peer.services.uatMusic.database.DatabaseManager;
import java.sql.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import org.json.simple.*;
 

/**
 *
 * uat-testing-microservice-music
 *
 * This microservice was generated by the CAE (Community Application Editor). If you edit it, please
 * make sure to keep the general structure of the file and only add the body of the methods provided
 * in this main file. Private methods are also allowed, but any "deeper" functionality should be
 * outsourced to (imported) classes.
 *
 */
@ServicePath("musicapp")
@ManualDeployment
public class uatMusic extends RESTService {


  /*
   * Database configuration
   */
  private String jdbcDriverClassName;
  private String jdbcLogin;
  private String jdbcPass;
  private String jdbcUrl;
  private static DatabaseManager dbm;



  public uatMusic() {
	super();
    // read and set properties values
    setFieldValues();
        // instantiate a database manager to handle database connection pooling and credentials
    dbm = new DatabaseManager(jdbcDriverClassName, jdbcLogin, jdbcPass, jdbcUrl);
  }

  @Override
  public void initResources() {
	getResourceConfig().register(RootResource.class);
  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // REST methods
  // //////////////////////////////////////////////////////////////////////////////////////

  @Api
  @SwaggerDefinition(
      info = @Info(title = "uat-testing-microservice-music", version = "1",
          description = "Microservice for music for UAT testing",
          termsOfService = "LICENSE.txt",
          contact = @Contact(name = "Melisa Cecilia", email = "CAEAddress@gmail.com") ,
          license = @License(name = "BSD",
              url = "https://github.com/testcae/microservice-uat-testing-microservice-music/blob/master/LICENSE.txt") ) )
  @Path("/")
  public static class RootResource {

    private final uatMusic service = (uatMusic) Context.getCurrent().getService();

      /**
   * 
   * postMusic
   *
   * 
   * @param payloadPostMusic payload post music a JSONObject
   * 
   * @return Response response post image
   * 
   */
  @POST
  @Path("/post/")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.TEXT_PLAIN)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "response post image")
  })
  @ApiOperation(value = "postMusic", notes = "$HTTP_Method_Description$")
  public Response postMusic(classes.imageMusic payloadPostMusic) {

    // responsePostImage
    boolean responsePostImage_condition = true;
    if(responsePostImage_condition) {
      JSONObject resultPostImage = new classes().new imageMusic().toJSON();
      return Response.status(HttpURLConnection.HTTP_OK).entity(resultPostImage.toJSONString()).build();
    }
    return null;
  }

  /**
   * 
   * getMusic
   *
   * 
   * @param payloadGetMusic payload get music a JSONObject
   * 
   * @return Response Response get music
   * 
   */
  @GET
  @Path("/get/")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.TEXT_PLAIN)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Response get music")
  })
  @ApiOperation(value = "getMusic", notes = "$HTTP_Method_Description$")
  public Response getMusic(classes.imageMusic payloadGetMusic) {
    Serializable serviceCallParameter = null;

    try {
      Object serviceCallReturn = Context.getCurrent().invoke(
          "serviceClass", "serviceMethodName", serviceCallParameter);
    } catch (Exception e) {
        e.printStackTrace();
    }
    // responseGetMusic
    boolean responseGetMusic_condition = true;
    if(responseGetMusic_condition) {
      JSONObject resultGetMusic = new classes().new imageMusic().toJSON();
      return Response.status(HttpURLConnection.HTTP_OK).entity(resultGetMusic.toJSONString()).build();
    }
    return null;
  }



  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // Service methods (for inter service calls)
  // //////////////////////////////////////////////////////////////////////////////////////
  
  

}

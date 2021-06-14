/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.example.api;

import com.example.models.Course;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-14T12:58:55.375323800+02:00[Europe/Amsterdam]")
@Api(value = "courses", description = "the courses API")
public interface CoursesApi {

    @ApiOperation(value = "", nickname = "coursesGet", notes = "Fetch Course resource", response = Course.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success Response", response = Course.class, responseContainer = "List") })
    @RequestMapping(value = "/courses",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Course>> coursesGet(@ApiParam(value = "") @Valid @RequestParam(value = "coursename", required = false) String coursename
);


    @ApiOperation(value = "", nickname = "coursesIdDelete", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "deleted course") })
    @RequestMapping(value = "/courses/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> coursesIdDelete(@ApiParam(value = "",required=true) @PathVariable("id") Integer id
);


    @ApiOperation(value = "", nickname = "coursesIdGet", notes = "", response = Course.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success Response for each identifier", response = Course.class) })
    @RequestMapping(value = "/courses/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Course> coursesIdGet(@ApiParam(value = "",required=true) @PathVariable("id") Integer id
);


    @ApiOperation(value = "", nickname = "coursesPost", notes = "Add new course", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Record Successfully Added") })
    @RequestMapping(value = "/courses",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> coursesPost(@ApiParam(value = ""  )  @Valid @RequestBody Course body
);

}

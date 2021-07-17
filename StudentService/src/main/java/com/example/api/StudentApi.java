/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.example.api;

import com.example.models.Course;
import com.example.models.Student;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-07-17T19:31:18.816+02:00[Europe/Berlin]")
@Api(value = "student", description = "the student API")
public interface StudentApi {

    @ApiOperation(value = "", nickname = "studentGet", notes = "Fetch Student resource", response = Student.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success Response", response = Student.class, responseContainer = "List") })
    @RequestMapping(value = "/student",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Student>> studentGet(@ApiParam(value = "") @Valid @RequestParam(value = "studentname", required = false) String studentname
);


    @ApiOperation(value = "", nickname = "studentIdDelete", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "deleted student") })
    @RequestMapping(value = "/student/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> studentIdDelete(@ApiParam(value = "",required=true) @PathVariable("id") Integer id
);


    @ApiOperation(value = "", nickname = "studentIdGet", notes = "", response = Student.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success Response for each identifier", response = Student.class) })
    @RequestMapping(value = "/student/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Student> studentIdGet(@ApiParam(value = "",required=true) @PathVariable("id") Integer id
);


    @ApiOperation(value = "", nickname = "studentPost", notes = "Add new student", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Record Successfully Added") })
    @RequestMapping(value = "/student",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> studentPost(@ApiParam(value = ""  )  @Valid @RequestBody Student body
);


    @ApiOperation(value = "", nickname = "studentStudentIdCoursesGet", notes = "", response = Course.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success Response for each identifier", response = Course.class, responseContainer = "List") })
    @RequestMapping(value = "/student/{studentId}/courses",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Course>> studentStudentIdCoursesGet(@ApiParam(value = "",required=true) @PathVariable("studentId") Integer studentId
);


    @ApiOperation(value = "", nickname = "studentStudentIdCoursesPost", notes = "Add new course", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Record Successfully Added") })
    @RequestMapping(value = "/student/{studentId}/courses",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> studentStudentIdCoursesPost(@ApiParam(value = "",required=true) @PathVariable("studentId") Integer studentId
,@ApiParam(value = ""  )  @Valid @RequestBody List<Course> body
);

}

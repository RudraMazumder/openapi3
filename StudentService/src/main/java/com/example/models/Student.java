package com.example.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Student
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-11T16:54:17.856189400+02:00[Europe/Amsterdam]")
public class Student   {
  @JsonProperty("StudentID")
  private Integer studentID = null;

  @JsonProperty("StudentName")
  private String studentName = null;

  @JsonProperty("StudentRemark")
  private String studentRemark = null;

  public Student studentID(Integer studentID) {
    this.studentID = studentID;
    return this;
  }

  /**
   * Get studentID
   * @return studentID
  **/
  @ApiModelProperty(example = "3", value = "")
  
    public Integer getStudentID() {
    return studentID;
  }

  public void setStudentID(Integer studentID) {
    this.studentID = studentID;
  }

  public Student studentName(String studentName) {
    this.studentName = studentName;
    return this;
  }

  /**
   * Get studentName
   * @return studentName
  **/
  @ApiModelProperty(example = "David", value = "")
  
    public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public Student studentRemark(String studentRemark) {
    this.studentRemark = studentRemark;
    return this;
  }

  /**
   * Get studentRemark
   * @return studentRemark
  **/
  @ApiModelProperty(example = "High grade student", value = "")
  
    public String getStudentRemark() {
    return studentRemark;
  }

  public void setStudentRemark(String studentRemark) {
    this.studentRemark = studentRemark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.studentID, student.studentID) &&
        Objects.equals(this.studentName, student.studentName) &&
        Objects.equals(this.studentRemark, student.studentRemark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentID, studentName, studentRemark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    
    sb.append("    studentID: ").append(toIndentedString(studentID)).append("\n");
    sb.append("    studentName: ").append(toIndentedString(studentName)).append("\n");
    sb.append("    studentRemark: ").append(toIndentedString(studentRemark)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

package io.BankDataAgregation.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.BankDataAgregation.client.model.BankDataAggregation;
import io.BankDataAgregation.client.model.Error;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@ApiModel(description = "Information about a failed bank data aggregation process.")


public class FailureADAConsumption {
  @SerializedName("request")
  private BankDataAggregation request = null;
  @SerializedName("errors")
  private List<Error> errors = null;
  public FailureADAConsumption request(BankDataAggregation request) {
    this.request = request;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public BankDataAggregation getRequest() {
    return request;
  }
  public void setRequest(BankDataAggregation request) {
    this.request = request;
  }
  public FailureADAConsumption errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }
  public FailureADAConsumption addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }
   
  @ApiModelProperty(value = "List of errors.")
  public List<Error> getErrors() {
    return errors;
  }
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureADAConsumption failureADAConsumption = (FailureADAConsumption) o;
    return Objects.equals(this.request, failureADAConsumption.request) &&
        Objects.equals(this.errors, failureADAConsumption.errors);
  }
  @Override
  public int hashCode() {
    return Objects.hash(request, errors);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailureADAConsumption {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

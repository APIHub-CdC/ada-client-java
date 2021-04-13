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
import io.BankDataAgregation.client.model.BankDataAggregations;
import io.BankDataAgregation.client.model.Metadata;
import java.io.IOException;
@ApiModel(description = "Metadata (paging information) of the list of bank data aggregation processes.")


public class BankDataAggregationMetadata {
  @SerializedName("_metadata")
  private Metadata metadata = null;
  @SerializedName("inquiries")
  private BankDataAggregations inquiries = null;
  public BankDataAggregationMetadata metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Metadata getMetadata() {
    return metadata;
  }
  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }
  public BankDataAggregationMetadata inquiries(BankDataAggregations inquiries) {
    this.inquiries = inquiries;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public BankDataAggregations getInquiries() {
    return inquiries;
  }
  public void setInquiries(BankDataAggregations inquiries) {
    this.inquiries = inquiries;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankDataAggregationMetadata bankDataAggregationMetadata = (BankDataAggregationMetadata) o;
    return Objects.equals(this.metadata, bankDataAggregationMetadata.metadata) &&
        Objects.equals(this.inquiries, bankDataAggregationMetadata.inquiries);
  }
  @Override
  public int hashCode() {
    return Objects.hash(metadata, inquiries);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankDataAggregationMetadata {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    inquiries: ").append(toIndentedString(inquiries)).append("\n");
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

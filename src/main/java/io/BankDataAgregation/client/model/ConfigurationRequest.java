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
import io.BankDataAgregation.client.model.ConfigurationRequest2fA;
import io.BankDataAgregation.client.model.ConfigurationRequestDescriptions;
import io.BankDataAgregation.client.model.ConfigurationRequestPrincipal;
import io.BankDataAgregation.client.model.ConfigurationRequestTermsAndConditions;
import java.io.IOException;
@ApiModel(description = "Gives you the availability of custom the main page as you want according to your needs.")


public class ConfigurationRequest {
  @SerializedName("principal")
  private ConfigurationRequestPrincipal principal = null;
  @SerializedName("descriptions")
  private ConfigurationRequestDescriptions descriptions = null;
  @SerializedName("terms_and_conditions")
  private ConfigurationRequestTermsAndConditions termsAndConditions = null;
  @SerializedName("twoFa")
  private ConfigurationRequest2fA twoFa = null;
  public ConfigurationRequest principal(ConfigurationRequestPrincipal principal) {
    this.principal = principal;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ConfigurationRequestPrincipal getPrincipal() {
    return principal;
  }
  public void setPrincipal(ConfigurationRequestPrincipal principal) {
    this.principal = principal;
  }
  public ConfigurationRequest descriptions(ConfigurationRequestDescriptions descriptions) {
    this.descriptions = descriptions;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ConfigurationRequestDescriptions getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(ConfigurationRequestDescriptions descriptions) {
    this.descriptions = descriptions;
  }
  public ConfigurationRequest termsAndConditions(ConfigurationRequestTermsAndConditions termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ConfigurationRequestTermsAndConditions getTermsAndConditions() {
    return termsAndConditions;
  }
  public void setTermsAndConditions(ConfigurationRequestTermsAndConditions termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }
  public ConfigurationRequest twoFa(ConfigurationRequest2fA twoFa) {
    this.twoFa = twoFa;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ConfigurationRequest2fA getTwoFa() {
    return twoFa;
  }
  public void setTwoFa(ConfigurationRequest2fA twoFa) {
    this.twoFa = twoFa;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationRequest configurationRequest = (ConfigurationRequest) o;
    return Objects.equals(this.principal, configurationRequest.principal) &&
        Objects.equals(this.descriptions, configurationRequest.descriptions) &&
        Objects.equals(this.termsAndConditions, configurationRequest.termsAndConditions) &&
        Objects.equals(this.twoFa, configurationRequest.twoFa);
  }
  @Override
  public int hashCode() {
    return Objects.hash(principal, descriptions, termsAndConditions, twoFa);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationRequest {\n");
    
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    twoFa: ").append(toIndentedString(twoFa)).append("\n");
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

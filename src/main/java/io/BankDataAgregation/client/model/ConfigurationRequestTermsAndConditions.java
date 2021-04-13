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
import java.io.IOException;
@ApiModel(description = "")


public class ConfigurationRequestTermsAndConditions {
  @SerializedName("terms_and_conditions_label")
  private String termsAndConditionsLabel = null;
  @SerializedName("terms_and_conditions_title")
  private String termsAndConditionsTitle = null;
  @SerializedName("terms_and_conditions")
  private String termsAndConditions = null;
  public ConfigurationRequestTermsAndConditions termsAndConditionsLabel(String termsAndConditionsLabel) {
    this.termsAndConditionsLabel = termsAndConditionsLabel;
    return this;
  }
   
  @ApiModelProperty(example = "Al continuar, acepto y confirmo que he leido los terminos y condiciones. Que los entiendo, acepto y quedo vinculado por ellos", value = "Text that will be display as link to open the modal that contains the terms and conditions.")
  public String getTermsAndConditionsLabel() {
    return termsAndConditionsLabel;
  }
  public void setTermsAndConditionsLabel(String termsAndConditionsLabel) {
    this.termsAndConditionsLabel = termsAndConditionsLabel;
  }
  public ConfigurationRequestTermsAndConditions termsAndConditionsTitle(String termsAndConditionsTitle) {
    this.termsAndConditionsTitle = termsAndConditionsTitle;
    return this;
  }
   
  @ApiModelProperty(example = "Terminos y condiciones", value = "Text of terms and conditions, that will be display when the modal is open.")
  public String getTermsAndConditionsTitle() {
    return termsAndConditionsTitle;
  }
  public void setTermsAndConditionsTitle(String termsAndConditionsTitle) {
    this.termsAndConditionsTitle = termsAndConditionsTitle;
  }
  public ConfigurationRequestTermsAndConditions termsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }
   
  @ApiModelProperty(example = "<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vehicula tellus sed faucibus lacinia. Aenean faucibus, est in sollicitudin dapibus, justo velit venenatis magna, et aliquet lacus turpis sed nisl. Vestibulum maximus ante mi, vitae congue ipsum mollis vitae. Integer non sem ornare, hendrerit risus in, egestas tellus. Nam orci lectus, scelerisque nec commodo nec, suscipit ut nisl. Ut eu euismod erat, a dictum mi. Etiam aliquam neque nec hendrerit faucibus. Phasellus placerat finibus porta.</p><p>Nunc faucibus arcu nec metus euismod congue. Maecenas rutrum justo elit. Nunc viverra elementum semper. Proin scelerisque, sem id aliquam semper, erat orci volutpat leo, eget suscipit lectus velit id velit. Proin mattis in quam nec tristique. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Nam ut mi ligula.</p><p>Pellentesque elementum neque et dui consequat convallis. Aliquam blandit non urna vel ultrices. Curabitur viverra gravida nunc eu auctor. Maecenas ac efficitur enim. Etiam molestie id nulla ut volutpat. Praesent eu dui ac sem volutpat commodo. Suspendisse convallis cursus mollis. Suspendisse condimentum lorem varius, pharetra neque sed, mattis arcu. In feugiat, nibh ac vestibulum varius, libero risus tempus nulla, sed convallis nulla neque ut velit. Mauris sed metus ligula. Vivamus molestie vehicula felis, nec aliquet justo rutrum sit amet. Pellentesque et efficitur tellus, in pretium sem. Donec euismod orci nisl, ut imperdiet risus fringilla eget. Aliquam accumsan et ipsum sed convallis. Curabitur eros nisi, porta ac lorem vel, viverra venenatis mauris.</p><p>Fusce aliquet turpis sed dui luctus molestie. Maecenas eget metus dignissim, consequat orci eget, gravida augue. Sed porttitor nibh erat, eu tempor enim pharetra in. Sed vehicula, dolor id ultricies faucibus, nunc erat elementum mi, in gravida augue elit quis libero. Nulla ac ex et tortor dictum iaculis fringilla id quam. In feugiat leo vel est iaculis, non accumsan purus gravida. Vivamus orci augue, dignissim ac pulvinar sit amet, blandit pulvinar ante. Suspendisse pellentesque nibh eget dignissim faucibus. Pellentesque eu pellentesque tortor. Fusce efficitur ligula ligula.</p><p>Aenean rhoncus elit id nibh porttitor, in dictum lectus porttitor. Mauris metus nulla, rhoncus at odio in, mollis porta urna. Sed vestibulum eros malesuada nulla varius, sit amet viverra est consectetur. Cras fringilla ornare sagittis. Ut et erat eu odio pulvinar dapibus nec sit amet risus. Nam blandit mollis urna, quis tincidunt diam ultricies non. Suspendisse id libero suscipit, viverra ligula nec, viverra odio.</p>", value = "")
  public String getTermsAndConditions() {
    return termsAndConditions;
  }
  public void setTermsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationRequestTermsAndConditions configurationRequestTermsAndConditions = (ConfigurationRequestTermsAndConditions) o;
    return Objects.equals(this.termsAndConditionsLabel, configurationRequestTermsAndConditions.termsAndConditionsLabel) &&
        Objects.equals(this.termsAndConditionsTitle, configurationRequestTermsAndConditions.termsAndConditionsTitle) &&
        Objects.equals(this.termsAndConditions, configurationRequestTermsAndConditions.termsAndConditions);
  }
  @Override
  public int hashCode() {
    return Objects.hash(termsAndConditionsLabel, termsAndConditionsTitle, termsAndConditions);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationRequestTermsAndConditions {\n");
    
    sb.append("    termsAndConditionsLabel: ").append(toIndentedString(termsAndConditionsLabel)).append("\n");
    sb.append("    termsAndConditionsTitle: ").append(toIndentedString(termsAndConditionsTitle)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
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

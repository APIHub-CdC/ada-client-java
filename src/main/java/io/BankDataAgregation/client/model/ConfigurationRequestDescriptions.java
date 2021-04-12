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
import io.BankDataAgregation.client.model.Icons;
import java.io.IOException;
@ApiModel(description = "")


public class ConfigurationRequestDescriptions {
  @SerializedName("first_highlighted_icon")
  private Icons firstHighlightedIcon = null;
  @SerializedName("first_highlighted_text")
  private String firstHighlightedText = null;
  @SerializedName("second_highlighted_icon")
  private Icons secondHighlightedIcon = null;
  @SerializedName("second_highlighted_text")
  private String secondHighlightedText = null;
  @SerializedName("third_highlighted_icon")
  private Icons thirdHighlightedIcon = null;
  @SerializedName("third_highlighted_text")
  private String thirdHighlightedText = null;
  @SerializedName("fourth_highlighted_icon")
  private Icons fourthHighlightedIcon = null;
  @SerializedName("fourth_highlighted_text")
  private String fourthHighlightedText = null;
  public ConfigurationRequestDescriptions firstHighlightedIcon(Icons firstHighlightedIcon) {
    this.firstHighlightedIcon = firstHighlightedIcon;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Icons getFirstHighlightedIcon() {
    return firstHighlightedIcon;
  }
  public void setFirstHighlightedIcon(Icons firstHighlightedIcon) {
    this.firstHighlightedIcon = firstHighlightedIcon;
  }
  public ConfigurationRequestDescriptions firstHighlightedText(String firstHighlightedText) {
    this.firstHighlightedText = firstHighlightedText;
    return this;
  }
   
  @ApiModelProperty(example = "Cumplimos con la directiva Europea PSD2.", value = "First text in the card body.")
  public String getFirstHighlightedText() {
    return firstHighlightedText;
  }
  public void setFirstHighlightedText(String firstHighlightedText) {
    this.firstHighlightedText = firstHighlightedText;
  }
  public ConfigurationRequestDescriptions secondHighlightedIcon(Icons secondHighlightedIcon) {
    this.secondHighlightedIcon = secondHighlightedIcon;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Icons getSecondHighlightedIcon() {
    return secondHighlightedIcon;
  }
  public void setSecondHighlightedIcon(Icons secondHighlightedIcon) {
    this.secondHighlightedIcon = secondHighlightedIcon;
  }
  public ConfigurationRequestDescriptions secondHighlightedText(String secondHighlightedText) {
    this.secondHighlightedText = secondHighlightedText;
    return this;
  }
   
  @ApiModelProperty(example = "Sus datos son encriptados con la última tecnología.", value = "Second text in the card body.")
  public String getSecondHighlightedText() {
    return secondHighlightedText;
  }
  public void setSecondHighlightedText(String secondHighlightedText) {
    this.secondHighlightedText = secondHighlightedText;
  }
  public ConfigurationRequestDescriptions thirdHighlightedIcon(Icons thirdHighlightedIcon) {
    this.thirdHighlightedIcon = thirdHighlightedIcon;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Icons getThirdHighlightedIcon() {
    return thirdHighlightedIcon;
  }
  public void setThirdHighlightedIcon(Icons thirdHighlightedIcon) {
    this.thirdHighlightedIcon = thirdHighlightedIcon;
  }
  public ConfigurationRequestDescriptions thirdHighlightedText(String thirdHighlightedText) {
    this.thirdHighlightedText = thirdHighlightedText;
    return this;
  }
   
  @ApiModelProperty(example = "Sus datos personales están regulados por la Ley Orgánica de Protección de Datos de Carácter Personal (GDPR).", value = "Third text in the card body.")
  public String getThirdHighlightedText() {
    return thirdHighlightedText;
  }
  public void setThirdHighlightedText(String thirdHighlightedText) {
    this.thirdHighlightedText = thirdHighlightedText;
  }
  public ConfigurationRequestDescriptions fourthHighlightedIcon(Icons fourthHighlightedIcon) {
    this.fourthHighlightedIcon = fourthHighlightedIcon;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Icons getFourthHighlightedIcon() {
    return fourthHighlightedIcon;
  }
  public void setFourthHighlightedIcon(Icons fourthHighlightedIcon) {
    this.fourthHighlightedIcon = fourthHighlightedIcon;
  }
  public ConfigurationRequestDescriptions fourthHighlightedText(String fourthHighlightedText) {
    this.fourthHighlightedText = fourthHighlightedText;
    return this;
  }
   
  @ApiModelProperty(example = "Entra con tus credenciales de acceso al banco para completar el proceso.", value = "")
  public String getFourthHighlightedText() {
    return fourthHighlightedText;
  }
  public void setFourthHighlightedText(String fourthHighlightedText) {
    this.fourthHighlightedText = fourthHighlightedText;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationRequestDescriptions configurationRequestDescriptions = (ConfigurationRequestDescriptions) o;
    return Objects.equals(this.firstHighlightedIcon, configurationRequestDescriptions.firstHighlightedIcon) &&
        Objects.equals(this.firstHighlightedText, configurationRequestDescriptions.firstHighlightedText) &&
        Objects.equals(this.secondHighlightedIcon, configurationRequestDescriptions.secondHighlightedIcon) &&
        Objects.equals(this.secondHighlightedText, configurationRequestDescriptions.secondHighlightedText) &&
        Objects.equals(this.thirdHighlightedIcon, configurationRequestDescriptions.thirdHighlightedIcon) &&
        Objects.equals(this.thirdHighlightedText, configurationRequestDescriptions.thirdHighlightedText) &&
        Objects.equals(this.fourthHighlightedIcon, configurationRequestDescriptions.fourthHighlightedIcon) &&
        Objects.equals(this.fourthHighlightedText, configurationRequestDescriptions.fourthHighlightedText);
  }
  @Override
  public int hashCode() {
    return Objects.hash(firstHighlightedIcon, firstHighlightedText, secondHighlightedIcon, secondHighlightedText, thirdHighlightedIcon, thirdHighlightedText, fourthHighlightedIcon, fourthHighlightedText);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationRequestDescriptions {\n");
    
    sb.append("    firstHighlightedIcon: ").append(toIndentedString(firstHighlightedIcon)).append("\n");
    sb.append("    firstHighlightedText: ").append(toIndentedString(firstHighlightedText)).append("\n");
    sb.append("    secondHighlightedIcon: ").append(toIndentedString(secondHighlightedIcon)).append("\n");
    sb.append("    secondHighlightedText: ").append(toIndentedString(secondHighlightedText)).append("\n");
    sb.append("    thirdHighlightedIcon: ").append(toIndentedString(thirdHighlightedIcon)).append("\n");
    sb.append("    thirdHighlightedText: ").append(toIndentedString(thirdHighlightedText)).append("\n");
    sb.append("    fourthHighlightedIcon: ").append(toIndentedString(fourthHighlightedIcon)).append("\n");
    sb.append("    fourthHighlightedText: ").append(toIndentedString(fourthHighlightedText)).append("\n");
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

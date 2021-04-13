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


public class ConfigurationRequest2fA {
  @SerializedName("twoFa_highlighted_icon")
  private Icons twoFaHighlightedIcon = null;
  @SerializedName("twoFa_highlighted_text")
  private String twoFaHighlightedText = null;
  public ConfigurationRequest2fA twoFaHighlightedIcon(Icons twoFaHighlightedIcon) {
    this.twoFaHighlightedIcon = twoFaHighlightedIcon;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Icons getTwoFaHighlightedIcon() {
    return twoFaHighlightedIcon;
  }
  public void setTwoFaHighlightedIcon(Icons twoFaHighlightedIcon) {
    this.twoFaHighlightedIcon = twoFaHighlightedIcon;
  }
  public ConfigurationRequest2fA twoFaHighlightedText(String twoFaHighlightedText) {
    this.twoFaHighlightedText = twoFaHighlightedText;
    return this;
  }
   
  @ApiModelProperty(example = "Confirme la transacción introduciendo el código", value = "")
  public String getTwoFaHighlightedText() {
    return twoFaHighlightedText;
  }
  public void setTwoFaHighlightedText(String twoFaHighlightedText) {
    this.twoFaHighlightedText = twoFaHighlightedText;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationRequest2fA configurationRequest2fA = (ConfigurationRequest2fA) o;
    return Objects.equals(this.twoFaHighlightedIcon, configurationRequest2fA.twoFaHighlightedIcon) &&
        Objects.equals(this.twoFaHighlightedText, configurationRequest2fA.twoFaHighlightedText);
  }
  @Override
  public int hashCode() {
    return Objects.hash(twoFaHighlightedIcon, twoFaHighlightedText);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationRequest2fA {\n");
    
    sb.append("    twoFaHighlightedIcon: ").append(toIndentedString(twoFaHighlightedIcon)).append("\n");
    sb.append("    twoFaHighlightedText: ").append(toIndentedString(twoFaHighlightedText)).append("\n");
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

package io.BankDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


public class AccountsObj {
  @SerializedName("id")
  private String id = null;

  @SerializedName("participation")
  private String participation = null;

  public AccountsObj id(String id) {
    this.id = id;
    return this;
  }

 
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountsObj participation(String participation) {
    this.participation = participation;
    return this;
  }


  
  public String getParticipation() {
    return participation;
  }

  public void setParticipation(String participation) {
    this.participation = participation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsObj accountsObj = (AccountsObj) o;
    return Objects.equals(this.id, accountsObj.id) &&
        Objects.equals(this.participation, accountsObj.participation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, participation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsObj {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
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


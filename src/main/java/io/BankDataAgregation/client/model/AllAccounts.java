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
import io.BankDataAgregation.client.model.CurrencyCatalogue;
import java.io.IOException;
import org.threeten.bp.LocalDate;


public class AllAccounts {
  @SerializedName("bankId")
  private Integer bankId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("accountId")
  private String accountId = null;
  @SerializedName("firstMovement")
  private LocalDate firstMovement = null;
  @SerializedName("lastMovement")
  private LocalDate lastMovement = null;
  @SerializedName("participation")
  private String participation = null;
  @SerializedName("currency")
  private CurrencyCatalogue currency = null;
  @SerializedName("currentBalance")
  private Float currentBalance = null;
  @SerializedName("balancesAvg")
  private Float balancesAvg = null;
  @SerializedName("minTotalBalance")
  private Float minTotalBalance = null;
  @SerializedName("maxTotalBalance")
  private Float maxTotalBalance = null;
  @SerializedName("totalIncomeAvg")
  private Float totalIncomeAvg = null;
  @SerializedName("totalExpenseAvg")
  private Float totalExpenseAvg = null;
  public AllAccounts bankId(Integer bankId) {
    this.bankId = bankId;
    return this;
  }
   
  @ApiModelProperty(example = "300", value = "Id of the bank.")
  public Integer getBankId() {
    return bankId;
  }
  public void setBankId(Integer bankId) {
    this.bankId = bankId;
  }
  public AllAccounts name(String name) {
    this.name = name;
    return this;
  }
   
  @ApiModelProperty(example = "BBVA Bancomer", value = "name of the bank.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public AllAccounts accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }
   
  @ApiModelProperty(example = "0000000167", value = "Id of the bank account, could be only a part.")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
  public AllAccounts firstMovement(LocalDate firstMovement) {
    this.firstMovement = firstMovement;
    return this;
  }
   
  @ApiModelProperty(example = "2020-11-24", value = "Format based on the internet standard, RFC3339 - 5.6")
  public LocalDate getFirstMovement() {
    return firstMovement;
  }
  public void setFirstMovement(LocalDate firstMovement) {
    this.firstMovement = firstMovement;
  }
  public AllAccounts lastMovement(LocalDate lastMovement) {
    this.lastMovement = lastMovement;
    return this;
  }
   
  @ApiModelProperty(example = "2021-1-24", value = "Format based on the internet standard, RFC3339 - 5.6")
  public LocalDate getLastMovement() {
    return lastMovement;
  }
  public void setLastMovement(LocalDate lastMovement) {
    this.lastMovement = lastMovement;
  }
  public AllAccounts participation(String participation) {
    this.participation = participation;
    return this;
  }
   
  @ApiModelProperty(example = "titular", value = "Format based on the internet standard, RFC3339 - 5.6")
  public String getParticipation() {
    return participation;
  }
  public void setParticipation(String participation) {
    this.participation = participation;
  }
  public AllAccounts currency(CurrencyCatalogue currency) {
    this.currency = currency;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CurrencyCatalogue getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencyCatalogue currency) {
    this.currency = currency;
  }
  public AllAccounts currentBalance(Float currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }
   
  @ApiModelProperty(example = "5082.0", value = "Field current balance")
  public Float getCurrentBalance() {
    return currentBalance;
  }
  public void setCurrentBalance(Float currentBalance) {
    this.currentBalance = currentBalance;
  }
  public AllAccounts balancesAvg(Float balancesAvg) {
    this.balancesAvg = balancesAvg;
    return this;
  }
   
  @ApiModelProperty(example = "9865.67", value = "Field average balance")
  public Float getBalancesAvg() {
    return balancesAvg;
  }
  public void setBalancesAvg(Float balancesAvg) {
    this.balancesAvg = balancesAvg;
  }
  public AllAccounts minTotalBalance(Float minTotalBalance) {
    this.minTotalBalance = minTotalBalance;
    return this;
  }
   
  @ApiModelProperty(example = "6067.0", value = "Field average total balance")
  public Float getMinTotalBalance() {
    return minTotalBalance;
  }
  public void setMinTotalBalance(Float minTotalBalance) {
    this.minTotalBalance = minTotalBalance;
  }
  public AllAccounts maxTotalBalance(Float maxTotalBalance) {
    this.maxTotalBalance = maxTotalBalance;
    return this;
  }
   
  @ApiModelProperty(example = "8190.45", value = "Field current balance")
  public Float getMaxTotalBalance() {
    return maxTotalBalance;
  }
  public void setMaxTotalBalance(Float maxTotalBalance) {
    this.maxTotalBalance = maxTotalBalance;
  }
  public AllAccounts totalIncomeAvg(Float totalIncomeAvg) {
    this.totalIncomeAvg = totalIncomeAvg;
    return this;
  }
   
  @ApiModelProperty(example = "11137.67", value = "Field average total income")
  public Float getTotalIncomeAvg() {
    return totalIncomeAvg;
  }
  public void setTotalIncomeAvg(Float totalIncomeAvg) {
    this.totalIncomeAvg = totalIncomeAvg;
  }
  public AllAccounts totalExpenseAvg(Float totalExpenseAvg) {
    this.totalExpenseAvg = totalExpenseAvg;
    return this;
  }
   
  @ApiModelProperty(example = "-7665.33", value = "Field average total expenses")
  public Float getTotalExpenseAvg() {
    return totalExpenseAvg;
  }
  public void setTotalExpenseAvg(Float totalExpenseAvg) {
    this.totalExpenseAvg = totalExpenseAvg;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllAccounts allAccounts = (AllAccounts) o;
    return Objects.equals(this.bankId, allAccounts.bankId) &&
        Objects.equals(this.name, allAccounts.name) &&
        Objects.equals(this.accountId, allAccounts.accountId) &&
        Objects.equals(this.firstMovement, allAccounts.firstMovement) &&
        Objects.equals(this.lastMovement, allAccounts.lastMovement) &&
        Objects.equals(this.participation, allAccounts.participation) &&
        Objects.equals(this.currency, allAccounts.currency) &&
        Objects.equals(this.currentBalance, allAccounts.currentBalance) &&
        Objects.equals(this.balancesAvg, allAccounts.balancesAvg) &&
        Objects.equals(this.minTotalBalance, allAccounts.minTotalBalance) &&
        Objects.equals(this.maxTotalBalance, allAccounts.maxTotalBalance) &&
        Objects.equals(this.totalIncomeAvg, allAccounts.totalIncomeAvg) &&
        Objects.equals(this.totalExpenseAvg, allAccounts.totalExpenseAvg);
  }
  @Override
  public int hashCode() {
    return Objects.hash(bankId, name, accountId, firstMovement, lastMovement, participation, currency, currentBalance, balancesAvg, minTotalBalance, maxTotalBalance, totalIncomeAvg, totalExpenseAvg);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllAccounts {\n");
    
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    firstMovement: ").append(toIndentedString(firstMovement)).append("\n");
    sb.append("    lastMovement: ").append(toIndentedString(lastMovement)).append("\n");
    sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    balancesAvg: ").append(toIndentedString(balancesAvg)).append("\n");
    sb.append("    minTotalBalance: ").append(toIndentedString(minTotalBalance)).append("\n");
    sb.append("    maxTotalBalance: ").append(toIndentedString(maxTotalBalance)).append("\n");
    sb.append("    totalIncomeAvg: ").append(toIndentedString(totalIncomeAvg)).append("\n");
    sb.append("    totalExpenseAvg: ").append(toIndentedString(totalExpenseAvg)).append("\n");
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

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
import io.BankDataAgregation.client.model.MonthlyAccountingSummary;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;


public class AccountingSummary {
  @SerializedName("startDate")
  private LocalDate startDate = null;
  @SerializedName("endDate")
  private LocalDate endDate = null;
  @SerializedName("firstMovement")
  private LocalDate firstMovement = null;
  @SerializedName("lastMovement")
  private LocalDate lastMovement = null;
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
  @SerializedName("summaryMonths")
  private List<MonthlyAccountingSummary> summaryMonths = null;
  public AccountingSummary startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }
   
  @ApiModelProperty(example = "2020-11-24", value = "Format based on the internet standard, RFC3339 - 5.6")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }
  public AccountingSummary endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }
   
  @ApiModelProperty(example = "2021-2-19", value = "Format based on the internet standard, RFC3339 - 5.6")
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }
  public AccountingSummary firstMovement(LocalDate firstMovement) {
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
  public AccountingSummary lastMovement(LocalDate lastMovement) {
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
  public AccountingSummary currentBalance(Float currentBalance) {
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
  public AccountingSummary balancesAvg(Float balancesAvg) {
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
  public AccountingSummary minTotalBalance(Float minTotalBalance) {
    this.minTotalBalance = minTotalBalance;
    return this;
  }
   
  @ApiModelProperty(example = "6067.0", value = "Field minimum total balance")
  public Float getMinTotalBalance() {
    return minTotalBalance;
  }
  public void setMinTotalBalance(Float minTotalBalance) {
    this.minTotalBalance = minTotalBalance;
  }
  public AccountingSummary maxTotalBalance(Float maxTotalBalance) {
    this.maxTotalBalance = maxTotalBalance;
    return this;
  }
   
  @ApiModelProperty(example = "8190.45", value = "Field maximum total balance")
  public Float getMaxTotalBalance() {
    return maxTotalBalance;
  }
  public void setMaxTotalBalance(Float maxTotalBalance) {
    this.maxTotalBalance = maxTotalBalance;
  }
  public AccountingSummary totalIncomeAvg(Float totalIncomeAvg) {
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
  public AccountingSummary totalExpenseAvg(Float totalExpenseAvg) {
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
  public AccountingSummary summaryMonths(List<MonthlyAccountingSummary> summaryMonths) {
    this.summaryMonths = summaryMonths;
    return this;
  }
  public AccountingSummary addSummaryMonthsItem(MonthlyAccountingSummary summaryMonthsItem) {
    if (this.summaryMonths == null) {
      this.summaryMonths = new ArrayList<MonthlyAccountingSummary>();
    }
    this.summaryMonths.add(summaryMonthsItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<MonthlyAccountingSummary> getSummaryMonths() {
    return summaryMonths;
  }
  public void setSummaryMonths(List<MonthlyAccountingSummary> summaryMonths) {
    this.summaryMonths = summaryMonths;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountingSummary accountingSummary = (AccountingSummary) o;
    return Objects.equals(this.startDate, accountingSummary.startDate) &&
        Objects.equals(this.endDate, accountingSummary.endDate) &&
        Objects.equals(this.firstMovement, accountingSummary.firstMovement) &&
        Objects.equals(this.lastMovement, accountingSummary.lastMovement) &&
        Objects.equals(this.currentBalance, accountingSummary.currentBalance) &&
        Objects.equals(this.balancesAvg, accountingSummary.balancesAvg) &&
        Objects.equals(this.minTotalBalance, accountingSummary.minTotalBalance) &&
        Objects.equals(this.maxTotalBalance, accountingSummary.maxTotalBalance) &&
        Objects.equals(this.totalIncomeAvg, accountingSummary.totalIncomeAvg) &&
        Objects.equals(this.totalExpenseAvg, accountingSummary.totalExpenseAvg) &&
        Objects.equals(this.summaryMonths, accountingSummary.summaryMonths);
  }
  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, firstMovement, lastMovement, currentBalance, balancesAvg, minTotalBalance, maxTotalBalance, totalIncomeAvg, totalExpenseAvg, summaryMonths);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountingSummary {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    firstMovement: ").append(toIndentedString(firstMovement)).append("\n");
    sb.append("    lastMovement: ").append(toIndentedString(lastMovement)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    balancesAvg: ").append(toIndentedString(balancesAvg)).append("\n");
    sb.append("    minTotalBalance: ").append(toIndentedString(minTotalBalance)).append("\n");
    sb.append("    maxTotalBalance: ").append(toIndentedString(maxTotalBalance)).append("\n");
    sb.append("    totalIncomeAvg: ").append(toIndentedString(totalIncomeAvg)).append("\n");
    sb.append("    totalExpenseAvg: ").append(toIndentedString(totalExpenseAvg)).append("\n");
    sb.append("    summaryMonths: ").append(toIndentedString(summaryMonths)).append("\n");
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

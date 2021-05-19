package io.BankDataAgregation.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class MonthlyAccountingSummary {
  @SerializedName("date")
  private String date = null;

  @SerializedName("avgBalance")
  private Float avgBalance = null;

  @SerializedName("minBalance")
  private Float minBalance = null;

  @SerializedName("maxBalance")
  private Float maxBalance = null;

  @SerializedName("totalIncome")
  private Float totalIncome = null;

  @SerializedName("totalExpense")
  private Float totalExpense = null;

  @SerializedName("transactions")
  private BigDecimal transactions = null;

  public MonthlyAccountingSummary date(String date) {
    this.date = date;
    return this;
  }

   
  @ApiModelProperty(example = "2020-11", value = "Sumary date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public MonthlyAccountingSummary avgBalance(Float avgBalance) {
    this.avgBalance = avgBalance;
    return this;
  }


  @ApiModelProperty(example = "9865.67", value = "Field average balance")
  public Float getAvgBalance() {
    return avgBalance;
  }

  public void setAvgBalance(Float avgBalance) {
    this.avgBalance = avgBalance;
  }

  public MonthlyAccountingSummary minBalance(Float minBalance) {
    this.minBalance = minBalance;
    return this;
  }


  @ApiModelProperty(example = "6067.0", value = "Field minimum balance")
  public Float getMinBalance() {
    return minBalance;
  }

  public void setMinBalance(Float minBalance) {
    this.minBalance = minBalance;
  }

  public MonthlyAccountingSummary maxBalance(Float maxBalance) {
    this.maxBalance = maxBalance;
    return this;
  }


  @ApiModelProperty(example = "8190.45", value = "Field maximum balance")
  public Float getMaxBalance() {
    return maxBalance;
  }

  public void setMaxBalance(Float maxBalance) {
    this.maxBalance = maxBalance;
  }

  public MonthlyAccountingSummary totalIncome(Float totalIncome) {
    this.totalIncome = totalIncome;
    return this;
  }


  @ApiModelProperty(example = "11137.67", value = "Field total income")
  public Float getTotalIncome() {
    return totalIncome;
  }

  public void setTotalIncome(Float totalIncome) {
    this.totalIncome = totalIncome;
  }

  public MonthlyAccountingSummary totalExpense(Float totalExpense) {
    this.totalExpense = totalExpense;
    return this;
  }


  @ApiModelProperty(example = "-7665.33", value = "Field total expenses")
  public Float getTotalExpense() {
    return totalExpense;
  }

  public void setTotalExpense(Float totalExpense) {
    this.totalExpense = totalExpense;
  }

  public MonthlyAccountingSummary transactions(BigDecimal transactions) {
    this.transactions = transactions;
    return this;
  }


  @ApiModelProperty(example = "1.0", value = "total transactions")
  public BigDecimal getTransactions() {
    return transactions;
  }

  public void setTransactions(BigDecimal transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthlyAccountingSummary monthlyAccountingSummary = (MonthlyAccountingSummary) o;
    return Objects.equals(this.date, monthlyAccountingSummary.date) &&
        Objects.equals(this.avgBalance, monthlyAccountingSummary.avgBalance) &&
        Objects.equals(this.minBalance, monthlyAccountingSummary.minBalance) &&
        Objects.equals(this.maxBalance, monthlyAccountingSummary.maxBalance) &&
        Objects.equals(this.totalIncome, monthlyAccountingSummary.totalIncome) &&
        Objects.equals(this.totalExpense, monthlyAccountingSummary.totalExpense) &&
        Objects.equals(this.transactions, monthlyAccountingSummary.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, avgBalance, minBalance, maxBalance, totalIncome, totalExpense, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthlyAccountingSummary {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    avgBalance: ").append(toIndentedString(avgBalance)).append("\n");
    sb.append("    minBalance: ").append(toIndentedString(minBalance)).append("\n");
    sb.append("    maxBalance: ").append(toIndentedString(maxBalance)).append("\n");
    sb.append("    totalIncome: ").append(toIndentedString(totalIncome)).append("\n");
    sb.append("    totalExpense: ").append(toIndentedString(totalExpense)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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


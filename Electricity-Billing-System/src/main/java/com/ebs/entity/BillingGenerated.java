package com.ebs.entity;

public class BillingGenerated {
	private int rid;
	private int acccountNumber;
	private String accountholdername;
	private String email;
	private int mobile;
	private String connectionDate;
	private int meterNumber;
	private String meterStartDate;
	private int meterReading;
	private int perUnitPrice;
	private String BillMonth;
	private int billAmount;
	private String BillDueDate;
	private int billAmountAfterDueDate;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getAcccountNumber() {
		return acccountNumber;
	}
	public void setAcccountNumber(int acccountNumber) {
		this.acccountNumber = acccountNumber;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getConnectionDate() {
		return connectionDate;
	}
	public void setConnectionDate(String connectionDate) {
		this.connectionDate = connectionDate;
	}
	public int getMeterNumber() {
		return meterNumber;
	}
	public void setMeterNumber(int meterNumber) {
		this.meterNumber = meterNumber;
	}
	public String getMeterStartDate() {
		return meterStartDate;
	}
	public void setMeterStartDate(String meterStartDate) {
		this.meterStartDate = meterStartDate;
	}
	public int getMeterReading() {
		return meterReading;
	}
	public void setMeterReading(int meterReading) {
		this.meterReading = meterReading;
	}
	public int getPerUnitPrice() {
		return perUnitPrice;
	}
	public void setPerUnitPrice(int perUnitPrice) {
		this.perUnitPrice = perUnitPrice;
	}
	public String getBillMonth() {
		return BillMonth;
	}
	public void setBillMonth(String billMonth) {
		BillMonth = billMonth;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	public String getBillDueDate() {
		return BillDueDate;
	}
	public void setBillDueDate(String billDueDate) {
		BillDueDate = billDueDate;
	}
	public int getBillAmountAfterDueDate() {
		return billAmountAfterDueDate;
	}
	public void setBillAmountAfterDueDate(int billAmountAfterDueDate) {
		this.billAmountAfterDueDate = billAmountAfterDueDate;
	}
	public BillingGenerated() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BillingGenerated [rid=" + rid + ", acccountNumber=" + acccountNumber + ", accountholdername="
				+ accountholdername + ", email=" + email + ", mobile=" + mobile + ", connectionDate=" + connectionDate
				+ ", meterNumber=" + meterNumber + ", meterStartDate=" + meterStartDate + ", meterReading="
				+ meterReading + ", perUnitPrice=" + perUnitPrice + ", BillMonth=" + BillMonth + ", billAmount="
				+ billAmount + ", BillDueDate=" + BillDueDate + ", billAmountAfterDueDate=" + billAmountAfterDueDate
				+ "]";
	}
	
}

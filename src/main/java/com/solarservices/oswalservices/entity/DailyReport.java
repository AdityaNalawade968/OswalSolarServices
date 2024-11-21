package com.solarservices.oswalservices.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DailyReport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dailyReportId;
	private Date date;
	private String fromLocation;
	private String destinationName;
	private String vehicleType;
	private String startReading;
	private String stopReading;
	private String totalDistance;
	private String conveyance;
	private String foodCost;
	private String other;
	private String totalAmount;
	private String remark;

	private int userId;
	private int orgId;

	public DailyReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DailyReport(int dailyReportId, Date date, String fromLocation, String destinationName, String vehicleType,
			String startReading, String stopReading, String totalDistance, String conveyance, String foodCost,
			String other, String totalAmount, String remark, int userId, int orgId) {
		super();
		this.dailyReportId = dailyReportId;
		this.date = date;
		this.fromLocation = fromLocation;
		this.destinationName = destinationName;
		this.vehicleType = vehicleType;
		this.startReading = startReading;
		this.stopReading = stopReading;
		this.totalDistance = totalDistance;
		this.conveyance = conveyance;
		this.foodCost = foodCost;
		this.other = other;
		this.totalAmount = totalAmount;
		this.remark = remark;
		this.userId = userId;
		this.orgId = orgId;
	}

	public int getDailyReportId() {
		return dailyReportId;
	}

	public void setDailyReportId(int dailyReportId) {
		this.dailyReportId = dailyReportId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getStartReading() {
		return startReading;
	}

	public void setStartReading(String startReading) {
		this.startReading = startReading;
	}

	public String getStopReading() {
		return stopReading;
	}

	public void setStopReading(String stopReading) {
		this.stopReading = stopReading;
	}

	public String getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(String totalDistance) {
		this.totalDistance = totalDistance;
	}

	public String getConveyance() {
		return conveyance;
	}

	public void setConveyance(String conveyance) {
		this.conveyance = conveyance;
	}

	public String getFoodCost() {
		return foodCost;
	}

	public void setFoodCost(String foodCost) {
		this.foodCost = foodCost;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	@Override
	public String toString() {
		return "DailyReport [dailyReportId=" + dailyReportId + ", date=" + date + ", fromLocation=" + fromLocation
				+ ", destinationName=" + destinationName + ", vehicleType=" + vehicleType + ", startReading="
				+ startReading + ", stopReading=" + stopReading + ", totalDistance=" + totalDistance + ", conveyance="
				+ conveyance + ", foodCost=" + foodCost + ", other=" + other + ", totalAmount=" + totalAmount
				+ ", remark=" + remark + ", userId=" + userId + ", orgId=" + orgId + "]";
	}

}

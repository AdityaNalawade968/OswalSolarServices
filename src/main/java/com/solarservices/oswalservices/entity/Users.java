package com.solarservices.oswalservices.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String password;
	private String fName;
	private String mName;
	private String lName;
	private Date date;
	private String email;
	private String mobileNo;
	private String mobileNo2;
	private String other;
	private String villageName;
	private String talukaName;
	private String distName;
	private int orgId;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int userId, String userName, String password, String fName, String mName, String lName, Date date,
			String email, String mobileNo, String mobileNo2, String other, String villageName, String talukaName,
			String distName, int orgId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.date = date;
		this.email = email;
		this.mobileNo = mobileNo;
		this.mobileNo2 = mobileNo2;
		this.other = other;
		this.villageName = villageName;
		this.talukaName = talukaName;
		this.distName = distName;
		this.orgId = orgId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getMobileNo2() {
		return mobileNo2;
	}

	public void setMobileNo2(String mobileNo2) {
		this.mobileNo2 = mobileNo2;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getTalukaName() {
		return talukaName;
	}

	public void setTalukaName(String talukaName) {
		this.talukaName = talukaName;
	}

	public String getDistName() {
		return distName;
	}

	public void setDistName(String distName) {
		this.distName = distName;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", password=" + password + ", fName=" + fName
				+ ", mName=" + mName + ", lName=" + lName + ", date=" + date + ", email=" + email + ", mobileNo="
				+ mobileNo + ", mobileNo2=" + mobileNo2 + ", other=" + other + ", villageName=" + villageName
				+ ", talukaName=" + talukaName + ", distName=" + distName + ", orgId=" + orgId + "]";
	}

}

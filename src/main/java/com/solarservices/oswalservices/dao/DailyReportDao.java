package com.solarservices.oswalservices.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solarservices.oswalservices.entity.DailyReport;
import com.solarservices.oswalservices.entity.DatabaseConnectionManager;
import com.solarservices.oswalservices.repo.DailyReportRepo;

@Component
public class DailyReportDao {

	@Autowired
	DailyReportRepo dailyReportRepo;

	String url = "jdbc:mysql://junction.proxy.rlwy.net:29214/solarservices";
	String username = "root";
	String password = "HburqaJheEbPczwXyREVimuqIDLZdDRa";

	public List<DailyReport> getDailyReport(DailyReport dailyReport) {

		int userId = dailyReport.getUserId();
		Date date = dailyReport.getDate();

		String monthAndYear = dailyReport.getConveyance();
		String[] parts = monthAndYear.split("-");
		String year = parts[0];
		String month = parts[1];
 
		List<DailyReport> dailyReports = new ArrayList<>();

		String sql = "SELECT * FROM daily_report WHERE user_id = " + userId + 
	             " AND MONTH(date) = '" + month + "' AND YEAR(date) = '" + year + "'";


		try (Connection conn = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {
				DailyReport report = new DailyReport();
				report.setDailyReportId(rs.getInt("daily_report_id"));
				report.setDate(rs.getDate("date"));
				report.setFromLocation(rs.getString("from_location"));
				report.setDestinationName(rs.getString("destination_name"));
				report.setVehicleType(rs.getString("vehicle_type"));
				report.setStartReading(rs.getString("start_reading"));
				report.setStopReading(rs.getString("stop_reading"));
				report.setTotalDistance(rs.getString("total_distance"));
				report.setConveyance(rs.getString("conveyance"));
				report.setFoodCost(rs.getString("food_cost"));
				report.setOther(rs.getString("other"));
				report.setTotalAmount(rs.getString("total_amount"));
				report.setRemark(rs.getString("remark"));
				dailyReports.add(report);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dailyReports;
	}

	public DailyReport saveDailyReport(DailyReport dailyReport) {

		return dailyReportRepo.save(dailyReport);
	}
}

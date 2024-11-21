package com.solarservices.oswalservices.dao;

import java.sql.Connection;
import java.util.ArrayList;
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

	public List<DailyReport> getDailyReport(DailyReport dailyReport) {
		
		int userId=dailyReport.getUserId();
	
		List<DailyReport> dailyReports = new ArrayList<>();

		// SQL query to get daily report data
		String sql = "SELECT * FROM daily_report WHERE user_id ="+userId;

		// Create a connection
		try (Connection conn = DatabaseConnectionManager.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {

			// Process each row in the result set
			while (rs.next()) {
				// Create a DailyReport object and populate it with data from the result set
				DailyReport report = new DailyReport();
				report.setDailyReportId(rs.getInt("daily_report_id"));
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
			e.printStackTrace(); // Log the exception or handle it appropriately
		} 
		return dailyReports;
	}

	public DailyReport saveDailyReport(DailyReport dailyReport) {

		return dailyReportRepo.save(dailyReport);
	}
}

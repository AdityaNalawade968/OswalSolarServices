package com.solarservices.oswalservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solarservices.oswalservices.entity.DailyReport;
import com.solarservices.oswalservices.service.DailyReportService;

@RestController
@RequestMapping("/oswalservices/dailyReport")
@CrossOrigin("*")
public class DailyReportController {

	@Autowired
	DailyReportService dailyReportService;

	@PostMapping("/getAll")
	public List<DailyReport> getDailyReport(@RequestBody DailyReport dailyReport) {
		System.out.println(dailyReport.getUserId());
		return dailyReportService.getDailyReport(dailyReport);
	}
	
	@PostMapping("/save")
	public DailyReport saveDailyReport(@RequestBody DailyReport dailyReport ) {
		
		System.out.println("-------------------------------------");
		
		System.out.println(dailyReport.getFromLocation());
		
		return dailyReportService.saveDailyReport(dailyReport);
	}
}

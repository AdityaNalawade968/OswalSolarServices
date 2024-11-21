package com.solarservices.oswalservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solarservices.oswalservices.dao.DailyReportDao;
import com.solarservices.oswalservices.entity.DailyReport;

@Service
public class DailyReportService {

	@Autowired
	DailyReportDao dailyReportDao;

	public List<DailyReport> getDailyReport(DailyReport dailyReport) {
		return dailyReportDao.getDailyReport(dailyReport);
	}

	public DailyReport saveDailyReport(DailyReport dailyReport) { 
		return dailyReportDao.saveDailyReport(dailyReport);
	}
}

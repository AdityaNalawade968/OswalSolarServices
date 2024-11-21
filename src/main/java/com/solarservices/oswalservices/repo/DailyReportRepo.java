package com.solarservices.oswalservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solarservices.oswalservices.entity.DailyReport;

@Repository
public interface DailyReportRepo extends JpaRepository<DailyReport, Integer>{

}

package com.example.jobseekWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jobseekWeb.entity.JobData;

public interface JobDataRepo extends JpaRepository<JobData,Long>{

}

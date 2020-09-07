package com.example.jobseekWeb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.jobseekWeb.entity.JobData;
import com.example.jobseekWeb.repository.JobDataRepo;
import net.sf.json.JSONArray;

@Controller
public class APIController {
	@Autowired
	private JobDataRepo jdRepo;

	@RequestMapping(value = "/jobData", method = RequestMethod.POST)
	public @ResponseBody String jobData(@RequestBody String dataArrayToSend) {
		System.out.println("APIController -  jobData");
		String result_page = "{\"success\":\"false\"}";

		List<Map<String, Object>> resultMap = new ArrayList<Map<String, Object>>();
		JobData jd;

		System.out.println("dataArrayToSend : " + dataArrayToSend);

		List<JobData> jdList = new ArrayList<JobData>();
		resultMap = JSONArray.fromObject(dataArrayToSend);

		jdRepo.deleteAll(); // database를 비우고 시작한다.

		for (Map<String, Object> map : resultMap) {
			jd = new JobData();
			if (map.get("JO_REGIST_NO") != null) {
				jd.setJO_REGIST_NO(map.get("JO_REGIST_NO").toString());
			}
			if (map.get("CMPNY_NM") != null) {
				//////////////////////////////
				System.out.println("이름 확인: " + map.get("CMPNY_NM").toString());
				jd.setCMPNY_NM(map.get("CMPNY_NM").toString());
			}
			if (map.get("BSNS_SUMRY_CN") != null) {
				jd.setBSNS_SUMRY_CN(map.get("BSNS_SUMRY_CN").toString());
			}
			if (map.get("RCRIT_JSSFC_CMMN_CODE_SE") != null) {
				jd.setRCRIT_JSSFC_CMMN_CODE_SE(map.get("RCRIT_JSSFC_CMMN_CODE_SE").toString());
			}
			if (map.get("JOBCODE_NM") != null) {
				jd.setJOBCODE_NM(map.get("JOBCODE_NM").toString());
			}
			if (map.get("RCRIT_NMPR_CO") != null) {
				jd.setRCRIT_NMPR_CO(map.get("RCRIT_NMPR_CO").toString());
			}
			if (map.get("ACDMCR_CMMN_CODE_SE") != null) {
				jd.setACDMCR_CMMN_CODE_SE(map.get("ACDMCR_CMMN_CODE_SE").toString());
			}
			if (map.get("ACDMCR_NM") != null) {
				jd.setACDMCR_NM(map.get("ACDMCR_NM").toString());
			}
			if (map.get("EMPLYM_STLE_CMMN_CODE_SE") != null) {
				jd.setEMPLYM_STLE_CMMN_CODE_SE(map.get("EMPLYM_STLE_CMMN_CODE_SE").toString());
			}
			if (map.get("EMPLYM_STLE_CMMN_MM") != null) {
				jd.setEMPLYM_STLE_CMMN_MM(map.get("EMPLYM_STLE_CMMN_MM").toString());
			}
			if (map.get("WORK_PARAR_BASS_ADRES_CN") != null) {
				jd.setWORK_PARAR_BASS_ADRES_CN(map.get("WORK_PARAR_BASS_ADRES_CN").toString());
			}
			if (map.get("DTY_CN") != null) {
				jd.setDTY_CN(map.get("DTY_CN").toString());
			}
			if (map.get("CAREER_CND_CMMN_CODE_SE") != null) {
				jd.setCAREER_CND_CMMN_CODE_SE(map.get("CAREER_CND_CMMN_CODE_SE").toString());
			}
			if (map.get("CAREER_CND_NM") != null) {
				jd.setCAREER_CND_NM(map.get("CAREER_CND_NM").toString());
			}
			if (map.get("HOPE_WAGE") != null) {
				jd.setHOPE_WAGE(map.get("HOPE_WAGE").toString());
			}
			if (map.get("RET_GRANTS_NM") != null) {
				jd.setRET_GRANTS_NM(map.get("RET_GRANTS_NM").toString());
			}
			if (map.get("WORK_TIME_NM") != null) {
				jd.setWORK_TIME_NM(map.get("WORK_TIME_NM").toString());
			}
			if (map.get("WORK_TM_NM") != null) {
				jd.setWORK_TM_NM(map.get("WORK_TM_NM").toString());
			}
			if (map.get("HOLIDAY_NM") != null) {
				jd.setHOLIDAY_NM(map.get("HOLIDAY_NM").toString());
			}
			if (map.get("WEEK_WORK_HR") != null) {
				jd.setWEEK_WORK_HR(map.get("WEEK_WORK_HR").toString());
			}
			if (map.get("JO_FEINSR_SBSCRB_NM") != null) {
				jd.setJO_FEINSR_SBSCRB_NM(map.get("JO_FEINSR_SBSCRB_NM").toString());
			}
			if (map.get("RCEPT_CLOS_NM") != null) {
				jd.setRCEPT_CLOS_NM(map.get("RCEPT_CLOS_NM").toString());
			}
			if (map.get("RCEPT_MTH_IEM_NM") != null) {
				jd.setRCEPT_MTH_IEM_NM(map.get("RCEPT_MTH_IEM_NM").toString());
			}
			if (map.get("MODEL_MTH_NM") != null) {
				jd.setMODEL_MTH_NM(map.get("MODEL_MTH_NM").toString());
			}
			if (map.get("RCEPT_MTH_NM") != null) {
				jd.setRCEPT_MTH_NM(map.get("RCEPT_MTH_NM").toString());
			}
			if (map.get("PRESENTN_PAPERS_NM") != null) {
				jd.setPRESENTN_PAPERS_NM(map.get("PRESENTN_PAPERS_NM").toString());
			}
			if (map.get("MNGR_NM") != null) {
				jd.setMNGR_NM(map.get("MNGR_NM").toString());
			}
			if (map.get("MNGR_PHON_NO") != null) {
				jd.setMNGR_PHON_NO(map.get("MNGR_PHON_NO").toString());
			}
			if (map.get("MNGR_INSTT_NM") != null) {
				jd.setMNGR_INSTT_NM(map.get("MNGR_INSTT_NM").toString());
			}
			if (map.get("BASS_ADRES_CN") != null) {
				jd.setBASS_ADRES_CN(map.get("BASS_ADRES_CN").toString());
			}

			jdList.add(jd);

		}

		jdRepo.saveAll(jdList);
		result_page = "{\"success\":\"true\"}";

		return result_page;
	}


}

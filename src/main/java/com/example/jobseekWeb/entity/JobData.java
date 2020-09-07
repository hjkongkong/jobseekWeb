package com.example.jobseekWeb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JobData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String JO_REGIST_NO; // 구인 등록 번호
    private String CMPNY_NM; // 기업 명칭
    private String BSNS_SUMRY_CN; // 사업 요약 내용
    private String RCRIT_JSSFC_CMMN_CODE_SE; //모집 직종 코드
    private String JOBCODE_NM; // 모집 직종 코드명
    private String RCRIT_NMPR_CO; // 모집 인원수
    private String ACDMCR_CMMN_CODE_SE; //학력 코드
    //J00108:전문대학, J00104:중학교, J00106:고등학교, J00102:초등학교, 
    //J00110:대학_대학교, J00100:관계없음, J00114:박사과정
    private String ACDMCR_NM; //학력 코드명
    private String EMPLYM_STLE_CMMN_CODE_SE; //고용형태코드
    // J01102:계약직, J01105:상용직(시간제), J01101:상용직, J01103:계약직(시간제)
    private String EMPLYM_STLE_CMMN_MM; // 고용 형태 코드명
    private String WORK_PARAR_BASS_ADRES_CN; // 근무 예정지 주소
//    private String SUBWAY_NM; //인접전철역
    @Column(length = 1000)
    private String DTY_CN; // 직무 내용
    private String CAREER_CND_CMMN_CODE_SE; // 경력조건코드
    // J01301: 신입, J01302: 경력, J01300: 무관
    private String CAREER_CND_NM; // 경력조건 코드명
    private String HOPE_WAGE; // 급여조건
    private String RET_GRANTS_NM; // 퇴직금 구분
    private String WORK_TIME_NM; // 근무시간
    private String WORK_TM_NM; // 근무 형태
    private String HOLIDAY_NM; // 공휴일
    private String WEEK_WORK_HR; // 주당 근무시간
    private String JO_FEINSR_SBSCRB_NM; // 4대 보험
    private String RCEPT_CLOS_NM; // 마감일
    private String RCEPT_MTH_IEM_NM; // 전형장소
    private String MODEL_MTH_NM; // 전형 방법
    private String RCEPT_MTH_NM; // 접수 방법
    private String PRESENTN_PAPERS_NM; // 제출 서류
    private String MNGR_NM; // 담당 상담사명
    private String MNGR_PHON_NO; // 담당 상담사 전화번호
    private String MNGR_INSTT_NM; // 담당 상담사 소속 기관명
    private String BASS_ADRES_CN; // 기업주소
    
    public String getJO_REGIST_NO() {
        return JO_REGIST_NO;
    }
    public void setJO_REGIST_NO(String jO_REGIST_NO) {
        JO_REGIST_NO = jO_REGIST_NO;
    }
    public String getCMPNY_NM() {
        return CMPNY_NM;
    }
    public void setCMPNY_NM(String cMPNY_NM) {
        CMPNY_NM = cMPNY_NM;
    }
    public String getBSNS_SUMRY_CN() {
        return BSNS_SUMRY_CN;
    }
    public void setBSNS_SUMRY_CN(String bSNS_SUMRY_CN) {
        BSNS_SUMRY_CN = bSNS_SUMRY_CN;
    }
    public String getRCRIT_JSSFC_CMMN_CODE_SE() {
        return RCRIT_JSSFC_CMMN_CODE_SE;
    }
    public void setRCRIT_JSSFC_CMMN_CODE_SE(String rCRIT_JSSFC_CMMN_CODE_SE) {
        RCRIT_JSSFC_CMMN_CODE_SE = rCRIT_JSSFC_CMMN_CODE_SE;
    }
    public String getJOBCODE_NM() {
        return JOBCODE_NM;
    }
    public void setJOBCODE_NM(String jOBCODE_NM) {
        JOBCODE_NM = jOBCODE_NM;
    }
    public String getRCRIT_NMPR_CO() {
        return RCRIT_NMPR_CO;
    }
    public void setRCRIT_NMPR_CO(String rCRIT_NMPR_CO) {
        RCRIT_NMPR_CO = rCRIT_NMPR_CO;
    }
    public String getACDMCR_CMMN_CODE_SE() {
        return ACDMCR_CMMN_CODE_SE;
    }
    public void setACDMCR_CMMN_CODE_SE(String aCDMCR_CMMN_CODE_SE) {
        ACDMCR_CMMN_CODE_SE = aCDMCR_CMMN_CODE_SE;
    }
    public String getACDMCR_NM() {
        return ACDMCR_NM;
    }
    public void setACDMCR_NM(String aCDMCR_NM) {
        ACDMCR_NM = aCDMCR_NM;
    }
    public String getEMPLYM_STLE_CMMN_CODE_SE() {
        return EMPLYM_STLE_CMMN_CODE_SE;
    }
    public void setEMPLYM_STLE_CMMN_CODE_SE(String eMPLYM_STLE_CMMN_CODE_SE) {
        EMPLYM_STLE_CMMN_CODE_SE = eMPLYM_STLE_CMMN_CODE_SE;
    }
    public String getEMPLYM_STLE_CMMN_MM() {
        return EMPLYM_STLE_CMMN_MM;
    }
    public void setEMPLYM_STLE_CMMN_MM(String eMPLYM_STLE_CMMN_MM) {
        EMPLYM_STLE_CMMN_MM = eMPLYM_STLE_CMMN_MM;
    }
    public String getWORK_PARAR_BASS_ADRES_CN() {
        return WORK_PARAR_BASS_ADRES_CN;
    }
    public void setWORK_PARAR_BASS_ADRES_CN(String wORK_PARAR_BASS_ADRES_CN) {
        WORK_PARAR_BASS_ADRES_CN = wORK_PARAR_BASS_ADRES_CN;
    }
//    public String getSUBWAY_NM() {
//        return SUBWAY_NM;
//    }
//    public void setSUBWAY_NM(String sUBWAY_NM) {
//        SUBWAY_NM = sUBWAY_NM;
//    }
    public String getDTY_CN() {
        return DTY_CN;
    }
    public void setDTY_CN(String dTY_CN) {
        DTY_CN = dTY_CN;
    }
    public String getCAREER_CND_CMMN_CODE_SE() {
        return CAREER_CND_CMMN_CODE_SE;
    }
    public void setCAREER_CND_CMMN_CODE_SE(String cAREER_CND_CMMN_CODE_SE) {
        CAREER_CND_CMMN_CODE_SE = cAREER_CND_CMMN_CODE_SE;
    }
    public String getCAREER_CND_NM() {
        return CAREER_CND_NM;
    }
    public void setCAREER_CND_NM(String cAREER_CND_NM) {
        CAREER_CND_NM = cAREER_CND_NM;
    }
    public String getHOPE_WAGE() {
        return HOPE_WAGE;
    }
    public void setHOPE_WAGE(String hOPE_WAGE) {
        HOPE_WAGE = hOPE_WAGE;
    }
    public String getRET_GRANTS_NM() {
        return RET_GRANTS_NM;
    }
    public void setRET_GRANTS_NM(String rET_GRANTS_NM) {
        RET_GRANTS_NM = rET_GRANTS_NM;
    }
    public String getWORK_TIME_NM() {
        return WORK_TIME_NM;
    }
    public void setWORK_TIME_NM(String wORK_TIME_NM) {
        WORK_TIME_NM = wORK_TIME_NM;
    }
    public String getWORK_TM_NM() {
        return WORK_TM_NM;
    }
    public void setWORK_TM_NM(String wORK_TM_NM) {
        WORK_TM_NM = wORK_TM_NM;
    }
    public String getHOLIDAY_NM() {
        return HOLIDAY_NM;
    }
    public void setHOLIDAY_NM(String hOLIDAY_NM) {
        HOLIDAY_NM = hOLIDAY_NM;
    }
    public String getWEEK_WORK_HR() {
        return WEEK_WORK_HR;
    }
    public void setWEEK_WORK_HR(String wEEK_WORK_HR) {
        WEEK_WORK_HR = wEEK_WORK_HR;
    }
    public String getJO_FEINSR_SBSCRB_NM() {
        return JO_FEINSR_SBSCRB_NM;
    }
    public void setJO_FEINSR_SBSCRB_NM(String jO_FEINSR_SBSCRB_NM) {
        JO_FEINSR_SBSCRB_NM = jO_FEINSR_SBSCRB_NM;
    }
    public String getRCEPT_CLOS_NM() {
        return RCEPT_CLOS_NM;
    }
    public void setRCEPT_CLOS_NM(String rCEPT_CLOS_NM) {
        RCEPT_CLOS_NM = rCEPT_CLOS_NM;
    }
    public String getRCEPT_MTH_IEM_NM() {
        return RCEPT_MTH_IEM_NM;
    }
    public void setRCEPT_MTH_IEM_NM(String rCEPT_MTH_IEM_NM) {
        RCEPT_MTH_IEM_NM = rCEPT_MTH_IEM_NM;
    }
    public String getMODEL_MTH_NM() {
        return MODEL_MTH_NM;
    }
    public void setMODEL_MTH_NM(String mODEL_MTH_NM) {
        MODEL_MTH_NM = mODEL_MTH_NM;
    }
    public String getRCEPT_MTH_NM() {
        return RCEPT_MTH_NM;
    }
    public void setRCEPT_MTH_NM(String rCEPT_MTH_NM) {
        RCEPT_MTH_NM = rCEPT_MTH_NM;
    }
    public String getPRESENTN_PAPERS_NM() {
        return PRESENTN_PAPERS_NM;
    }
    public void setPRESENTN_PAPERS_NM(String pRESENTN_PAPERS_NM) {
        PRESENTN_PAPERS_NM = pRESENTN_PAPERS_NM;
    }
    public String getMNGR_NM() {
        return MNGR_NM;
    }
    public void setMNGR_NM(String mNGR_NM) {
        MNGR_NM = mNGR_NM;
    }
    public String getMNGR_PHON_NO() {
        return MNGR_PHON_NO;
    }
    public void setMNGR_PHON_NO(String mNGR_PHON_NO) {
        MNGR_PHON_NO = mNGR_PHON_NO;
    }
    public String getMNGR_INSTT_NM() {
        return MNGR_INSTT_NM;
    }
    public void setMNGR_INSTT_NM(String mNGR_INSTT_NM) {
        MNGR_INSTT_NM = mNGR_INSTT_NM;
    }
    public String getBASS_ADRES_CN() {
        return BASS_ADRES_CN;
    }
    public void setBASS_ADRES_CN(String bASS_ADRES_CN) {
        BASS_ADRES_CN = bASS_ADRES_CN;
    }
    

}

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트페이지</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">



const loadBtn = () => {
	 var dataArrayToSend = new Array();
        $.ajax({
            url:"http://openapi.seoul.go.kr:8088/개인키/json/GetJobInfo/1/9",
            type:"get",
            
            success:function(response){
            const jobList = response['GetJobInfo']['row']; 
              
               const ListBox = $("#listBox");
               ListBox.empty();
               
               $.each(jobList,function(key,value){
           		const elem = document.createElement('li');
           		var str = jobList[key].JO_REGIST_NO + " - "+ jobList[key].CMPNY_NM
           		$(elem).text(str);
           		
           		ListBox.append(elem);
           		
           		
           		// itemObj에 data insert
           		itemObj = new Object();
           		
           		itemObj.JO_REGIST_NO = jobList[key].JO_REGIST_NO;
           		itemObj.CMPNY_NM = jobList[key].CMPNY_NM;
           		itemObj.BSNS_SUMRY_CN = jobList[key].BSNS_SUMRY_CN;
           		itemObj.RCRIT_JSSFC_CMMN_CODE_SE = jobList[key].RCRIT_JSSFC_CMMN_CODE_SE;
           		itemObj.JOBCODE_NM = jobList[key].JOBCODE_NM;
           		itemObj.RCRIT_NMPR_CO = jobList[key].RCRIT_NMPR_CO;
           		itemObj.ACDMCR_CMMN_CODE_SE = jobList[key].ACDMCR_CMMN_CODE_SE;
           		itemObj.ACDMCR_NM = jobList[key].ACDMCR_NM;
           		itemObj.EMPLYM_STLE_CMMN_CODE_SE = jobList[key].EMPLYM_STLE_CMMN_CODE_SE;
           		itemObj.EMPLYM_STLE_CMMN_MM = jobList[key].EMPLYM_STLE_CMMN_MM;
           		itemObj.WORK_PARAR_BASS_ADRES_CN = jobList[key].WORK_PARAR_BASS_ADRES_CN;
           		itemObj.DTY_CN = jobList[key].DTY_CN;
           		itemObj.CAREER_CND_CMMN_CODE_SE = jobList[key].CAREER_CND_CMMN_CODE_SE;
           		itemObj.CAREER_CND_NM = jobList[key].CAREER_CND_NM;
           		itemObj.HOPE_WAGE = jobList[key].HOPE_WAGE;
           		itemObj.RET_GRANTS_NM = jobList[key].RET_GRANTS_NM;
           		itemObj.WORK_TIME_NM = jobList[key].WORK_TIME_NM;
           		itemObj.WORK_TM_NM = jobList[key].WORK_TM_NM;
           		itemObj.HOLIDAY_NM = jobList[key].HOLIDAY_NM;
           		itemObj.WEEK_WORK_HR = jobList[key].WEEK_WORK_HR;
           		itemObj.JO_FEINSR_SBSCRB_NM = jobList[key].JO_FEINSR_SBSCRB_NM;
           		itemObj.RCEPT_CLOS_NM = jobList[key].RCEPT_CLOS_NM;
           		itemObj.RCEPT_MTH_IEM_NM = jobList[key].RCEPT_MTH_IEM_NM;
           		itemObj.MODEL_MTH_NM = jobList[key].MODEL_MTH_NM;
           		itemObj.RCEPT_MTH_NM = jobList[key].RCEPT_MTH_NM;
           		itemObj.PRESENTN_PAPERS_NM = jobList[key].PRESENTN_PAPERS_NM;
           		itemObj.MNGR_NM = jobList[key].MNGR_NM;
           		itemObj.MNGR_PHON_NO = jobList[key].MNGR_PHON_NO;
           		itemObj.MNGR_INSTT_NM = jobList[key].MNGR_INSTT_NM;
           		itemObj.BASS_ADRES_CN = jobList[key].BASS_ADRES_CN;
           		
           		
           		 dataArrayToSend.push(itemObj);
           		
           		
               });
              // alert(dataArrayToSend);
               
               // 내부 api ajax 
               $.ajax({
           			url:"http://localhost:8090/jobData",
            		contentType : "application/json",
            		type:"post",
            
           			success:function(result){
            			var res = eval("("+result+")");
				
						if (res.success == "true") {
							alert("result success!");
							location.href = "http://localhost:8080/service/list";
						} else{alert("result fail");}
            		},
           			failure : function() {
           				alert("req_fail");
					}, data : JSON.stringify(dataArrayToSend)
	
               });
               // 내부 api ajax 끝
            } //open api ajax - success 끝
        
        });
        
        
        
        

}
	
</script>
</head>
<body>
	<ul id="listBox">
		<li>test page입니다.</li>
	</ul>
	<button id="click" onclick="loadBtn()">버튼</button>
</body>
</html>
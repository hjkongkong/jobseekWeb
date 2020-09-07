$(function(){
	const cardBody = $(".card-body");
	//const cardFooter = $(".card-footer");
	
	
	$("#getDatafromOPenAPI").click(function(){
		cardBody.append('<br/>');
		const elem = document.createElement('div');
        $(elem).text("데이터베이스 로딩중 잠시만 기다려주세요");
		cardBody.append(elem);
		
		var sendURL = "http://openapi.seoul.go.kr:8088/개인키/json/GetJobInfo/1/200";
		
		var dataArrayToSend = new Array();
	       $.ajax({
	           url: sendURL,
	           type:"get",
	           success:function(response){
	        	   const jobList = response['GetJobInfo']['row']; 
	               
	        	   $.each(jobList,function(key,value){
	           			
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
	               
	               // 내부 api ajax 
	               $.ajax({
	           			url:"http://localhost:8090/jobData",
	            		contentType : "application/json",
	            		type:"post",
	           			success:function(result){
	            			var res = eval("("+result+")");
					
							if (res.success == "true") {
								alert("result success!");
								
								cardBody.empty() // 자식 엘리먼트를 삭제한다.
								externalfunction(jobList);

								
							} else{alert("result fail");}
	            		},
	           			failure : function() {
	           				alert("req_fail");
						}, data : JSON.stringify(dataArrayToSend)
		
	               });// 내부 api ajax 끝
	            } //open api ajax - success 끝
	        
	        });	
	}); // getDatafromOPenAPI
	
	
	function externalfunction(jobList) {
		var addCode = '<div class="ajax-content"></div>';
		cardBody.append(addCode);
	
		console.log(jobList);
		
		const ajaxContent = $(".ajax-content");
		
		var setTable='<table id="jobDataTables" class="table table-bordered table-hover">'
+		'<thead>'
+			'<tr>'
+				'<th style="width: 20%">기업명</th>'
+				'<th style="width: 25%">모집내용</th>'
+				'<th style="width: 10%">근무지 위치</th>'
+				'<th style="width: 20%">급여조건</th>'
+				'<th style="width: 10%" >근무시간</th>'
+				'<th style="width: 15%">마감일</th>'
+			'</tr>'
+		'</thead>'
+	  '</table>'


		ajaxContent.append(setTable);
		
		var table = $('#jobDataTables').DataTable({
			 data: jobList,
			"columns" : [
				{"data": "CMPNY_NM"},
				{"data": "BSNS_SUMRY_CN"},
			    {"data": "MNGR_INSTT_NM"},
			    {"data": "HOPE_WAGE"},
			    {"data": "WORK_TIME_NM"},
			    {"data": "RCEPT_CLOS_NM"} 
			    ],
			"dom" : 'Bfrtip',
			"lengthChange": false,
			"buttons": ['copy', 'csv', 'excel', 'pdf', 'colvis']
	
		});
		table.buttons().container()
        .appendTo( '.ajax-content .col-md-6:eq(0)' );


	  }



	
});
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<html>
	<head>
		<!-- Meta -->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- End of Meta -->
		
		<!-- Page title -->
		<title>选课系统登陆页面</title>
		<!-- End of Page title -->
				
		<!-- Libraries -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
		<link type="text/css" href="${pageContext.request.contextPath}/css/smoothness/jquery-ui-1.7.2.custom.html" rel="stylesheet" />		
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.3.2.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyTooltip.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui-1.7.2.custom.min.js"></script>
		<script type="text/javascript">
	function login(){
		var ssn = $("#ssn").val();
		$.ajax({
			url:'${pageContext.request.contextPath}/userAction_login',
			type:'POST',
			dataType:'json',
			data:{ssn:ssn,password:$("#password").val(),type:$("select").val()},
			success:function(data){
				if(data.status=="ok"){
					if($("#select").val()=="Student"){
						window.location.href='${pageContext.request.contextPath}/student?'+ ssn +'';
					}else if($("#select").val()=="Professor"){
						window.location.href='${pageContext.request.contextPath}/professor?'+ ssn +''
					}else{
						window.location.href='${pageContext.request.contextPath}/admin';
					}
				}else{
					alert("账号或密码错误！或者身份错误！");
				}
			}
		}); 
		
	}
</script>
		<!-- End of Libraries -->	
	</head>
	<body>
	<div id="container">
		<div class="logo">
			<a href="#"><img src="assets/logo.png" alt="" /></a>
		</div>
		<center>
		<div id="box">
			<form action="index.html" method="POST">
			<div class="main">
				<label>请输入姓名：</label>
				<input name="username" id="ssn" /> 
			</div> <br/>
			<div class="main">
				<label>请输入密码：</label>
				<input type="password" name="password" id="password"/> 	
			</div>
			<br/>
			<div class="col-lg-10 mycheckbox checkbox">
                <select id="select">
                	<option>Student</option>
                	<option>Professor</option>
                	<option>admin</option>
                </select>
                <span>请选择身份</span> <br/><br/>
                <button type="button" onclick="login()">Login</button>
            </div>
			</form>
		</div>
		</center>
	</div>

	</body>
</html>
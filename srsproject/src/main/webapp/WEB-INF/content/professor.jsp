<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<html>
	<head>
		<!-- Meta -->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- End of Meta -->
		
		<!-- Page title -->
		<title>老师页面</title>
		<!-- End of Page title -->
		
		<!-- Libraries -->
		<link type="text/css" href="css/layout.css" rel="stylesheet" />	
		<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
		<script type="text/javascript" src="js/easyTooltip.js"></script>
		<script type="text/javascript" src="js/jquery-ui-1.7.2.custom.min.js"></script>
		<script type="text/javascript" src="js/jquery.wysiwyg.js"></script>
		<script type="text/javascript" src="js/hoverIntent.js"></script>
		<script type="text/javascript" src="js/superfish.js"></script>
		<script type="text/javascript" src="js/custom.js"></script>
		<script type="text/javascript">
			var str=location.href;
			var cc = str.substr(str.indexOf("?")+1);
			$(function() {
				$("#show").empty();
				var html = '<h1>欢迎您，' + cc + '</h1>'
				$("#show").append(html);
			})
			$(function() {
				$.ajax({
					url : 'sectionAction_getProfessorSection',
					type : 'POST',
					dataType : 'json',
					data : {ssn:cc},
					success : function(data) {
				$("#allSection").empty();
						for (var i = 0; i < data.length; i++) {
							var s = data[i];
							var se ="'" + s.sectionNo + "'";
							var html = '<tr><td>'
								+ s.sectionNo
								+ '</td><td>'
								+ s.dayOfWeek
								+ '</td><td>'
								+ s.timeOfDay
								+ '</td><td>'
								+ s.room
								+ '</td><td>'
								+ s.seatingCapacity
								+ '</td><td>'
								+ s.course
								+ '</td><td><a href="javascript:void(0);"  onclick="getDetail('+ se +')">查看</a></td></tr>';
								$("#allSection").append(html);
						}	
					}
				});
			})
			function getDetail(val) {
				document.getElementById("detail").style.display="";
				 $.ajax({
					url : 'sectionAction_getDetial',
					type : 'POST',
					dataType : 'json',
					data : {sectionNo:val},
					success : function(data) {
						$("#detailTable").empty();
						for (var i = 0; i < data.length; i++) {
							var s = data[i];
							var html = '<tr><td>'
								+ s.name
								+ '</td><td>'
								+ s.grade
								+ '</td></tr>';
								$("#detailTable").append(html);
						}	
					}
				}); 
			}
		</script>
		<!-- End of Libraries -->	
	</head>
	<body>
		<!-- Container -->
		<div id="container">
		
			<!-- Header -->
			<div id="header">
				
				<!-- Top -->
				<div id="top">
					<!-- Logo -->
					<div class="logo"> 
						<a href="#" title="Administration Home" class="tooltip"><img src="assets/logo.png" alt="Wide Admin" /></a> 
					</div>
					<!-- End of Logo -->
					
					<!-- Meta information -->
					<div class="meta">
						<p>欢迎来到我的选课系统！</p>
						<ul>
							<li><a href="#" title="End administrator session" class="tooltip"><span class="ui-icon ui-icon-power"></span>Logout</a></li>
							<li><a href="#" title="Change current settings" class="tooltip"><span class="ui-icon ui-icon-wrench"></span>Settings</a></li>
							<li><a href="#" title="Go to your account" class="tooltip"><span class="ui-icon ui-icon-person"></span>My account</a></li>
						</ul>	
					</div>
					<!-- End of Meta information -->
				</div>
				<!-- End of Top-->
			</div>
			<!-- End of Header -->
			
			<!-- Background wrapper -->
			<div id="bgwrap">
		
				<!-- Main Content -->
				<div class="container">
						<div id="show"></div>
		<hr/>
		<h2>所教课程</h2>
		<table class="fullwidth" cellpadding="0" cellspacing="0" border="0">
			<thead>
				<tr>
					<td>sectionNo</td>
					<td>dayOfWeek</td>
					<td>timeOfDay</td>
					<td>room</td>
					<td>剩余人数</td>
					<td>course</td>
					<td>具体选课学生</td>
				</tr>
			</thead>
			<tbody id="allSection">
				
			</tbody>
		</table>
		<div id="detail" style="display:none;">
			<h2>选课情况</h2>
			<table class="fullwidth" cellpadding="0" cellspacing="0" border="0">
			<thead>
				<tr>
					<td>studentName</td>
					<td>grade</td>
				</tr>
			</thead>
			<tbody id="detailTable">
				
			</tbody>
			</table>
			</div>
		</div><br/><br/><br/>
		<!-- End of Container -->
		
		<!-- Footer -->
		<div id="footer">
			<p class="mid">
				<a href="#" title="Top" class="tooltip">Top</a>&middot;<a href="index" title="Main Page" class="tooltip">Home</a>&middot;<a href="index" title="End administrator session" class="tooltip">Logout</a>
			</p>
			<p class="mid">
				<!-- Change this to your own once purchased -->
				&copy;scc38514.
				<!-- -->
			</p>
		</div>
		<!-- End of Footer -->


	</body>
</html>



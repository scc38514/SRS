<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<html>
	<head>
		<!-- Meta -->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- End of Meta -->
		
		<!-- Page title -->
		<title>学生页面</title>
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
					url : 'planOfStudyAction_findAllPlan',
					type : 'POST',
					dataType : 'json',
					data : {ssn:cc},
					success : function(data) {
						$("#planCourse").empty();
						for (var i = 0; i < data.length; i++) {
							var c = data[i];
							var html = '<tr><td>'
								+ c.courseNo
								+ '</td><td>'
								+ c.courseName
								+ '</td><td>'
								+ c.credits
								+ '</td></tr>';
								$("#planCourse").append(html);
									}	
							}
					});
				})
			//查询所有已选课程
			$(function() {
			$.ajax({
			url : 'sectionAction_getBySsn',
			type : 'POST',
			dataType : 'json',
			data : {ssn:cc},
			success : function(data) {
				$("#hasSection").empty();
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
						+ s.professor
						+ '</td><td>'
						+ s.course
						+ '</td><td>'
						+ s.grade
						+ '</td><td><a href="javascript:void(0);"  onclick="addTranscript('+ se +')">退选</a></td></tr>';
						$("#hasSection").append(html);
					}	
				}
			});
			})
			//查询所有可选课程
			$(function() {
			$.ajax({
			url : 'sectionAction_findAllSection',
			type : 'POST',
			dataType : 'json',
			data : {},
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
						+ s.professor
						+ '</td><td>'
						+ s.course
						+ '</td><td><a href="javascript:void(0);"  onclick="addTranscript('+ se +')">选课</a></td></tr>';
						$("#allSection").append(html);
					}	
				}
			});
		})
			function addTranscript(val){
			$.ajax({
			url:'sectionAction_addTranscript',
			type:'POST',
			dataType : 'json',
			data:{ssn:cc,sectionNo:val},
			success:function(data){
				if(data.status=="ok"){
					alert("操作成功！");
					window.location.reload();
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
				<h1>PlanOfStudy</h1>
					<table class="fullwidth" cellpadding="0" cellspacing="0" border="0">
					<thead>
						<tr>
							<td>courseNo</td>
							<td>courseName</td>
							<td>credits</td>
						</tr>
					</thead>
					<tbody id="planCourse">

					</tbody>
				</table>
				<h1>已选课程</h1>
				<table class="fullwidth" cellpadding="0" cellspacing="0" border="0">
					<thead>
						<tr>
							<td>sectionNo</td>
							<td>dayOfWeek</td>
							<td>timeOfDay</td>
							<td>room</td>
							<td>professor</td>
							<td>course</td>
							<td>grade</td>
							<td>select</td>
						</tr>
					</thead>
					<tbody id="hasSection">
					
					</tbody>
				</table>
				<h1>All Section</h1>
				<table class="fullwidth" cellpadding="0" cellspacing="0" border="0">
					<thead>
						<tr>
							<td>sectionNo</td>
							<td>dayOfWeek</td>
							<td>timeOfDay</td>
							<td>room</td>
							<td>seatingCapacity</td>
							<td>professor</td>
							<td>course</td>
							<td>select</td>
						</tr>
					</thead>
					<tbody id="allSection">
				
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



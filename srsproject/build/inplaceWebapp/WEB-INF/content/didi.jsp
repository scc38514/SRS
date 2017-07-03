<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<html>
	<head>
		<!-- Meta -->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- End of Meta -->
		
		<!-- Page title -->
		<title>管理员页面</title>
		<!-- End of Page title -->
		
		<!-- Libraries -->
		<link type="text/css" href="${pageContext.request.contextPath}/css/layout.css" rel="stylesheet" />	
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.3.2.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyTooltip.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui-1.7.2.custom.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.wysiwyg.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/hoverIntent.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/superfish.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/custom.js"></script>
		<script type="text/javascript">
			//查询所有课程
			$(function() {
				$.ajax({
					url : '${pageContext.request.contextPath}/courseAction_findAllCourse',
					type : 'POST',
					dataType : 'json',
					data : {},
					success : function(data) {
						$("#allCourse").empty();
						for (var i = 0; i < data.length; i++) {
							var c = data[i];
							var ca ="'" + c.courseNo + "'";
							var prerequisite = [];
							if(c.prerequisite.length!=0){
								prerequisite = c.prerequisite[0].courseNo;
							}
							var html = '<tr><td>'
								+ c.courseNo
								+ '</td><td>'
								+ c.courseName
								+ '</td><td>'
								+ c.credits
								+ '</td><td>'
								+ prerequisite
								+ '</td><td><a href="javascript:void(0);"  onclick="addSection('+ ca +')">addToSection</a>'
								+ '</td><td><a href="javascript:void(0);"  onclick="delectCourse('+ ca +')">delect</a></td></tr>';
								$("#allCourse").append(html);
						}	
					}
				});
			})
			//查询所有可选课程
			$(function() {
				$.ajax({
					url : '${pageContext.request.contextPath}/sectionAction_findAllSection',
					type : 'POST',
					dataType : 'json',
					data : {},
					success : function(data) {
						$("#allSection").empty();
						for (var i = 0; i < data.length; i++) {
							var s = data[i];
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
								+ '</td><td><a href="#">删除</a></td></tr>';
								$("#allSection").append(html);
						}	
					}
				});
			})
			//添加课程
			function addCourse(){
				$.ajax({
					url:'${pageContext.request.contextPath}/courseAction_addCourse',
					type:'POST',
					dataType : 'json',
					data:{courseNo:$("#courseNo").val(),courseName:$("#courseName").val(),credits:$("#credits").val(),prerequisite:$("#prerequisite").val()},
					success:function(data){
						if(data.status=="ok"){
							alert("添加成功！");
							window.location.reload();
						}
					}
				});
			}
			//删除课程
			function delectCourse(val){   
				$.ajax({
					url:'${pageContext.request.contextPath}/courseAction_deleteCourse',
					type:'POST',
					dataType : 'json',
					data:{courseNo:val},
					success:function(data){
						if(data.status=="ok"){
							alert("删除成功！");
							window.location.reload();
						}
					}
				}) 
			}
			//添加Section
			function addSection(val){
				window.location.href='${pageContext.request.contextPath}/addSection?' + val + '';
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
					<div class="container">
		<table class="table table-bordered">
		<tr>
			<td><h2>Add Course</h2></td>
		</tr>
		<tr>
			<td>
				<div class="container">
					<div class="row">
						<div class="col-md-4">
						</div>
						<div class="form-group col-md-4">
							<label>courseNo:</label> 
							<input class="form-control" type="text" id="courseNo" />
							<label>courseName:</label> 
							<input class="form-control" type="text" id="courseName" /> 
							<label>credits:</label>
							<input class="form-control" type="text" id="credits" /> 
							<label>prerequisite:</label> 
							<input class="form-control" type="text" id="prerequisite" />
							<button onclick="addCourse()" class="btn btn-default btn-lg btn-block">add</button>
						</div>
						<div class="col-md-4">
						</div>
					</div>
				</div>
			</td>
		</tr>
		<tr>
			<td><h2>All Course</h2></td>
		</tr>
		<tr>
			<td>
				<table class="fullwidth" cellpadding="0" cellspacing="0" border="0">
					<thead>
						<tr>
							<td>courseNo</td>
							<td>courseName</td>
							<td>credits</td>
							<td>prerequisite</td>
							<td>addToSection</td>
							<td>delect</td>
						</tr>
					</thead>
					<tbody id="allCourse">

					</tbody>
				</table>
			</td>
		</tr>
		<tr>
			<td><h2>All Section</h2></td>
		</tr>
		<tr>
			<td>
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
							<td>delete</td>
						</tr>
					</thead>
					<tbody id="allSection">
						
					</tbody>
				</table>
			</td>
		</tr>
	</table>
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
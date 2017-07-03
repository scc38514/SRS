<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">    
<html>
	<head>
		<!-- Meta -->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- End of Meta -->
		
		<!-- Page title -->
		<title>addSection</title>
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
	//查询所有教师
	$(function() {
		$.ajax({
			url : '${pageContext.request.contextPath}/personAction_findAllProfessor',
			type : 'POST',
			dataType : 'json',
			data : {},
			success : function(data) {
				$("#allProfessor").empty();
				for (var i = 0; i < data.length; i++) {
					var p = data[i];
					var ps ="'" + p.ssn + "'";
					var html = '<tr><td>'
						+ p.ssn
						+ '</td><td>'
						+ p.name
						+ '</td><td>'
						+ p.title
						+ '</td><td>'
						+ p.department
						+ '</td><td><a href="javascript:void(0);"  onclick="updateProfessor('+ ps +')">updateProfessor</a>'
						+ '</td><td><a href="javascript:void(0);"  onclick="delectProfessor('+ ps +')">delect</a></td></tr>';
						$("#allProfessor").append(html);
				}	
			}
		});
	})
	//添加教师
	function addProfessor(){
		$.ajax({
			url:'${pageContext.request.contextPath}/personAction_addProfessor',
			type:'POST',
			dataType : 'json',
			data:{ssn:$("#ssn").val(),name:$("#name").val(),title:$("#title").val(),department:$("#department").val()},
			success:function(data){
				if(data.status=="ok"){
					alert("添加成功！");
					window.location.reload();
				}
			}
		});
	}
	//删除教师
	function delectProfessor(val){   
		$.ajax({
			url:'${pageContext.request.contextPath}/personAction_deleteProfessor',
			type:'POST',
			dataType : 'json',
			data:{ssn:val},
			success:function(data){
				if(data.status=="ok"){
					alert("删除成功！");
					window.location.reload();
				}
			}
		}) 
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
								<div class="row">
			<div class="col-md-4">
			</div>
			<div class="form-group col-md-4">
				<h1>Add Section</h1>
				<label>ssn:</label> 
				<input class="form-control" type="text" id="ssn" />
				<label>name:</label> 
				<input class="form-control" type="text" id="name" /> 
				<label>title:</label>
				<input class="form-control" type="text" id="title" />
				<label>department:</label>
				<input class="form-control" type="text" id="department" />
				<button onclick="addProfessor()" class="btn btn-default btn-lg btn-block">add</button>
			</div>
			<div class="col-md-4">
			</div>
		</div>
		<h2>All Professor</h2>
		<table class="fullwidth" cellpadding="0" cellspacing="0" border="0">
			<thead>
				<tr>
					<td>ssn</td>
					<td>name</td>
					<td>title</td>
					<td>department</td>
					<td></td>
					<td></td>
				</tr>
			</thead>
			<tbody id="allProfessor">
			
			</tbody>
			
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



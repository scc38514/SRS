<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<html>
	<head>
		<!-- Meta -->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- End of Meta -->
		
		<!-- Page title -->
		<title>addSection</title>
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
	function addSection(){
		$.ajax({
			url:'sectionAction_addSection',
			type:'POST',
			dataType : 'json',
			data:{courseNo:cc,sectionNo:$("#sectionNo").val(),dayOfWeek:$("#dayOfWeek").val(),timeOfDay:$("#timeOfDay").val(),room:$("#room").val(),seatingCapacity:$("#seatingCapacity").val(),professorSsn:$("#professor").val(),semester:$("#semester").val()},
			success:function(data){
				if(data.status=="ok"){
					alert("添加成功！");
					window.location.href='admin';
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

				<center><h1>Add Section</h1>
				<label>sectionNo:</label> 
				<input class="form-control" type="text" id="sectionNo" /><br><br>
				<label>dayOfWeek:</label> 
				<input class="form-control" type="text" id="dayOfWeek" /><br><br> 
				<label>timeOfDay:</label>
				<input class="form-control" type="text" id="timeOfDay" /><br><br>
				<label>room:</label>
				<input class="form-control" type="text" id="room" /><br><br>
				<label>seatingCapacity:</label>
				<input class="form-control" type="text" id="seatingCapacity" /><br><br>
				<label>professor:</label>
				<input class="form-control" type="text" id="professor" /> <br><br>
				<label>semester:</label> 
				<input class="form-control" type="text" id="semester" /><br><br>
				<button onclick="addSection()" class="btn btn-default btn-lg btn-block">add</button>
				</center>
			</div>
			<div class="col-md-4">
			</div>
		</div>
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



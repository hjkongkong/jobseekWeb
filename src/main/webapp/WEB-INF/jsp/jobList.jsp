<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<script src="../resources/plugins/jquery/jquery.min.js"></script>
<%@include file="include/meta.jsp"%>
<body class="hold-transition layout-top-nav">
	<script type="text/javascript" src="../resources/js/jobList.js"></script>
	<div class="wrapper">
		<!-- Navbar -->
		<%@include file="include/navbar.jsp"%>

		<!-- Main Sidebar Container -->
		<!--  include file="include/sidebar.jsp" -->

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<div class="container">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1>취업 정보</h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">Home</a></li>
								<li class="breadcrumb-item active">Pace</li>
							</ol>
						</div>
					</div>
				</div>
				<!-- /.container-header -->
			</section>

			<!-- Main content -->
			<section class="content">
				<div class="container">

					<!-- Default box -->
					<div class="card">
						<div class="card-header">
							<h3 class="card-title">Title</h3>
						</div>
						<div class="card-body">
							선택된 조건 정보에 따라 데이터를 가져옵니다! <br /><br />
							<div class="row">
								<div class="col-xs-12 text-center" style="margin: auto;">
									<button type="button" class="btn btn-default btn-lrg ajax"
										title="Ajax Request" id="getDatafromOPenAPI">
										<i class="fa fa-spin fa-sync-alt"></i>&nbsp; 데이터 불러오기
						
									</button>
								</div>
							</div>
							<div class="ajax-content"></div>
						

						</div>
						<!-- /.card-body -->
						<div class="card-footer">&nbsp;</div>
						<!-- /.card-footer-->
					</div>
					<!-- /.card -->
				</div>
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->


		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
			<div class="p-3">
				<h5>Title</h5>
				<p>Sidebar content</p>
			</div>
		</aside>
		<!-- /.control-sidebar -->

		<!-- Main Footer -->
		<%@include file="include/footer.jsp"%>

	</div>
	<!-- ./wrapper -->

	<!-- REQUIRED SCRIPTS -->
	<%@include file="include/script.jsp"%>
</body>
</html>

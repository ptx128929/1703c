<%@ page language="java" contentType="text/html; charset=UTF-8"
  
       pageEncoding="UTF-8"%>  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap3/css/bootstrap-theme.min.css">
<script src="<%=request.getContextPath() %>/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="<%=request.getContextPath() %>/bootstrap3/js/bootstrap.min.js"></script>
</head>
<body>
 <title>CMS后台管理系统</title>

    <!-- Bootstrap core CSS-->
    <link href="/libs/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="/libs/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template-->
    <link href="/libs/sb-admin/sb-admin.css" rel="stylesheet">

  </head>

  <body id="page-top">

	<!-- 后台管理系统顶部 -->
 	<jsp:include page="_inc_top.jsp"/>

    <div id="wrapper">

 		<!-- 后台管理系统左部菜单 -->
 		<jsp:include page="_inc_left.jsp"/>

      <div id="content-wrapper">

        <div class="container-fluid">

          <!-- Breadcrumbs--> 
          <ol class="breadcrumb">
            <li class="breadcrumb-item">
              <a href="#">文章管理</a>
            </li>
           

          <!-- Icon Cards-->
          <br/>
          <br/>
          <br/>
          
        <!-- /.container-fluid -->

        <!-- Sticky Footer -->
        <footer class="sticky-footer">
          <div class="container my-auto">
            <div class="copyright text-center my-auto">
              <span>Copyright Â© Your Website 2019</span>
            </div>
          </div>
        </footer>

      </div>
      <!-- /.content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fas fa-angle-up"></i>
    </a>

    <!-- Bootstrap core JavaScript-->
    <script src="/libs/jquery/jquery.min.js"></script>
    <script src="/libs/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="/libs/sb-admin/sb-admin.min.js"></script>
  </body>
</body>
</html>
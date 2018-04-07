<%@ page language="java" import="java.util.*"  pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">

	<head>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta name="viewport" content="width=device-width,initial-scale=0.0,user-scalable=no,minimum-scale=1.0,maximum-scale=1.0" />
		<meta name="keywords" content="" />
		<meta name="description" content="" />
		<meta name="author" content="" />
		<meta name="apple-mobile-web-app-capable" content="yes" />
		<meta name="apple-mobile-web-app-status-bar-style" content="black" />
		<meta name="format-detection" content="telephone=no" />
		<link href="src/css/public.css" type="text/css" rel="stylesheet" />
		<link href="src/css/index.css" type="text/css" rel="stylesheet" />
		<link href="src/css/center.css" type="text/css" rel="stylesheet" />
		<script type="text/javascript" src="src/js/jquery-1.8.0.min.js"></script>
		<title>登录</title>
	</head>

	<body style="background-color: #f3f3f3;">
		<header class="product-hd">
			<a href="javascript:history.go(-1);" class="pre"></a>登录
		</header>
		<form action="UserServlet" method="post">
		<input type="hidden" name="action" value="login">
			<div class="password-change">
				<div class="xg-con">
					<input name="LoginName" maxlength="11" placeholder="请输入手机号码" class="gaimi" />
				</div>
			</div>
			<div class="password--change">
				<div class="xg-con">
					<input name="LoginPwd" type="password" placeholder="请输入登录密码" class="gaimi-ma" />
				</div>

				<div class="submit--con">
					<div class="login-button"><input name="" type="submit" value="登录" /></div>
				</div>
				<div class="submit--con set-margin">
					<div class="login-button"><a name="" href="register.jsp" class="regist">注册</a></div>
				</div>
				<p class="forget-password-con">
					<a href="retrievePassword.jsp" class="forget-password">忘记密码？</a>
				</p>
		</form>
		<div class="user-touxiang-con">
			<div class="user-touxiang weixin"><img src="src/images/weixin.png"></div>
			<p class="weixin-txt">微信登录</p>
		</div>
	</body>

</html>
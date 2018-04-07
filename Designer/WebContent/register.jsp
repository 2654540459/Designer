<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="content-type" content="text/html;charset=utf-8"/>
<meta name="viewport" content="width=device-width,initial-scale=0.0,user-scalable=no,minimum-scale=1.0,maximum-scale=1.0"/>
<meta name="keywords" content=""/>
<meta name="description" content=""/>
<meta name="author" content=""/>
<meta name="apple-mobile-web-app-capable" content="yes"/>
<meta name="apple-mobile-web-app-status-bar-style" content="black"/>
<meta name="format-detection" content="telephone=no"/>
<link href="src/css/public.css" type="text/css" rel="stylesheet"/>
<link href="src/css/index.css" type="text/css" rel="stylesheet"/>
<link href="src/css/center.css" type="text/css" rel="stylesheet"/>
<script type="text/javascript" src="src/js/jquery-1.8.0.min.js"></script>
<script src="src/js/jquery-1.9.0.min.js" type="text/javascript"></script>
<script type="text/javascript" src="src/js/public.js"></script> 
<title>注册</title>
</head>
<body style="background-color: #f3f3f3;">
<header class="product-hd"> <a href="javascript:history.go(-1);" class="pre"></a>注册
</header>
<form>
<div class="password-change">
  <div class="xg-con">
    <input name="" maxlength="11" placeholder="请输入手机号码" class="gaimi"/>
  </div>
</div>
<div class="password--change">
  <div class="xg-con">
    <input name="" placeholder="请输入验证码" class="gaimi-ma"/>
    <span class="get-ma">获取验证码</span></div>
</div>
<div class="password-change">
  <div class="xg-con teshu">
    <input name="" placeholder="请输入新密码" id="passwd" class="gaimi"/>
    <span class="xianshi" onclick="togglePwd(this)" id="showPs">隐藏</span></div>
</div>
<p class="i-agree">我已同意用户注册协议</p>
<div class="submit--con">
  <div class="submit"><input class="regist-submit" name="" type="submit" disabled="disabled" value="提交"/></div>
</div>
</form>
</body>
</html>

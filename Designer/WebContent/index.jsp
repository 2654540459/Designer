<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
		<link href="src/css/mobilebone.css" type="text/css" rel="stylesheet" />
		<script src="src/js/jquery-1.8.0.min.js"></script>
		<script src="src/js/mobilebone.js"></script>
		<script src="src/js/swipe.js"></script>
		<title>首页</title>
	</head>

	<body class='index-con'>
		<!--作品页开始-->
		<div id="page2" class="page out">
			<header class="product-hd index-header">
				<a href="#page1" class="jiahao-png slideLink" data-ajax="true"></a>
			</header>
			<a style="display: block;" href="productDetail.html">
				<div class='header'>
					<img src='src/images/a1.png' />
				</div>
				<h3 class='title'>优秀的作品</h3>
				<div class="product-inf-box">
					<p class='content'>设计是 把一种设想 通过合理的规划 周密的计划 通过各种感觉形式传达出来的过程。人类通过劳动改造世界，创造文明，创造物质财富和精神财富，而最基础、最主要的创造活动是造物。设计便是造物活动进行预先的计划，可以把任何造物活动的计划技术和计划过程理解为设计。</p>
				</div>
				<p class='author'>作者</p>
			</a>
			<div class='footer clearfix'>
				<div class='left-count fl'>
					<a href="commend.html" class='info'>28</a><span class='heart'>9</span></div>
				<span class='right-count fr'>4.6w</span>
			</div>
		</div>
		<!--作品页结束-->
		<!--个人中心开始-->
		<div id="page1" class="page out center-con">
			<header class="product-hd commend-header" style="background: #313131;">
				<a href="#page2" class="pre slideLink" data-rel="back" data-ajax="true"></a>
				<a href="shouhuodizhi.html" class="jiahao-png"></a>
			</header>
			<div class="user-touxiang-con">
				<div class="user-touxiang"><img src="src/images/link.jpg" /></div>
			</div>
			
			<%
						if (session.getAttribute("user") == null) {
			%>
			<p class="center-text-link set-font"><a href="login.jsp">登录</a></p>
			<%
						}else{
			%>
			<p class="center-text-link set-font"><a href="login.jsp">${user.userName }</a></p>
			<%
						}
			%>
			<p class="center-text-link first-text">
				<a href="message.html">消息</a>
			</p>
			<p class="center-text-link">
				<a href="#">收藏</a>
			</p>
			<p class="center-text-link">
				<a href="order.html">订单</a>
			</p>
			<p class="center-text-link">
				<a href="address.html">地址</a>
			</p>
		</div>
		<!--个人中心结束-->
		<script>
			/**
			 * 点击喜欢
			 * */
			$('.heart').click(function() {
				if($('.heart').hasClass('hover-heart')) {
					$(this).removeClass('hover-heart');
				} else {
					$(this).addClass('hover-heart');
				}
			})
		</script>
		<script>
			/**
			 * 个人中心页swipeRight手指滑动
			 * */
			$('#page1').rhuiSwipe('swipeRight', function(event) {
				$(this).children('header').children('.slideLink')[0].click();
			}, {
				// 可选参数
				isStopPropagation: false,
				isPreventDefault: false,
				triggerOnMove: true
			});
			/**
			 * 作品页swipeLeft手指滑动
			 * */
			$('#page2').rhuiSwipe('swipeLeft', function(event) {
				var temp = $(this).children('header').children('.slideLink');
				temp.attr('href', '#page1');
				temp[0].click();
			}, {
				// 可选参数
				isStopPropagation: false,
				isPreventDefault: false,
				triggerOnMove: true
			});
		</script>
		<script>
			Mobilebone.captureLink = false; //关闭全局无刷新跳转
		</script>
	</body>

</html>
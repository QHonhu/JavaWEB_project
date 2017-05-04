<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <mate http-equip="Content-Type" content="text/html">
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
    <h1>购买人气组合</h1>
    <form method="post">
    <div style="float:left">
    <img src="1.jpg"/><br>
    <center><div id='phonecost'>￥799.00</div></center>
    </div>
    <img style="float:left" src="addsign.png" width="70Px" height="70PX"/>
    <div style="float:left">
    <img src ="2.jpg"/><br>
    <center>
    <input type="checkbox" name="ck1" value="1"/>
    <div id='memorycost'>￥49.00</div>
    </center>
    </div>
    
    <img style="float:left" src="addsign.png" width="70Px" height="70PX"/>
    <div style="float:left">
    <img src ="3.jpg"/><br>
    <center>
    <input type="checkbox" name="ck2" value="1"/>
    <div id='bulecost'>￥19.9</div>
    </center>
    </div>
    
    
    <img style="float:left" src="addsign.png" width="70Px" height="70PX"/>
    <div style="float:left">
    <img src ="9.jpg"/><br>
    <center>
    <input type="checkbox" name="ck3" value="1"/>
    <div id='butterycost'>￥98.00</div>
    </center>
    </div>
    
    <img style="float:left" src="addsign.png" width="70Px" height="70PX"/>
    <div style="float:left">
    <img src ="5.jpg"/><br>
    <center>
    <input type="checkbox" name="ck4" value="1"/>
    <div id='memorycost'>￥69.00</div>
    </center>
    </div>
    </form>
    </p>
   </body>
</html>

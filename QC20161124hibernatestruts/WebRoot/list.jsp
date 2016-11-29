<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
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
    <table>
    	<tr>
    		<th>编号</th>
    		<th>id</th>
    		<th>姓名</th>
    		<th>密码</th>
    		<th>生日</th>
    		<th>操作</th>
    	</tr>
    	<c:forEach items="${requestScope.list}" var="us" varStatus="count">
    		<tr>
    		
    		<th>${count.count }</th>
    		<th>${us.id }</th>
    		<th>${us.username }</th>
    		<th>${us.pwd }</th>
    		<th>
    			<fmt:formatDate value="${us.birthday}"
    			pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
    		</th>
    		<th>
    			<a href="${pageContext.request.contextPath }/new/action!del？id=${us.id }">删除</a>
    		</th>
    		
    	</tr>
    	</c:forEach>
    </table>
  </body>
</html>

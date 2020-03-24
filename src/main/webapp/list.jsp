<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>

		<a href="add.jsp">添加</a>
		<input type="button" value="批量删除" id="btn">
		<tr>
			<th><button id="qx">全选</button></th>
			<th>编号</th>
			<th>品牌</th>
			<th>分类</th>
			<th>发布时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${page.list }" var="g">
			<tr>
				<th><input type="checkbox"></th>
				<td>${g.id }</td>
				<td>${g.name }</td>
				<td>${g.tname }</td>
				<td>${g.date }</td>
				<td><a href="update.jsp?id=${g.id }">修改</a></td>
			</tr>
		</c:forEach>
		<td colspan="6"><a href="?pageNum=1">首页</a> <a
			href="?pageNum=${page.pageNum-1 < 1?page.pageNum:page.pageNum-1 }">上一页</a>
			<a
			href="?pageNum=${page.pageNum+1 > page.pages ?page.pageNum:page.pageNum+1 }">下一页</a>
			<a href="?pageNum=${page.pages }">尾页</a></td>
	</table>

</body>
<script type="text/javascript">
	/*全选*/
	$("#qx").click(function() {
		$("[name = 'id']").attr("checked", true);
	});
	
	/* 批量删除 */
	$("#btn").click(function() {
		var ids = "";
		$(":checkbox:gt(2):checked").each(function() {
			ids += "," + this.value;
		});
		ids = ids.substring(1);
		alert(ids);
		
		$.post("del", {
			"ids" : ids
		}, function(obj) {
			if (obj) {
				alert("删除成功了");
				location.href = "list"
			} else {
				alert("删除失败了");
			}

		}, "json");
	});
</script>
</html>
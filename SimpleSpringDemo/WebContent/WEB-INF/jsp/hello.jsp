<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function display(){
		form = document.getElementById("formName");
	    document.getElementById("formName").action = "showName";
	    document.getElementById("formName").submit();
		/* form.action.value = "showName";
		form.submit(); */
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form id="formName" method="get" action="${pageContext.request.contextPath}/hello.do" >
<label>Enter name</label><textarea rows="1" cols="15"></textarea>
<button type="submit" value="submit" onclick="javascripts:display();">Enter</button>
<h2>${message}</h2>
<h2>${messageNew}</h2>
<h1>${hello}</h1>
<h2>${pageContext.request.contextPath}</h2>
</form:form>
</body>
</html>
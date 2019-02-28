<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Student Confirmation Page</h3>
<br>
The Student is confirmed:${student.firstName}
<br>
${student.lastName}
<br> 
Country:${student.country}
<br>
Favourite Language::${student.favouriteLanguage}
<br>
Operating System::
<c:forEach items="${student.operatingSystem}" var="temp">
${temp}
</c:forEach>
</body>
</html>
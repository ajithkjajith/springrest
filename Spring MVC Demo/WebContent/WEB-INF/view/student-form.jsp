<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
First Name:<form:input path="firstName" />
<br><br>
Last Name:<form:input path="lastName" />
<br><br>
Country:<form:select path="country">
<form:options  items="${student.countryOptions}"/>

			<%-- <form:option value="New Zealand" label="New Zealand" />
			<form:option value="Australia" label="Australia" />
			<form:option value="India" label="India" />
			<form:option value="SriLanka" label="SriLanka" /> --%>
		</form:select>
		<br><br>
		Favourite Language:
	Java:	<form:radiobutton path="favouriteLanguage" value="Java" />
	C#:	<form:radiobutton path="favouriteLanguage" value="C#" />
	Salesforce:	<form:radiobutton path="favouriteLanguage" value="Salesforce" />
	Python:	<form:radiobutton path="favouriteLanguage" value="Python" />
		<br><br>
		Operating System:
		Linux:<form:checkbox path="operatingSystem" value="Linux" />
		Mac OS:<form:checkbox path="operatingSystem" value="Mac OS" />
		Windows:<form:checkbox path="operatingSystem" value="Windows" />
		<br><br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>
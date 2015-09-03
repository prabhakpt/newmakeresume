<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html> --%>

<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resume</title>
</head>
<body>
    <div align="center">
        <form:form action="userResume" method="POST" commandName="ResumeData">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Spring MVC Form Demo - Registration</h2></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>Enter Initial:</td>
                    <td><form:input path="initial" /></td>
                </tr>
                <tr>
                    <td>E-mail:</td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td>Phone Number:</td>
                    <td><form:input path="phoneNumber" /></td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td><form:textarea path="address"  /></td>
                </tr>
                <tr>
                	<td colspan="0">Acadamic Qualification</td>
                </tr>
                <tr>
                	<table border="1">
                		<tr>
                			<td>Degree Course</td>
                			<td>Board / University</td>
                			<td>Passing year </td>
                			<td>Agregate(%)</td>
                		</tr>
                		<tr>
                		<td><form:input path="course1"/>
                		<td><form:input path="board1"/>
                		<td><form:input path="year1"/>
                		<td><form:input path="agregate1"/>
                		</tr>
                		
                		<tr>
                		<td><form:input path="course2"/></td>
                		<td><form:input path="board2"/>
                		<td><form:input path="year2"/>
                		<td><form:input path="agregate2"/>
                		</tr>
                		
                		<tr>
                		<td><form:input path="course3"/></td>
                		<td><form:input path="board3"/>
                		<td><form:input path="year3"/>
                		<td><form:input path="agregate3"/>
                		</tr>
                		
                		<tr>
                		<td><form:input path="course4"/></td>
                		<td><form:input path="board4"/>
                		<td><form:input path="year4"/>
                		<td><form:input path="agregate4"/>
                		</tr>
                	</table>
                	</tr>
                		<tr>
                			<td>Technical skills</td>
                		</tr>
                		<tr>
                		<table>
                		<tr>
                			<td>Programming Languages</td>
                			<td><form:input path="programmingLang"/>
                		</tr>
                		<tr>
                			<td>Operating Systems</td>
                			<td><form:input path="os"/>
                		</tr>
                		<tr>
                			<td>Web Developing Tools</td>
                			<td><form:input path="webdevlang"/>
                		</tr>
                		<tr>
                			<td>DataBases</td>
                			<td><form:input path="db"/>
                		</tr>
                		</table>
                		</tr>
                		<tr>
                			<td>Personal Information</td>
            			</tr>
            			<tr>
            				<table>
            					<tr>
            						<td>Fathers Name</td>
            						<td><form:input path="father"/>
            					</tr>
            					<tr>
            						<td>Mothers Name</td>
            						<td><form:input path="mother"/>
            					</tr>
            					<tr>
            						<td>Gender</td>
            						<td><form:input path="gender"/>
            					</tr>
            					<tr>
            						<td>Date Of Birth</td>
            						<td><form:input path="dateOfBirth"/>
            					</tr>
            					<tr>
            						<td>Marital Status</td>
            						<td><form:input path="maritalstatus"/>
            					</tr>
            					<tr>
            						<td>Nationality</td>
            						<td><form:input path="nationality"/>
            					</tr>
            					<tr>
            						<td>Emergency Contact Number</td>
            						<td><form:input path="emergencyNumb"/>
            					</tr>
            					<tr>
            						<td>Languages Known </td>
            						<td><form:input path="languesKnown"/>
            					</tr>
            				</table>
            			</tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Get Resume" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>
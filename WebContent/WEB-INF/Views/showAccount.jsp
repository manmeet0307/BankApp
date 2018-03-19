<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="lbl.title"/></title>
</head>
<body>
<h1>PS :Bank Account Details</h1>
<!-- <p>Account # : ${param.accountNo}<br>
Account HolderName : ${param.accountHolderName}<br>
Balance : ${param.balance}</p>-->

<!-- UsingModel -->

<!-- <p>Account # : ${account.accountNo}<br>
Account HolderName : ${account.accountHolderName}<br>
Balance : ${account.balance}
</p>-->

<!-- Using spring tags -->
<p><spring:message code="lbl.accountNo"/>: ${account.accountNo}<br>
<spring:message code="lbl.accountHolderName"/>: ${account.accountHolderName}<br>
<spring:message code="lbl.balance"/> : ${account.balance}
</p>




</body>
</html>
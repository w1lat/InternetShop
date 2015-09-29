<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="WEB-INF/pages/layout/taglib.jsp" %>
<jsp:include page="WEB-INF/pages/layout/header.jsp">
    <jsp:param value="items" name="title"/>
    <jsp:param value="items" name="page"/>
</jsp:include>

<h2>Hello World!</h2>

<jsp:include page="WEB-INF/pages/layout/footer.jsp"/>

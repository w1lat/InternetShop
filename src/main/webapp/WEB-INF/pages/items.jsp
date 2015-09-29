<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="layout/taglib.jsp" %>
<jsp:include page="layout/header.jsp">
    <jsp:param value="items" name="title"/>
    <jsp:param value="items" name="page"/>
</jsp:include>

<h1>Все доступные модели соответствующие Вашим параметрам</h1>

<br/>

<table class="table table-striped table-bordered table-hover">
    <tbody>
    <c:forEach items="${phones}" var="phone">
        <tr>
            <td><a href="phone?id=${phone.id}"><img src="resources/images/${phone.id}.1.jpg" width="150"
                                                    height="200" alt="phone"></a></td>
            <td>
                <a href="phone?id=${phone.id}">iPhone ${phone.model} ${phone.memory}Gb (${phone.color})</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<jsp:include page="layout/footer.jsp"/>

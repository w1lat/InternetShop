<%@page import="com.AlephAlliance.model.IPhone " %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="layout/taglib.jsp" %>
<jsp:include page="layout/header.jsp">
    <jsp:param value="iPhone ${phone.model} ${phone.memory}Gb (${phone.color})" name="title"/>
    <jsp:param value="items" name="page"/>
</jsp:include>

<h1>iPhone ${phone.model} ${phone.memory}Gb (${phone.color})</h1>
<table>
    <td><img src="resources/images/${phone.id}.jpg" width="150"
             height="200" alt="phone"></td>
    <td>
        <p>
            <strong>model: ${phone.model}</strong><br>
            <strong>color: ${phone.color}</strong><br>
            <strong>memory: ${phone.memory}</strong><br>
            <strong>condition: ${phone.condition}</strong><br>
        </p>

        <%--<form action="basket/add.html" class="form-horizontal">--%>
            <%--<div class="form-group">--%>
                <%--<input type="hidden" name="id" value="${phone.id}">--%>
                <%--<label class="control-label col-lg-1">quantity:</label>--%>

                <%--<div class="col-lg-1">--%>
                    <%--<input type="text" class="form-control" id="quantity" name="quantity" value="1"/>--%>
                <%--</div>--%>
                <%--<input type="submit" class="btn btn-md btn-primary" value="Order"/>--%>
            <%--</div>--%>
        <%--</form>--%>
    </td>
</table>

<table>
    <tr>
        <td><img src="resources/images/phones/${phone.id}.1.jpg" width="300"
                 height="400" alt="phone"></td>
        <td><img src="resources/images/phones/${phone.id}.2.jpg" width="300"
                 height="400" alt="phone"></td>
        <td><img src="resources/images/phones/${phone.id}.3.jpg" width="300"
                 height="400" alt="phone"></td>
        <td><img src="resources/images/phones/${phone.id}.4.jpg" width="300"
                 height="400" alt="phone"></td>
        <td><img src="resources/images/phones/${phone.id}.5.jpg" width="300"
                 height="400" alt="phone"></td>
    </tr>
</table>

<jsp:include page="layout/footer.jsp"/>
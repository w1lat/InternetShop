<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="layout/taglib.jsp" %>
<jsp:include page="layout/header.jsp">
    <jsp:param value="items" name="title"/>
    <jsp:param value="items" name="page"/>
</jsp:include>

<div class="btn-group">
    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Цвет
        <span class="caret"></span></button>
    <ul class="dropdown-menu" role="menu">
        <li><a href="${phonesUrl}?&color=white">Белый</a></li>
        <li><a href="${phonesUrl}&color=black">Черный</a></li>
    </ul>
</div>
<div class="btn-group">
    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Модель
        <span class="caret"></span></button>
    <ul class="dropdown-menu" role="menu">
        <li><a href="${phonesUrl}?&color=white">3</a></li>
        <li><a href="#">3s</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">4s</a></li>
        <li><a href="#">5</a></li>
        <li><a href="#">5s</a></li>
    </ul>
</div>
<div class="btn-group">
    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Память
        <span class="caret"></span></button>
    <ul class="dropdown-menu" role="menu">
        <li><a href="#">8Gb</a></li>
        <li><a href="#">16Gb</a></li>
        <li><a href="#">32Gb</a></li>
    </ul>
</div>
<div class="btn-group">
    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
        Сосотояние <span class="caret"></span></button>
    <ul class="dropdown-menu" role="menu">
        <li><a href="#">Новый</a></li>
        <li><a href="#">Мелкие потертости</a></li>
        <li><a href="#">Царапины</a></li>
        <li><a href="#">Видымые повреждения</a></li>
        <%--<li class="divider"></li>--%>
        <%--<li><a href="#">Отдельная ссылка</a></li>--%>
    </ul>
</div>
<a class="btn btn-primary" href="${phonesUrl}" role="button">Подобрать</a>


<h1>Все доступные модели соответствующие Вашим параметрам</h1>

<br/>

<table class="table table-striped table-bordered table-hover">
    <tbody>
    <c:forEach items="${phones}" var="phone">
        <tr>
            <td><a href="phone?id=${phone.id}"><img src="resources/images/phones/${phone.id}.1.jpg" width="150"
                                                    height="200" alt="phone"></a></td>
            <td>
                <a href="phone?id=${phone.id}">iPhone ${phone.model} ${phone.memory}Gb (${phone.color})</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<jsp:include page="layout/footer.jsp"/>

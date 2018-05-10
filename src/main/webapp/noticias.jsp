<%@include file="/templates/head.jsp" %>
<%@include file="/templates/navbar.jsp" %>



<div id="noticias" class="col-md-6 col-sm-6">
<c:forEach items="${noticias}" var="noticias">



<h1><c:out value="${noticias.titulo}" /></h1>

<p><c:out value="${noticias.imagen}" /></p>

<p><c:out value="${noticias.contenido}" /></p>



</c:forEach>
</div>


<div id="festivos" class="col-md-6 col-sm-6">

<h1>Dias Festivos</h1>
<c:forEach items="${festivos}" var="festivos">

<p>Año del Curso <c:out value="${festivos.caca}" /></p>
<p>Fecha inicio/Fecha Fin<c:out value="${festivos.fechaini},${festivos.fechafin}" /></p>

<p>Nombre del dia festivo<c:out value="${festivos.descripcion}" /></p>

</c:forEach>
</div>





<jsp:include page="templates/footer.jsp"></jsp:include>
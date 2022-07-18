<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Perro</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
            </head>

            <body>
                <div class="container">
                    <form:form action="/perro/registrar" method="post" modelAttribute="perro">
                        <form:label path="nombre" class="form-label">Nombre:</form:label>
                        <form:input path="nombre" class="form-control" />
                        <br>
                        <button type="submit" class="btn btn-outline-warning">Guardar Perro</button>
                    </form:form>
                    <table class="table table-success table-striped">
                        <thead>
                            <tr>
                                <th scope="col">id</th>
                                <th scope="col">nombre</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="perro" items="${listaPerros}">
                                <tr>
                                    <th scope="row">${perro.id}</th>
                                    <td>${perro.nombre}</td>
                                    <td><a class="btn btn-warning" href="/perro/editar/${perro.id}" role="button">Editar</a></td>
                                    <td><a class="btn btn-danger" href="/perro/eliminar/${perro.id}" role="button">Eliminar</a></td>

                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
            </body>

            </html>
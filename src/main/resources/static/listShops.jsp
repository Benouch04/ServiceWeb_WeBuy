<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Shops </title>
</head>
<body>
<%@page import="com.example.J2EE_WeBuy.Entity.Shop" %>
<%@page import="java.util.*"%>
<h2>Shop list</h2>
<form method="get" action="/shop_index">

<%! ArrayList<Shop> shopList ;  %>
<%

shopList=(ArrayList<Shop>)session.getAttribute("emplst");
%>
	<ul><% for(Shop s : shopList){%><li><%= s.getNom() +" "%><%= s.getAdresse() %></li><%} %></ul>
<br/><br/>
<hr/>

<table border="1">
		<thead>
			<tr>
				<td>FirstName</td>
				<td>LastName</td>
				<td>Role</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="shop" items="${sessionScope['shopList']}">
				<tr>
					<td>${shop.nom}</td>
					<td>${shop.adresse}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</form>
<form method="post" action="/addShop"> <br/> <br/>
<input type="submit" value="ajouter magasin" />
</form>
</body>
</html>
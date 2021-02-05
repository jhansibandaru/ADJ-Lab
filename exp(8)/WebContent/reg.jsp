<%@ page import = "java.util.*" %>
<%@ page import = "java.sql.*" %>
<%@ page import = "java.lang.*" %>
<%@ page import = "java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!String name;
String password;
String query;
Connection con = null;
Statement stmt = null;
//PreparedStatement psmt;
//ResultSet rs;
//PrintWriter out = null;
%>
<body>
<%Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exp(4)","root","");

stmt = con.createStatement();

name = request.getParameter("username");
password = request.getParameter("pswd");
//System.out.println(name+" "+password);
query = "insert into registration values('"+name+"','"+password+"')";

stmt.executeUpdate(query);
//psmt = con.prepareStatement(query);

//psmt.setString(1,name);
//psmt.setString(2, password);

//rs = stmt.executeQuery("select * from registration");
out.println("Data is inserted.");
%>
</body>
</html>
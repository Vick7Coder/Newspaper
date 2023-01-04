<%@ tag pageEncoding="utf-8" %>
<%@attribute name="css" fragment="true" required="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Admin</title>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">    <title>Dashboard</title>
  <link rel="stylesheet" href="./style/style-projects.css">
  <jsp:invoke fragment="css" />
</head>
<body>
<input type="checkbox" id="nav-toggle">
<jsp:include page="../../view/vwAdmin/partials/left.jsp" />
<div class="main-content">

     <jsp:include page="../../view/vwAdmin/partials/nav.jsp"/>
  <jsp:doBody/>s
    </div>



</body>
</html>
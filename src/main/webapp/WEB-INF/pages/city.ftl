<html>

<header>

    <!-- Bootstrap core CSS -->
    <link href="cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="starter-template.css" rel="stylesheet">
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>
    <!-- Bootstrap core JavaScript================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>

</header>

<body>

<ul class="nav nav-tabs" role="tablist">
    <li role="presentation" class="active">
        <a href="#">主页</a>
    </li>
    <li role="presentation">
        <a href="#">Profile</a>
    </li>
    <li role="presentation">
        <a href="#">Message</a>
    </li>

</ul>


<table border="1"  align="center">
<tr align="center"><th  align="center">CITIES</th></tr>
    <tr  align="center">
        <td>ID</td>
        <td>Name</td>
        <td>CountryCod</td>
        <td>District</td>
        <td>Population</td>
    </tr>
<#list cities as city>
    <tr>
        <td>${city.ID}</td>
        <td>${city.Name}</td>
        <td>${city.CountryCode}</td>
        <td>${city.District}</td>
        <td>${city.Population}</td>
    </tr>

</#list>

</table>


</body>
</html>
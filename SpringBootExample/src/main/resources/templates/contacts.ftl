<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All contacts</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-fixed-top navbar-dark bg-inverse">
    <a class="navbar-brand" href="#">Дед Мороз</a>
    <ul class="nav navbar-nav">
        <li class="nav-item active">
            <a class="nav-link" href="#">Главная<span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">аааа</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#"></a>
        </li>
    </ul>
</nav>
<table class="table">
    <tr>
        <th>id</th>
        <th>email</th>
        <th>name</th>
        <th>phone number</th>
    </tr>

    <#list contactList as contact>
    <tr>
        <td>${contact.id}</td>
        <td>${contact.email}</td>
        <td>${contact.name}</td>
        <td>${contact.phoneNumber}</td>
    </tr>
    </#list>
</table>
</body>
</html>
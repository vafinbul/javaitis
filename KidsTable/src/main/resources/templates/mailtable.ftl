<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Письмо</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<table class="table">
    <tr>
        <th>Номер ребенка</th>
        <th>Имя</th>
        <th>E-mail</th>
        <th>Возраст</th>
        <th>Текст Письма</th>
    </tr>

    <#list letterList as list>
    <tr>
        <td>${list.id}</td>
        <td>${list.name}</td>
        <td>${list.email}</td>
        <td>${list.age}</td>
        <td>${list.letter}</td>
    </tr>
    </#list>
</table>
</body>
</html>
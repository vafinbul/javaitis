<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Детишки</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<table class="table">
    <tr>
        <th>Номер ребенка</th>
        <th>Имя</th>
        <th>Индекс поведения</th>
        <th>Наличие письма</th>
    </tr>

    <#list kidsList as kids>
    <tr>
        <td>${kids.id}</td>
        <td>${kids.name}</td>
        <td>${kids.rating}</td>
        <td>
            <#if kids.emailExists?string('yes','no') == 'yes'>
                <!-- НАДО ДОБАВИТЬ ССЫЛКУ НА ЛОГИКУ ПИСЬМА -->
                <img src="/images/mail.png" width="35" height="35">
                </a>
            </#if>
        </td>
    </tr>
    </#list>
</table>
</body>
</html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All contacts</title>
    <link href="/css/style.css" rel="stylesheet">
</head>
<body>
<table>
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
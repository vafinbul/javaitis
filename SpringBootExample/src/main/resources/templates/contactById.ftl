<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contact</title>
    <link href="/css/contact.css" rel="stylesheet">
</head>
<body>
<table cellspacing='0'> <!-- cellspacing='0' is important, must stay -->

    <!-- Table Header -->
    <thead>
    <tr>
        <th>Номер</th>
        <th>E-Mail</th>
        <th>Имя</th>
        <th>Телефонный номер</th>
    </tr>

    </thead>
    <!-- Table Header -->

    <!-- Table Body -->
    <tbody>



    <tr>
        <td id>${contact.id}</td>
        <td>${contact.email}</td>
        <td>${contact.name}</td>
        <td>${contact.phoneNumber}</td>
    </tr>

    </tbody>
    <!-- Table Body -->

</table>
</body>
</html>
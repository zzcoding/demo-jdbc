<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
Hello!${name}
<br>
${path}
<table border="1">
<#list list as itm>
    <tr>
        <td>${itm["s_name"]}</td>
        <td>${itm["s_source_key"]}</td>
        <td>${itm["s_source_url"]}</td>

    </tr>
</#list>
</table>

</body>
</html>
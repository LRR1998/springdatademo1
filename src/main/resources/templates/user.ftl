<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table border="" cellspacing="0" cellpadding="10px" align="center" width="800px">
        <tr>
            <th>序号</th><th>用户名</th><th>性别</th><th>爱好</th><th>学历</th><th>介绍</th>
        </tr>
        <#list students as student >
            <tr>
                <td>${student.sid}</td>
                <td>${student.sname}</td>
                <td>${student.gender}</td>
                <td>${student.hobby}</td>
                <td>${student.degree}</td>
                <td>${student.mark}</td>
            </tr>
        </#list>
    </table>
</body>
</html>
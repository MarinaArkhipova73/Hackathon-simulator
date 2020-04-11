<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Вход</title>
    <link rel="stylesheet" href="../static/css/sign.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-8" style="text-align: center">
            <img src="https://img.icons8.com/bubbles/100/000000/bass-drum.png"/>
            <h2 style="margin: 20px">Результаты</h2>
            <p>${result.text}</p>
            <br>
            <table style="margin: auto; border-collapse: separate; border-spacing: 11px 11px;">
                <tr>
                    <th></th>
                    <th> Ваш результат  </th>
                    <th> Максимальный результат</th>
                </tr>
                <tr><td>Мотивация</td><td>${result.inspirationPoints}</td><td>31</td></tr>
                <tr><td>Время</td><td>${result.timePoints}</td><td>30</td></tr>
                <tr><td>Знания</td><td>${result.knowledgePoints}</td><td>41</td></tr>
            </table>
            <br>
            <i>Примечание:</i>
            <p>Для того, чтобы занять 1 место, вам необходимо набрать следующие баллы: </p>
            <p>>= 25 единиц мотивации, >= 20 единиц свободного времени, >= 35 единиц знаний</p>
            <p>Для того, чтобы занять 2 - 3 место: </p>
            <p>>= 10 единиц мотивации, >= 15 единиц свободного времени, >= 25 единиц знаний</p>
            <p>В остальных случаях ваша цель - занять лидирующие места на Хакатоне - провалена!</p>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
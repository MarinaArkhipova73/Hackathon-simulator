function answer(event) {
    var questionId = event.target.id;
    var coachName = document.getElementById("coachName");
    var answerId;
    var radios = document.getElementsByName('radio');

    for (var i = 0, length = radios.length; i < length; i++) {
        if (radios[i].checked) {
            answerId = radios[i].value;
            break;
        }
    }

    $.ajax({
        url: "/ajax/answer",
        type: "post",
        data: {
            "id": questionId,
            "answerId": answerId,
            "coachName": coachName.value
        },
        success: function (task) {

        }
    });
}
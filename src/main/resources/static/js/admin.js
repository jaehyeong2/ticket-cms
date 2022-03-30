let index = {
    init: function () {
        $("#btn-save").on("click", () => {
            this.save();
        });
        $("#btn-delete").on("click", () => {
            this.deleteById();
        });
        $("#btn-update").on("click", () => {
            this.update();
        });
        $("#btn-comment-save").on("click", () => {
            this.commentSave();
        });
        $("#btn-comment-delete").on("click", () => {
            this.commentDelete();
        });
    },

    save: function () {
        let data = {
            name: $("#name").val(),
            username: $("#username").val(),
            password: $("#password").val(),
            email: $("#email").val()
        };

        $.ajax({
            type: "POST",
            url: "admin/signup",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        }).done(function () {
            alert("회원가입이 완료되었습니다.");
            location.href="/";
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },
}
index.init();
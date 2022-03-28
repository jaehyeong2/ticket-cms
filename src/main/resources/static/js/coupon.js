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
        };

        $.ajax({
            type: "POST",
            url: "/coupon",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        }).done(function () {
            alert("등록이 완료되었습니다.");
            history.back();
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },

    deleteById: function(){
        let id = $("#couponId").text();

        $.ajax({
            type: "DELETE",
            url: "/coupon/"+id,
            dataType: "json"
        }).done(function(resp){
            alert("삭제가 완료되었습니다.");
            document.location.reload(true);
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    },

}
index.init();
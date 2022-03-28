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
            price: $("#price").val(),
            category: $("#category").val()
        };

        console.log(data);

        $.ajax({
            type: "POST",
            url: "/product",
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
        let id = $("#productId").text();

        $.ajax({
            type: "DELETE",
            url: "/product/"+id,
            dataType: "json"
        }).done(function(resp){
            alert("삭제가 완료되었습니다.");
            document.location.reload(true);
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    },

    update: function(){
        let id = $("#productId").text();

        let data = {
            name: $("#name").val(),
            price: $("#price").val()
        };

        $.ajax({
            type: "PUT",
            url: "/product/"+id,
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        }).done(function(resp){
            alert("수정 완료되었습니다.");
            history.back();
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    },

}
index.init();
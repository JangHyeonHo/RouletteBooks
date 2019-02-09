$(function () {
    
    $("#imageSource").on("change", function (e) {
        var imageNames = e.target.files;
        var imageNameArr = Array.prototype.slice.call(imageNames);
        if(imageNameArr[0]==null){
            $("#photoZone").html("");
            return;
        }
        var reader = new FileReader();
        imageNameArr.forEach(function (f) {
            if (!f.type.match("image.*")) {
                alert("사진은 이미지만 가능합니다.");
                $("#imageSource").val("");
                $("#photoZone").html("");
                return;
            }
            var sel_file = f;

            reader.onload = function (e) {
                $("#photoZone").html("<img src = '" + e.target.result + "' width='125px' height= '150px' style = 'border:1px solid black;'>");
            }

            reader.readAsDataURL(f)

        });


    });
})
$(function () {
    $("#search").on("change", function () {
        switch (this.value) {
            case "email":
                $("#textLine").attr('placeholder', "example@roulette.com");
                break;
            case "name":
            case "nickname":
                $("#textLine").attr('placeholder', "홍길동(정자 입력)");
                break;
            case "gender":
                $("#textLine").attr('placeholder', "남(혹은 여)");
                break;
            case "createDate":
                $("#textLine").attr('placeholder', "20190101(년월일)");
                break;
            case "grade":
                $("#textLine").attr('placeholder', "다이아몬드(등급표)");
                break;
            case "money":
            case "hogu" :
                $("#textLine").attr('placeholder', ">=40000(40000원 이상)");
                break;
            case "phone" :
            $("#textLine").attr('placeholder', "'-'빼고 01012345678");
                break;
        }
    });
})
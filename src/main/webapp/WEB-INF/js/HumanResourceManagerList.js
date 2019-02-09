$(function () {
    $("#search").on("change", function () {
        switch (this.value) {
            case "mNum":
                $("#textLine").attr('placeholder', "38402948(8숫자)");
                break;
            case "mName":
                $("#textLine").attr('placeholder', "홍길동(정자 입력)");
                break;
            case "mManager":
                $("#textLine").attr('placeholder', "사원(직책표)");
                break;
            case "mDepartment":
                $("#textLine").attr('placeholder', "인사팀(부서표)");
                break;
            case "mSalary" :
                $("#textLine").attr('placeholder', ">=40000(40000원 이상)");
                break;
            case "mPhoneNum" :
            $("#textLine").attr('placeholder', "('-'빼고 01012345678");
                break;
        }
    });
})
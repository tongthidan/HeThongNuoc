async function addHo() {
    try{
    var tenChuHo = document.getElementById("ten_chuho").value;
    
    const loaiHo = $("input[type='radio'][name='loaiHo']:checked").val();

    
    var maHo = document.getElementById("ma_ho").value;

    var soCanCuoc = document.getElementById("so_can_cuoc").value
    var dia_chi= document.getElementById("dia_chi").value
    
    var soHN = document.getElementById("so_ho_ngheo").value
    var email = document.getElementById("email").value
    var sdt = document.getElementById("sdt").value
    var username = document.getElementById("username").value
    var password = document.getElementById("password").value
    const response = await axios({
        method: "post",
        url: "http://localhost:8080/api/createFamily",
        data: {
        tenChuHo,
        maHo,
        soCanCuoc,
        loaiHo,
        soHN,
        email,
        sdt,
        dia_chi,
        username,
        password
        }
    })
    console.log(response.data);
    return response;
    }catch(error){
        console.log(error)
    }
    if(addHo().response == "OK"){
        alert("Đăng kí hộ thành công");
    }

}
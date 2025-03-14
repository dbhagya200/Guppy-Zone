

$(document).ready(function () {
    $("#signup").click(function () {
        let name = $("#name").val();
        let email = $("#email").val();
        let password = $("#password").val();
        let confirm = $("#confirm").val();
        if(password !== confirm){
            alert("Password and Confirm Password do not match");
            // Toast.fire({
            //     icon: "success",
            //     title: "Password and Confirm Password do not match"
            // });
            return;
        }
        $.ajax({
            url: "http://localhost:8082/api/v1/user/register",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                name: name,
                email: email,
                password: password,
                role: "User"

            }),
            success: function(response) {
                alert('User registered successfully');
                // Toast.fire({
                //     icon: "success",
                //     title: "User registered successfully"
                // });
                window.localStorage.setItem('token', response.data.token);
                window.location.href = 'login.html';
            },
            error: function(error) {
                alert('An error occurred while registering user');
                // Toast.fire({
                //     icon: "success",
                //     title: "An error occurred while registering user"
                // });
            }
    });
});
});
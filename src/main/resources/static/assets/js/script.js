document.getElementsByClassName('login').addEventListner('Click',function (){

    let email = document.getElementById('email').value();
    let password = document.getElementById('password').value;

    fetch('/auth/login', {
        method: 'post',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            'email': email,
            'password' : password
        })
    }).then(response => response.json()).then(value => {
        if (value.data === 'Login In Success'){
            localStorage.setItem('accessToken', value.accessToken)
            if(value.userRole === 'ADMIN'){
                window.location.href ='/admin/view/'
            }
        }else {
            alert(value.data)
        }
    })
        .catch(error => {

        })
})
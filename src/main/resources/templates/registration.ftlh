<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel=" stylesheet " href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css " integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous " referrerpolicy="no-referrer " >
    <script src="https://kit.fontawesome.com/a58da105b1.js" crossorigin="anonymous"></script>
    <link rel="stylesheet " href="css/normalize.css ">
    <link rel="stylesheet" href="css/navbar.css">
    <link rel="stylesheet" href="css/registration.css">
    <title>Sign Up</title>
</head>
<body>
<nav>
    <div class="logo">
        <a href="/">RUDA</a>
    </div>
    <ul class="nav-links ">

        <li>
            <a href=" ">Freelance </a>
        </li>
        <li>
            <a href="/help">Help </a>
        </li>
        <li>
            <a href="/vacancies">Vacancies</a>
        </li>
    </ul>
    <ul class="nav-user ">
        <li><a href=" ">Create resume</a></li>
        <button class="login ">
            <a href="/login">Log In</a>
        </button>
    </ul>
    <div class="toggles ">
        <div class="account ">
            <i class="fa fa-user-o "></i>
        </div>
        <div class="burger ">
            <div class="line1 "></div>
            <div class="line2 "></div>
            <div class="line3 "></div>
        </div>
    </div>
</nav>


<div class="formes">
    <!--    action="/regis" method="POST" -->
    <form class="regbox" action="/registration" method="POST" id="regbox" >
        <h1 class="tittle">Registration Via Instagram</h1>
        <div class="row ">
            <div class="col-3 ">
                <p class="labels">Name:</p>
            </div>
            <div class="col-8 ">
                <input type="text" autocomplete="off" id="name" name="name" required>
            </div>
        </div>
        <div class="row ">
            <div class="col-3 ">
                <p class="labels">E-mail:</p>
            </div>
            <div class="col-8 ">
                <input type="text" autocomplete="off" id="email" name="email" required>
            </div>
        </div>
<#--        <div class="row ">-->
<#--            <div class="col-3 ">-->
<#--                <p class="labels">Phone</p>-->
<#--            </div>-->
<#--            <div class="col-8 ">-->
<#--                <input type="text" autocomplete="off" id="email" name="numberPhone" required>-->
<#--            </div>-->
<#--        </div>-->
        <div class="row ">
            <div class="col-3 ">
                <p class="labels">Password:</p>
            </div>
            <div class="col-8 ">
                <input type="password" autocomplete="off" id="password" name="password" >
            </div>
        </div>
        <div class="row ">
            <div class="col-3 ">
                <p class="labels">??onfirm password:</p>
            </div>
            <div class="col-8 ">
                <input type="password" id="password" name="password2" required>
            </div>
        </div>
        <div class="row ">
            <div class="col-3 ">
                <p class="labels">Phone Number:</p>
            </div>
            <div class="col-8 ">
                <input type="text" id="password" name="numberPhone" required>
            </div>
        </div>

        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <div class="confirm">
            <input type="submit" class="confirmbutton" value="Sign Up">
        </div>
        <div class="already">
            <a>ALREADY HAVE AN ACCOUNT?  <a class="logi" href="/login">LOG IN</a></a>
        </div>
    </form>
</div>
<script>
</script>
</body>
</html>
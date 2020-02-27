<HTML>
<HEAD>
    <TITLE>Reading Radio Buttons</TITLE>
</HEAD>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Page</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">VoteSA</a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="register">Register</a></li>
            <li><a href="login">Login</a></li>
        </ul>
    </div>
</nav>
<div>
    <a class="btn btn-primary" href="http://localhost:8080/voteresultsProv?prov=Gauteng">Gauteng</a>
    <a class="btn btn-primary" href="http://localhost:8080/voteresultsProv?prov=Free+State">Free State</a>
    <a class="btn btn-primary" href="http://localhost:8080/voteresultsProv?prov=Eastern+Cape">Eastern Cape</a>
    <a class="btn btn-primary" href="http://localhost:8080/voteresultsProv?prov=Western+Cape">Western Cape</a>
    <a class="btn btn-primary" href="http://localhost:8080/voteresultsProv?prov=Northern+Cape">Northern Cape</a>
    <a class="btn btn-primary" href="http://localhost:8080/voteresultsProv?prov=North+West">North West</a>
    <a class="btn btn-primary" href="http://localhost:8080/voteresultsProv?prov=KwaZulu+Natal">KwaZulu Natal</a>
    <a class="btn btn-primary" href="http://localhost:8080/voteresultsProv?prov=Limpopo">Limpopo</a>
    <a class="btn btn-primary" href="http://localhost:8080/voteresultsProv?prov=Mpumalanga">Mpumalanga</a>
</div>
<div class="container">
    <H1>Voting Results</H1>
    <h3>ANC</h3>
    <p>Number of votes: ${ANC}</p>
    <h3>DA</h3>
    <p>Number of votes: ${DA}</p>
    <h3>EFF</h3>
    <p>Number of votes: ${EFF}</p>
    <h3>IFP</h3>
    <p>Number of votes: ${IFP}</p>
    <h3>SACP</h3>
    <p>Number of votes: ${SACP}</p>

</div>
</body>
</html>
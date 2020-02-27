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

    <div class="container">
        <div>
            <form action="http://localhost:8080/register" method="POST">
                <div class="form-group"><input type="text" class="form-control" id="Firstname" name="Firstname" placeholder="Firstname"></div>
                <div class="form-group"><input type="text" class="form-control" id="Surname" name="Surname" placeholder="Surname"></div>
                <div class="form-group"><input type="text" class="form-control" id="Id_Number" name="Id_Number" placeholder="ID Number"></div>
                <div class="form-group">
                    <label>Gender</label>
                <select name="Gender" id="Gender" class="form-control">
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                </select>
            </div>
                <div class="form-group"><input type="text" class="form-control" id="Race" name="Race" placeholder="Race"></div>
                <div class="form-group">
                    <label>Province</label>
                    <select name="Province" id="Province" class="form-control">
                        <option value="Gauteng">Gauteng</option>
                        <option value="Free State">Free State</option>
                        <option value="Eastern Cape">Eastern Cape</option>
                        <option value="Western Cape">Western Cape</option>
                        <option value="Northern Cape">Northern Cape</option>
                        <option value="North West">North West</option>
                        <option value="KwaZulu Natal">KwaZulu Natal</option>
                        <option value="Limpopo">Limpopo</option>
                        <option value="Mpumalanga">Mpumalanga</option>
                    </select>
                </div>
                <div class="form-group"><input type="submit" id="submit" name="submit"></div>
            </form>
        </div>
    </div>
</body>

</html>
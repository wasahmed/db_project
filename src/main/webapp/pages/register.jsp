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
            <form action="" method="POST">
                <div class="form-group"><input type="text" class="form-control" id="Firstname" name="Firstname" placeholder="Firstname"></div>
                <div class="form-group"><input type="text" class="form-control" id="Surname" name="Surname" placeholder="Surname"></div>
                <div class="form-group"><input type="text" class="form-control" id="Id_Number" name="Id_Number" placeholder="ID Number"></div>
                <div class="form-group"><input type="text" class="form-control" id="Gender" name="Gender" placeholder="Gender"></div>
                <div class="form-group"><input type="text" class="form-control" id="Race" name="Race" placeholder="Race"></div>
                <div class="form-group"><input type="text" class="form-control" id="Province" name="Province" placeholder="Province"></div>
                <div class="form-group"><input type="submit" id="submit" name="submit"></div>
            </form>
        </div>
    </div>
</body>

</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Lantern | Reset Password</title>
    <link href="${context}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<section id="reset" class="container features" style="margin-top:40px;margin-bottom:40px;">
    <div class="row">
        <div class="col-lg-12">
            <div class="navy-line"></div>
            <h4><img class="mr-1" src="${context}/img/logo_40.png">Reset Password</h4>
			<form class="ml-2" method="POST">
				<input type="hidden" name="reset_key" value="${key!}"/>
				<div>New Password:</div>
				<input type="password" name="password"/>
                <input type="submit" class="btn-primary" value="Submit"/>
			</form>
        </div>
    </div>
</section>

</body>
</html>

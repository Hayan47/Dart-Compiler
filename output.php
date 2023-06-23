<?php
if (isset($_POST['doctor'])) {
header('Location: output1.html');
  exit;
}
if (isset($_POST['patient'])) {
header('Location: output2.html');
  exit;
}
if (isset($_POST['admin'])) {
header('Location: output3.html');
  exit;
}
if (isset($_POST['mohammed'])) {
?>
    <html>
     <span> gender : </span><?php echo $_POST['gender_controller']; ?>
     </html>
<?php?>
    <html>
     <span> age : </span><?php echo $_POST['age_controller']; ?>
     </html>
<?php
}
if (isset($_POST['patient_result'])) {
?>
    <html>
     <span> name : </span><?php echo $_POST['name_controller']; ?>
     </html>
<?php?>
    <html>
     <span> phone : </span><?php echo $_POST['phone_controller']; ?>
     </html>
<?php
}
if (isset($_POST['admin_result'])) {
?>
    <html>
     <span> email : </span><?php echo $_POST['email_controller']; ?>
     </html>
<?php?>
    <html>
     <span> password : </span><?php echo $_POST['password_controller']; ?>
     </html>
<?php
}

?><html>
<head>
<title>Program Output</title>
</head>
<body>
<form action="output.php" method="post">
<ul><p>this_is_your_account</p></ul></form>
</body>
</html>
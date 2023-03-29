<?php
session_start();
$con=mysqli_connect('localhost','root','','leave_management_system');
if (mysqli_connect_errno()) {
    echo "Failed to connect to MySQL: " . mysqli_connect_error();
    exit();
  }
?>
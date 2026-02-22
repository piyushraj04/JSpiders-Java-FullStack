<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Login</title>

<style>

    body {
        margin: 0;
        padding: 0;
        font-family: Arial, Helvetica, sans-serif;
        background: linear-gradient(135deg, #1d2671, #c33764);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .login-container {
        background: #ffffff;
        padding: 40px 35px;
        border-radius: 12px;
        box-shadow: 0 12px 30px rgba(0,0,0,0.25);
        width: 350px;
    }

    .login-container h2 {
        text-align: center;
        margin-bottom: 30px;
        color: #333;
    }

    .form-group {
        margin-bottom: 20px;
    }

    .form-group label {
        display: block;
        margin-bottom: 6px;
        font-weight: 600;
        color: #444;
    }

    .form-group input {
        width: 100%;
        padding: 10px;
        border-radius: 6px;
        border: 1px solid #ccc;
        font-size: 14px;
        transition: 0.3s ease;
    }

    .form-group input:focus {
        border-color: #1d2671;
        outline: none;
        box-shadow: 0 0 6px rgba(29,38,113,0.4);
    }

    .login-btn {
        width: 100%;
        padding: 12px;
        border: none;
        border-radius: 6px;
        background-color: #1d2671;
        color: white;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s ease;
    }

    .login-btn:hover {
        background-color: #151a4f;
    }

</style>

</head>
<body>

<div class="login-container">
    <h2>Employee Login</h2>

    <form action="login" method="post">

        <div class="form-group">
            <label>Employee ID</label>
            <input type="text" name="id" required>
        </div>

        <div class="form-group">
            <label>Password</label>
            <input type="password" name="password" required>
        </div>

        <button type="submit" class="login-btn">Login</button>

    </form>
</div>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Leave Application Submitted</title>

<style>

    body {
        margin: 0;
        padding: 0;
        font-family: Arial, Helvetica, sans-serif;
        background: linear-gradient(135deg, #11998e, #38ef7d);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .display-container {
        background: #ffffff;
        padding: 35px 40px;
        border-radius: 12px;
        box-shadow: 0 12px 30px rgba(0,0,0,0.25);
        width: 420px;
    }

    .display-container h2 {
        text-align: center;
        color: #11998e;
        margin-bottom: 20px;
    }

    .success-msg {
        text-align: center;
        font-weight: bold;
        color: green;
        margin-bottom: 20px;
    }

    .info-row {
        margin-bottom: 12px;
        font-size: 15px;
    }

    .info-label {
        font-weight: bold;
        color: #333;
    }

    .back-btn {
        margin-top: 20px;
        width: 100%;
        padding: 10px;
        border: none;
        border-radius: 6px;
        background-color: #11998e;
        color: white;
        font-size: 15px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s;
    }

    .back-btn:hover {
        background-color: #0d7f6e;
    }

</style>

</head>
<body>

<div class="display-container">

    <h2>Leave Application</h2>

    <div class="success-msg">
        ✅ Leave Application Submitted Successfully!
    </div>

    <div class="info-row">
        <span class="info-label">Employee ID:</span> ${id}
    </div>

    <div class="info-row">
        <span class="info-label">Employee Name:</span> ${name}
    </div>

    <div class="info-row">
        <span class="info-label">Leave Type:</span> ${leaveType}
    </div>

    <div class="info-row">
        <span class="info-label">Reason:</span> ${reason}
    </div>

    <div class="info-row">
        <span class="info-label">Start Date:</span> ${startDate}
    </div>

    <div class="info-row">
        <span class="info-label">End Date:</span> ${endDate}
    </div>

    <form action="form" method="get">
        <button type="submit" class="back-btn">Apply Another Leave</button>
    </form>

</div>

</body>
</html>

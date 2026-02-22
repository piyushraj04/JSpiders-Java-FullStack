<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Leave Application</title>

<style>

    body {
        margin: 0;
        padding: 0;
        font-family: Arial, Helvetica, sans-serif;
        background: linear-gradient(135deg, #667eea, #764ba2);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .leave-container {
        background: #ffffff;
        padding: 30px 40px;
        border-radius: 12px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        width: 450px;
    }

    .leave-container h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #333;
    }

    .form-group {
        margin-bottom: 18px;
    }

    .form-group label {
        display: block;
        margin-bottom: 6px;
        font-weight: 600;
        color: #444;
    }

    .form-group input,
    .form-group select,
    .form-group textarea {
        width: 100%;
        padding: 10px;
        border-radius: 6px;
        border: 1px solid #ccc;
        font-size: 14px;
        transition: 0.3s ease;
    }

    .form-group input:focus,
    .form-group select:focus,
    .form-group textarea:focus {
        border-color: #667eea;
        outline: none;
        box-shadow: 0 0 6px rgba(102,126,234,0.4);
    }

    .date-row {
        display: flex;
        gap: 10px;
    }

    .date-row .form-group {
        flex: 1;
    }

    .submit-btn {
        width: 100%;
        padding: 12px;
        border: none;
        border-radius: 6px;
        background-color: #667eea;
        color: white;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s ease;
    }

    .submit-btn:hover {
        background-color: #5a67d8;
    }

</style>

</head>
<body>

<div class="leave-container">
    <h2>Employee Leave Application</h2>

    <form action="saveLeave" method="post">

        <div class="form-group">
            <label>Employee ID</label>
            <input type="text" name="id" required>
        </div>

        <div class="form-group">
            <label>Employee Name</label>
            <input type="text" name="name" required>
        </div>

        <div class="form-group">
            <label>Leave Type</label>
            <select name="leaveType" required>
                <option value="">-- Select Leave Type --</option>
                <option>Sick Leave</option>
                <option>Casual Leave</option>
                <option>Paid Leave</option>
                <option>Emergency Leave</option>
                <option>Work From Home</option>
            </select>
        </div>

        <div class="form-group">
            <label>Reason</label>
            <textarea name="reason" rows="3" required></textarea>
        </div>

        <div class="date-row">
            <div class="form-group">
                <label>Start Date</label>
                <input type="date" name="startDate" required>
            </div>

            <div class="form-group">
                <label>End Date</label>
                <input type="date" name="endDate" required>
            </div>
        </div>

        <button type="submit" class="submit-btn">Submit Application</button>

    </form>
</div>

</body>
</html>

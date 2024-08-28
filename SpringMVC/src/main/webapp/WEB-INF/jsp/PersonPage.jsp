<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>
    <h2>Person Information</h2>
    <form method="GET" action="/SpringMVC/addPerson">
        <label>Enter your name: </label>
        <input id="name" name="name" type="text" required />
        <br />
        <label>Enter your age: </label>
        <input id="age" name="age" type="text" required />
        <br />
        <label>Enter your designated course: </label>
        <input id="course" name="course" type="text" required />
        <br />
        <button type="submit">Submit</button>
    </form>
</body>
</html>

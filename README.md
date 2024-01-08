Run the backend code "DemoApplication" by click on the run button inIntellij  and then send post command in Postman tool


>>>>>
>>>>>select POST Method
http://localhost:8080/users/addUser
In Body section, paste below payload and also select raw type and select JSON data type

{
    "firstName": "Paul",
    "lastName": "Davis",
    "email": "pauldavis@gmail.com",
    "postalCode": "N1R5T4"
}
click Send button and send request to server and get response with 200 OK.

>>>>>
>>>>>select GET Method
http://localhost:8080/users/getUsers
click Send button and send request to server and get response with 200 OK with all users data from MySQL database table USER.








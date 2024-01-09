Below steps follows:

git clone https://github.com/amitgilotra2024/user-registration-backend.git
Run the backend code "DemoApplication" by click on the run button inIntellij  and then send post command in Postman tool
select POST Method in postman tool and give this next to it  http://localhost:8080/users/addUser
In Body section, paste below payload and also select raw type and select JSON data type

{
    "firstName": "Andrew",
    "lastName": "Dan",
    "email": "andrewdan@gmail.com",
    "postalCode": "N1R5U4"
}
click Send button and send request to server and get response with 200 OK.







# MicroservicesGateway

With this progect you need to lounch second project from MiniRestApp repository

new requests from Postman:


http://localhost:8091/users/registration body: { "username":"Lev", "password":"2222" }

http://localhost:8091/users/get_user?id=1

http://localhost:8091/users/delete_user/2

http://localhost:8091/todo/create_todo?userId=1 body: { "title":"TODO TITLE2", "completed":false, "description": "some description" }

http://localhost:8091/todo/update_todo?id=2

http://localhost:8091/todo/get_todo?id=2


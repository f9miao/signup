// mongodb初始化脚本

db = db.getSiblingDB('signup');

db.createUser(
    {
        user: "f9miao",
        pwd: "f9miao",
        roles: [
            { role: "dbOwner", db: "signup"},
        ]
    }
);

db.createCollection("hello")
db.hello.insertOne({"hello": "你好!!!"})

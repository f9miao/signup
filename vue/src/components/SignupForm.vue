<template>
    <div class="signup-form-container">

        <el-card class="signup-form">
            <h2>新生报名表</h2>

            <el-input class="signup-item" v-model="signup_data.nickname" placeholder="姓名"></el-input><br>

            <el-input class="signup-item" v-model="signup_data.classname" placeholder="专业班级"></el-input><br>

            <el-input class="signup-item" v-model="signup_data.email" placeholder="邮箱" type="email"></el-input><br>

            <el-select class="signup-item" v-model="signup_data.department" placeholder="选择意向">
                <el-option  v-for="item in departmentOptions" :key="item.value" :label="item.label" :value="item.value">
                </el-option>
            </el-select><br>

            <el-input class="signup-item"
                      v-model="signup_data.introduction"
                      placeholder="自我介绍"
                      type="textarea"
                      maxlength="200"
                      show-word-limit rows="5">
            </el-input><br>

            <el-button class="signup-submmit" type="danger" @click="signup">立即报名</el-button><br>

        </el-card>

    </div>
</template>

<script>
    import {signup} from '@/api'
    import {Message} from 'element-ui'
    export default {
        name: "SignupForm",
        data: function () {
            return {
                signup_data: {
                    "nickname": "",
                    "classname": "",
                    "email": "",
                    "department": "",
                    "introduction": "",
                },
                departmentOptions: [{
                    value: '大数据',
                    label: '大数据'
                }, {
                    value: 'JAVA服务端',
                    label: 'JAVA服务端'
                }, {
                    value: 'Web前端',
                    label: 'Web前端'
                }]
            }
        },
        methods: {
            signup: function () {
                signup(this.signup_data).then(function (response) {
                    Message.success(response.data.msg)
                })
            }
        }
    }
</script>

<style scoped>
    .signup-form-container{
        padding: 0 0;
        margin: 0;
        background: white;
    }
    .signup-form{
        margin: 60px auto;
        padding: 10px 20px;
        width: 420px;
    }
    .signup-item{
        margin: 20px auto 0 ;
    }
    .signup-submmit{
        width: 100%;
        margin: 20px 0 10px;
    }
</style>

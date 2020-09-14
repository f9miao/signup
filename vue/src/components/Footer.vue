<template>
    <div class="footer">
        <el-row>
            <el-col v-bind:span="4" v-bind:offset="1">
                <p><b>关于开发者</b></p>
                <p>E-mail: {{email}}</p>
                <p>Gitee: <el-link type="primary" v-bind:href="gitee">{{gitee}}</el-link></p>
                <p>Github: <el-link type="primary" v-bind:href="github">{{github}}</el-link></p>
            </el-col>
        </el-row>
    </div>
</template>

<script>
    export default {
        name: "Footer",
        data: function () {
            return {
                "developer": "f9miao",
                "email": "f9miao@126.com",
                "gitee": "https://gitee.com/f9miao",
                "github": "https://github.com/f9miao",
            }
        }
    }
</script>

<style scoped>
    .footer{
        height: 200px;
        background: rgb(247, 251, 253);
    }
</style>
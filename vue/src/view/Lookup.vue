<template>
    <div class="user_table">
        <h1>查看报名表</h1>
        <el-table :data="user_list">
            <el-table-column prop="nickname" label="姓名"></el-table-column>
            <el-table-column prop="classname" label="班级"></el-table-column>
            <el-table-column prop="email" label="邮箱"></el-table-column>
            <el-table-column prop="department" label="意向"></el-table-column>
            <el-table-column prop="introduction" label="自我介绍"></el-table-column>
        </el-table>
    </div>
</template>

<script>
    import {list_all} from '@/api'
    export default {
        name: "Lookup",
        data: function(){
            return {
                user_list: null
            }
        },
        created() {
            this.initData()
        },
        methods: {
            initData: function () {
                let that = this
                list_all().then(function (response) {
                    console.log(response)
                    that.user_list = response.data
                })
            }
        },

    }
</script>

<style >
    .user_table{
        min-height: 600px;
        margin: 30px 5%;
    }
</style>
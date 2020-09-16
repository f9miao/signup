import axios from 'axios'
import {Message} from "element-ui";

// 创建axios实例
const axiosInstance = axios.create({
    baseURL: 'http://www.f9miao.top:27080',
    timeout: 10000,
    headers: {
        'Content-Type': 'application/json'
    }
})

// 响应拦截器
axiosInstance.interceptors.response.use(function (response) {
    // 拦截服务器定义的错误
    if(response.data.code && response.data.code !== 200){
        Message.error({message: response.data.msg})
    }
    return response
},function (response) {
    switch (response.status) {
        case 500: {
            Message.error({message: "啊这, 土豆服务器炸了"})
            break
        }
    }
})

export default axiosInstance

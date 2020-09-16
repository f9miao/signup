import axiosInstance from './request'

/**
 * 报名
 */
export async function signup(data) {
    return axiosInstance.request({
        url: '/signup',
        method: 'POST',
        data: data
    })
}

/**
 * 查询所有报名者
 */
export async function list_all() {
    return axiosInstance.request({
        url: '/list_all',
        method: 'GET',
    })
}

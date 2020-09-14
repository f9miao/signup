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

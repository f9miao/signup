import Vue from 'vue'
import VueRouter from 'vue-router'
import Index from "./view/Index";
import Lookup from "./view/Lookup";

Vue.use(VueRouter)

export default new VueRouter({
    routes: [
        {
            path: '/',
            name: 'Index',
            component: Index,
        },
        {
            path: '/lookup',
            name: 'Lookup',
            component: Lookup
        }
    ]
})

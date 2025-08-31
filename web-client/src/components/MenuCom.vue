<script lang="ts" setup>
import {ElButton} from 'element-plus'
import router from '../router'
const MenuData = [
  { name: '首页', path: '/' },
  { name: '注册', path: '/register' },
  { name: '登录', path: '/login' }
]
const handleRouter = (path: string) => {
  router.push(path)
  }
</script>

<template>
  <div>
    <el-button type="primary" size="small" v-for="item in MenuData" @click="handleRouter(item.path)">{{ item.name }}</el-button>
    <!-- <router-link to="/">Home</router-link>|
    <router-link to="/register">Register</router-link>|
    <router-link to="/login">Login</router-link> -->
  </div>
</template>

<style scoped>

</style>
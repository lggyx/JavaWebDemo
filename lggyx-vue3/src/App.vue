<script setup lang="ts">
import DemoPage from './views/DemoPage.vue';
import PersonPage from './views/PersonPage.vue';
import './assert/style.css';
import Demo001 from './views/Demo001.vue';
import Demo002 from './views/Demo002.vue';
import Demo003 from './views/Demo003.vue';
</script>

<template>
  <div class="dashboard">
    <!-- Vue2写法
    <DemoPage />
    Vue3写法 setup语法糖
    <PersonPage /> -->
    <!-- 在setup语法糖中使用ref
    <Demo001 /> -->
    <!-- 在setup语法糖中使用reactive
    <Demo002 /> -->
    让ref像reactive一样使用
    <Demo003 />
  </div>
</template>

<style scoped></style>

<script lang="ts" setup>
import MenuCom from "../components/MenuCom.vue";
</script>

<template>
  <h1 class="title center">这里是登录</h1>
  <hr/>
  <MenuCom class="center"/>
  <hr/>
  <div class="divCenter">
    <el-card style="height: 40vh;width: 40vw">

    </el-card>
  </div>
</template>

<style scoped>
.divCenter{
  padding-top: 20px;
  display: flex;
  justify-content: center;
  align-items: center;
}
.center {
  text-align: center;
}

.title {
  margin: 20px 0;
  color: #333;
  font-size: 24px;
}
</style>

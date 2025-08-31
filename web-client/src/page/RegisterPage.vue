<script lang="ts">
import { defineComponent } from 'vue'
import MenuCom from "../components/MenuCom.vue";

export default defineComponent({
  name: "RegisterPage",
  components: { MenuCom }
})
</script>

<template>
  <h1 class="title center">这里是注册</h1>
  <hr />
  <MenuCom class="center" />
  <hr />
</template>

<style scoped>
.center {
  text-align: center;
}

.title {
  margin: 20px 0;
  color: #333;
  font-size: 24px;
}
</style>
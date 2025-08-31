<script lang="ts">
import {defineComponent} from 'vue'

export default defineComponent({
  name: "MenuCom"
})
</script>

<template>
  <div>
    <router-link to="/">Home</router-link>|
    <router-link to="/register">Register</router-link>|
    <router-link to="/login">Login</router-link>
  </div>
</template>

<style scoped>

</style>
<script lang="ts" setup>
import MenuCom from "../components/MenuCom.vue";
import { ElButton, ElInput, ElTable, ElTableColumn } from 'element-plus'
import { computed, ref } from 'vue'

interface User {
  date: string
  name: string
  address: string
}

const search = ref('')
const filterTableData = computed(() =>
  tableData.filter(
    (data) =>
      !search.value ||
      data.name.toLowerCase().includes(search.value.toLowerCase())
  )
)
const handleEdit = (index: number, row: User) => {
  console.log(index, row)
}
const handleDelete = (index: number, row: User) => {
  console.log(index, row)
}
const handleAdd = () => {
  console.log('新增')
}
const tableData: User[] = [
  {
    date: '2016-05-03',
    name: 'Tom',
    address: 'No. 189, Grove St, Los Angeles',
  },
  {
    date: '2016-05-02',
    name: 'John',
    address: 'No. 189, Grove St, Los Angeles',
  },
  {
    date: '2016-05-04',
    name: 'Morgan',
    address: 'No. 189, Grove St, Los Angeles',
  },
  {
    date: '2016-05-01',
    name: 'Jessy',
    address: 'No. 189, Grove St, Los Angeles',
  },
]
</script>

<template>
  <h1 class="title center">这里是首页</h1>
  <hr />
  <MenuCom class="center" />
  <hr />
  <el-table :data="filterTableData" style="width: 100%">
    <el-table-column label="Date" prop="date" />
    <el-table-column label="Name" prop="name" />
    <el-table-column align="right">
      <template #header>
        <div style="display: flex; gap: 8px; justify-content: flex-end; align-items: center;">
        <el-input v-model="search" size="small" placeholder="Type to search" />
        <el-button size="small" type="success" @click="handleAdd()"> 添加</el-button>
        </div>
      </template>
      <template #default="scope">
        <el-button size="small" type="primary" @click="handleEdit(scope.$index, scope.row)">
          编辑
        </el-button>
        <el-button size="small" type="danger" @click="handleDelete(scope.$index, scope.row)">
          删除
        </el-button>
      </template>
    </el-table-column>
  </el-table>
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
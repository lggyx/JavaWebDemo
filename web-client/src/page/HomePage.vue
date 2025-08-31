<script lang="ts" setup>
import MenuCom from "../components/MenuCom.vue";
import { ElButton, ElInput, ElTable, ElTableColumn,ElPagination,ElForm,ElDialog,ElFormItem,ElSelect,ElOption } from 'element-plus'
import { computed, ref,reactive } from 'vue'

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
  //打开一个对话框
  dialogFormVisible.value = !dialogFormVisible.value
  dialogTableVisible.value = !dialogTableVisible.value
}
const dialogTableVisible = ref(false)
const dialogFormVisible = ref(false)
const formLabelWidth = '140px'
const form = reactive({
  name: '',
  region: '',
  date1: '',
  date2: '',
  delivery: false,
  type: [],
  resource: '',
  desc: '',
})
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

  <div id="elPagination">
  <el-pagination  size="small" background layout="prev, pager, next" :total="50" />
  </div>



<!-- 对话框 -->
<el-dialog v-model="dialogFormVisible" title="Shipping address" width="500">
    <el-form :model="form">
      <el-form-item label="Promotion name" :label-width="formLabelWidth">
        <el-input v-model="form.name" autocomplete="off" />
      </el-form-item>
      <el-form-item label="Zones" :label-width="formLabelWidth">
        <el-select v-model="form.region" placeholder="Please select a zone">
          <el-option label="Zone No.1" value="shanghai" />
          <el-option label="Zone No.2" value="beijing" />
        </el-select>
      </el-form-item>
    </el-form>
    <template #footer>
      <div class="dialog-footer">
        <el-button @click="dialogFormVisible = false">Cancel</el-button>
        <el-button type="primary" @click="dialogFormVisible = false">
          Confirm
        </el-button>
      </div>
    </template>
  </el-dialog>

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
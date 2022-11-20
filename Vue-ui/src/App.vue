<template>
  <div class="common-layout">
    <el-container>
      <el-aside width="250px">
        <el-avatar src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png"/>
        <h5 class="mb-2">多源异构灾情数据一体化编码管理系统</h5>
        <el-menu
            active-text-color="#ffd04b"
            background-color="#545c64"
            class="el-menu-vertical-demo"
            default-active="2"
            text-color="#fff"
            @open="handleOpen"
            @close="handleClose"
        >

          <el-menu-item index="1">
            <el-icon><icon-menu /></el-icon>
            <span>首页</span>
          </el-menu-item>
          <el-menu-item index="2">
            <el-icon><icon-menu /></el-icon>
            <span>解码数据</span>
          </el-menu-item>
          <el-menu-item index="3">
            <el-icon><document /></el-icon>
            <span>上传图片</span>
          </el-menu-item>
          <el-menu-item index="4">
            <el-icon><setting /></el-icon>
            <span>上传视频</span>
          </el-menu-item>
        </el-menu>
      </el-aside>
      <el-container>
        <el-header>
          <el-row :gutter="20">
            <el-col :span="1"></el-col>
            <el-col :span="16">
              <el-input class="code-input" v-model="input" placeholder="请输入编码（震情码+来
源码+载体码+灾情码）"/>
            </el-col>
            <el-col :span="3">
              <el-button type="info">
                解码
              </el-button>
            </el-col>
            <el-col :span="4">
              <el-button type="info">
                上传文件<el-icon class="el-icon--right"><Upload /></el-icon>
              </el-button>
            </el-col>
          </el-row>
        </el-header>
        <el-main>
          <el-table :data="tableData" style="width:97%" height="500" stripe border>
            <el-table-column prop="no" label="编号" width="124" />
            <el-table-column prop="position" label="参考位置" width="160" />
            <el-table-column prop="time" label="时间" width="160" />
            <el-table-column prop="dataSource" label="数据源" width="120" />
            <el-table-column prop="dataCarrier" label="数据载体" width="100" />
            <el-table-column prop="classify" label="分类" width="100" />
            <el-table-column prop="label" label="标签" width="100" />
            <el-table-column prop="description" label="描述" width="165" />
          </el-table>
        </el-main>
      </el-container>
    </el-container>
  </div>

</template>

<script setup>

import { ref } from 'vue'
const input = ref('')

import { Upload } from '@element-plus/icons-vue';

const tableData = [
  {
    no: '178378925209843627596431243679704563',
    position: '山东省 潍坊市 寿光县',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '文字',
    classify: '失踪',
    label: '受灾程度',
    description: '50平方米',
  },
  {
    no: '082478132983082478132983082478132983',
    position: '四川省 绵阳市 涪城区',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '图片',
    classify: '失踪',
    label: '受灾人数',
    description: 'F:Testother082478132983082478132983082478132983.png',
  },
  {
    no: '483927591023483927591023483927591023',
    position: '山东省 潍坊市 寿光县',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '视频',
    classify: '失踪',
    label: '受灾程度',
    description: 'F:Testother483927591023483927591023483927591023.mp3',
  },
  {
    no: '756284759283756284759283756284759283',
    position: '四川省 绵阳市 涪城区',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '音频',
    classify: '死亡',
    label: '受灾人数',
    description: 'F:Testother756284759283756284759283756284759283.mp4',
  },
  {
    no: '178378925209843627596431243679704563',
    position: '山东省 潍坊市 寿光县',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '文字',
    classify: '失踪',
    label: '受灾程度',
    description: '50平方米',
  },
  {
    no: '082478132983082478132983082478132983',
    position: '四川省 绵阳市 涪城区',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '图片',
    classify: '失踪',
    label: '受灾人数',
    description: 'F:Testother082478132983082478132983082478132983.png',
  },
  {
    no: '483927591023483927591023483927591023',
    position: '山东省 潍坊市 寿光县',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '视频',
    classify: '失踪',
    label: '受灾程度',
    description: 'F:Testother483927591023483927591023483927591023.mp3',
  },
  {
    no: '756284759283756284759283756284759283',
    position: '四川省 绵阳市 涪城区',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '音频',
    classify: '死亡',
    label: '受灾人数',
    description: 'F:Testother756284759283756284759283756284759283.mp4',
  },
  {
    no: '178378925209843627596431243679704563',
    position: '山东省 潍坊市 寿光县',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '文字',
    classify: '失踪',
    label: '受灾程度',
    description: '50平方米',
  },
  {
    no: '082478132983082478132983082478132983',
    position: '四川省 绵阳市 涪城区',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '图片',
    classify: '失踪',
    label: '受灾人数',
    description: 'F:Testother082478132983082478132983082478132983.png',
  },
  {
    no: '483927591023483927591023483927591023',
    position: '山东省 潍坊市 寿光县',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '视频',
    classify: '失踪',
    label: '受灾程度',
    description: 'F:Testother483927591023483927591023483927591023.mp3',
  },
  {
    no: '756284759283756284759283756284759283',
    position: '四川省 绵阳市 涪城区',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '音频',
    classify: '死亡',
    label: '受灾人数',
    description: 'F:Testother756284759283756284759283756284759283.mp4',
  },
  {
    no: '178378925209843627596431243679704563',
    position: '山东省 潍坊市 寿光县',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '文字',
    classify: '失踪',
    label: '受灾程度',
    description: '50平方米',
  },
  {
    no: '082478132983082478132983082478132983',
    position: '四川省 绵阳市 涪城区',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '图片',
    classify: '失踪',
    label: '受灾人数',
    description: 'F:Testother082478132983082478132983082478132983.png',
  },
  {
    no: '483927591023483927591023483927591023',
    position: '山东省 潍坊市 寿光县',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '视频',
    classify: '失踪',
    label: '受灾程度',
    description: 'F:Testother483927591023483927591023483927591023.mp3',
  },
  {
    no: '756284759283756284759283756284759283',
    position: '四川省 绵阳市 涪城区',
    time: '2022-11-6 15:38:22',
    dataSource: '后方地震应急指挥部',
    dataCarrier: '音频',
    classify: '死亡',
    label: '受灾人数',
    description: 'F:Testother756284759283756284759283756284759283.mp4',
  },
]

</script>

<style>
/*.el-table {*/
/*  margin-left: 140px;*/
/*  margin-top: 8%;*/
/*}*/

.el-header {
  margin-top: 10%;
}

.code-input {

}

</style>

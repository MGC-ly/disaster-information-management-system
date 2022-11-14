<template>
  <el-table :data="tableData" style="width: 79%" height="540" stripe border>
    <el-table-column prop="no" label="编号" width="124" />
    <el-table-column prop="position" label="参考位置" width="160" />
    <el-table-column prop="time" label="时间" width="160" />
    <el-table-column prop="dataSource" label="数据源" width="120" />
    <el-table-column prop="dataCarrier" label="数据载体" width="100" />
    <el-table-column prop="classify" label="分类" width="100" />
    <el-table-column prop="label" label="标签" width="100" />
    <el-table-column prop="description" label="描述" width="165" />
  </el-table>
</template>

<script setup>
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
.el-table {
  margin-left: 140px;
  margin-top: 8%;
}
</style>

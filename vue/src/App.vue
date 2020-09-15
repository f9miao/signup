<template>
  <div id="app">
    <el-container>

      <el-header>
        <Header/>
      </el-header>

      <el-main>
        <router-view/>
      </el-main>

      <el-footer>
        <Footer></Footer>
      </el-footer>

    </el-container>
  </div>
</template>

<script>
  import Footer from "./components/Footer";
  import Header from "./components/Header";
  export default {
    name: 'App',
    components: {
      Header,
      Footer,
    }
  }
</script>

<style>

</style>

<style scoped>
  .el-header{
    width: 100%;
    padding: 0 0 0 0;
  }
  .el-footer{
    width: 100%;
    height: 120px;
    padding: 0 0 0 0;
  }
  .el-main{
    width: 100%;
    padding: 0 0 0 0;
  }
</style>

<template>
  <div id="app">
    <el-container>

      <el-main>
        <SignupForm></SignupForm>
      </el-main>

      <el-footer>
        <Footer></Footer>
      </el-footer>

    </el-container>
  </div>
</template>

<script>
  import SignupForm from "./components/SignupForm";
  import Footer from "./components/Footer";
  export default {
    name: 'App',
    components: {
      Footer,
      SignupForm
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

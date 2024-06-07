<template>
  <div id="app">
    <el-container>
        <el-header style="background-color: #333333;height:125px">
            <img src="@/assets/logo.svg" alt="" style="height:100px;position:relative;top:10px">
            <span style="font-size:20px;margin-left:15px;color:white">湘潭大学电子图书馆</span>
        </el-header>
    </el-container>

    <el-container>
        <el-aside style="overflow:hidden;min-height:100vh;background-color:#535c64;width:250px">

          <el-menu
              :default-active="$route.path"
              active-text-color="#ffd04b"
              background-color="#545c64"
              class="el-menu-vertical-demo"
              router
              text-color="#fff"
              @open="handleOpen"
              @close="handleClose"
          >
            <el-menu-item index="/">
              <el-icon><icon-menu /></el-icon>
              <span>系统首页</span>
            </el-menu-item>

            <el-sub-menu index="2">
              <template #title>
                <el-icon><location /></el-icon>
                <span>用户管理</span>
              </template>
                <el-menu-item index="/admin">管理员信息</el-menu-item>
                <el-menu-item index="2-2">用户信息</el-menu-item>
            </el-sub-menu>

            <el-sub-menu index="3">
              <template #title>
                <el-icon><location /></el-icon>
                <span>信息管理</span>
              </template>

              <el-menu-item index="3-1">xx信息</el-menu-item>
              <el-menu-item index="3-2">yy信息</el-menu-item>
            </el-sub-menu>

            <el-menu-item index="4" disabled>
              <el-icon><document /></el-icon>
              <span>Navigator Three</span>
            </el-menu-item>

          </el-menu>

        </el-aside>

        <el-main>
          <router-view/>
        </el-main>
    </el-container>
  </div>
</template>

<style>
.el-menu{
  boder-right:none !important;
}
</style>
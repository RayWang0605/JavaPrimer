#Git命令
##一、 初始换并推送到远端仓库
###基本命令
1. git init // 在当前文件夹初始化（在工程文件目录使用该命令也可）
2. git add
3. git commit
4. git remote add origin xxxx(远端仓库url) // 添加远端仓库
5. git pull origin master // 拉取远端库
6. git push -u origin master // 推送至远端

###其他命令
1. 远端仓库地址修改
   + 方案一: 先删除后添加
     + git remote rm origin
     + git remote add origin xxx
   + 方案二: 直接修改
     + git remote origin set-url xxx
   + 方案三: 修改config文件 




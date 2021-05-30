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
    
##二、 git pull 和 git push
### pull
+ 将 远端 指定分支 拉取到 本地 指定分支 上
    + git pull <远端仓库名> <远端分支>:<本地分支>
+ 将远端指定分支 拉取到 本地 当前分支上
    + git pull <远端仓库名> <远端分支名>
+ 将与本地当前分支同名的远端分支 拉取到 本地当前分支上
    + git pull <远端仓库名>
### push
+ 将本地当前分支 推送到 远程指定分支上（注意：pull是远程在前本地在后，push相反）
    + git push <远程仓库名> <本地分支名>:<远程分支名>
+ 将本地当前分支 推送到 远程指定分支上
    + git push <远程仓库名> <远程分支名>
+ 将本地当前分支 推送到 与本地当前分支同名的远程分支上
    + git push <远程仓库名>

### mvn 更新父子版本号
```$xslt
mvn versions:set -DnewVersion=0.0.2-SNAPSHOT
mvn versions:update-child-modules
```

### 执行命令将db.php加入不提交队列

git update-index --assume-unchanged include/db.php

### 执行命令将db.php取消加入不提交队列

git update-index --no-assume-unchanged include/db.php

### 工程说明
```$xslt
jspider 爬虫获取jlib数据
```
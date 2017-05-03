
### mvn 更新父子版本号
```$xslt
mvn versions:set -DnewVersion=0.0.2-SNAPSHOT
mvn versions:update-child-modules
```
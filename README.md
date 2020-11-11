# shop

## mybatis逆向工程

#### 使用

- 修改generatorConfig.xml文件
  1. classPathEntry修改成对应mysql-connector-java.jar包对应的地址
  2. 配置数据库信息jdbcConnection：数据库地址 用户名 密码
  3. javaModelGenerator修改成对应model生成的路径（targetProject前面加上../）
  4. sqlMapGenerator修改对应mapper生成的路径
  5. javaClientGenerator修改对应dao接口生成的路径
  6. table修改想要从该表名tableName生成，domainObjectName为生成的对象名
- 点击maven插件栏，双击运行mybatis-generator


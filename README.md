# shop

## 规范

- 业务代码统一放在business包下，在business包下建立对应业务模块的包，如user
- 业务模块包下建立web,service,dao,model,entity等包，分别放置控制层类，服务类，mapper类，封装类javabean，数据库javabean
- 控制层类命名为..Controller，服务类接口命名为..Service，实现类命名为..ServiceImpl，mapper类命名为..Mapper，自定义mapper类命名为New..Mapper
- 控制层一般返回json对象为ReturnJson类
- 配置类统一放在base.configuration下，命名..Configure
- 静态变量统一放在base.constant下根据模块自定义静态内部类
- 工具类统一放在base.utils下，命名..Util

## 启动项目

- 项目启动类为ShopApplication.class
- 项目配置文件默认application.properties，可通过spring.profiles.active=dev激活application-dev.properties配置
- 项目启动前需要修改当前数据库配置为本地数据库配置

## mybatis逆向工程使用

- 修改generatorConfig.xml文件
  1. classPathEntry修改成对应mysql-connector-java.jar包对应的地址
  2. 配置数据库信息jdbcConnection：数据库地址 用户名 密码
  3. javaModelGenerator修改成对应model生成的路径（targetProject前面加上../）
  4. sqlMapGenerator修改对应mapper生成的路径
  5. javaClientGenerator修改对应dao接口生成的路径
  6. table修改想要从该表名tableName生成，domainObjectName为生成的对象名
- 点击maven插件栏，双击运行mybatis-generator

## 使用分页插件

- 在当前查询语句之前使用 PageHelper.startPage(pageNum,pageSize)指定分页的页码和显示的数量
- 返回的list结果集使用PageInfo进行包装后返回（注意不是github上面的PageInfo）

## 使用Swagger

- Swagger是用来显示接口文档并且可以直接调用接口，地址为 http://ip:port/swagger-ui.html
- 在控制层添加类注解@Api(tags = "描述")，在接口方法上添加方法注解@ApiOperation(value = "接口描述")，还有方法注解@ApiImplicitParams({@ApiImplicitParam(name = "参数名", value = "参数值")，... })
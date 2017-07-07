# dubbo-exercise
spring + spring boot + mybatis + zookeeper

provider 注意事项：
1、util包的MyMapper<T> 不要被扫描到，否则可能会出错
2、serviceImpl的注解用的dubbo的@Service注解，
    但是并没有放到spring的applicationContext
    里面去，所以要加上@Component注解
3、AppConfig可以不用，直接把注解写到MyBatisConfig,但是这样配置分的清一点


consumer 注意事项

1、因为引入了springboot，它的log用的是logback，与其他包的一个
    SLF4J冲突，删除冲突的包就好了
2、dubbo引入接口好像不能再controller引入，官方给的代码示例就在
    service层

api注意事项

1、要传输的实体类必须事项 Serializable 接口

chapter12
    企业级项目在搭建的时候，最不可或缺的一部分就是日志，日志可以用来调试程序，打印运行日志以及错误信息方便于我们后期对系统的维护，在SpringBoot兴起之前记录日志最出色的莫过于log4j了，对于目前来说项目还有很多在用log4j来记录日志。
    SpringBoot内部集成了LogBack日志依赖，SpringBoot默认使用LogBack记录日志信息，默认根据base.xml配置内容来输出到控制台和文件之中。
    LogBack读取配置文件的步骤
    （1）尝试classpath下查找文件logback-test.xml
    （2）如果文件不存在，尝试查找logback.xml
    （3）如果两个文件都不存在，LogBack用BasicConfiguration自动对自己进行最小化配置，这样既实现了上面我们不需要添加任何配置就可以输出到控制台日志信息。

    接下来我们在resources目录下创建名叫logback.xml的文件，并且添加日志配置输出到文件内按天存储到不同的文件之中。
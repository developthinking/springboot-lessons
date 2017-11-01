chapter17
    使用SpringSecurity让SpringBoot项目更安全

    SpringSecurity是专门针对基于Spring项目的安全框架，充分利用了依赖注入和AOP来实现安全管控。
    在很多大型企业级系统中权限是最核心的部分，一个系统的好与坏全都在于权限管控是否灵活，是否颗粒化。
    在早期的SpringSecurity版本中我们需要大量的xml来进行配置，而基于SpringBoot整合SpringSecurity框架相对而言简直是重生了，简单到不可思议的地步。

    SpringSecurity框架有两个概念认证和授权，认证可以访问系统的用户，而授权则是用户可以访问的资源，下面我们来简单讲解下SpringBoot对SpringSecurity安全框架的支持。
    在SpringBoot项目中使用SpringSecurity安全框架实现用户认证以及授权访问。

    SpringSecurity来作为安全框架，并通过SpringSecurity提供的JSTL标签库来判断界面的输出，
    还有如果修改了用户的权限不会实时生效，而需要我们退出用户后再次登录方可生效。
#### 定义
Provide a unified interface to a set of interfaces in a subsystem.Facade defines a higher-level interface that makes the subsystem easier to use.
（要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。外观模式提供一个高层次的接口，使得子系统更易于使用。）

#### 角色定义
- Facade 外观角色
  客户端可以调用这个角色的方法，此角色知晓子系统的所有功能。该角色的功能是将客户端发来的请求委派到相应的子系统中
- SubSystem 子系统
  可以有多个子系统，可能有多个并不相关的类。作为子系统，并不知道Facade角色的存在，facade在他们看来只是个简单的客户端调用 
  
#### 应用场景
- 为一个复杂的模块或系统提供一个统一的外界访问接口
- 子系统相对独立，子系统相当于是一个黑箱。   
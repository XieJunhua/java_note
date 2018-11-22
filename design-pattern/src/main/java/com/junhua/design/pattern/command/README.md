#### 定义
“Encapsulate a request as an object,thereby letting you parameterize clients with different requests,queue or log requests,and support undoable operations.（将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。）”

#### 角色定义
- Receive 接收角色
具体干活的角色，执行命令

- Command 命令角色
定义需要执行的命令

- Invoker 调用者角色
接收到命令，并传递命令给具体的接收执行者

#### 应用场景
- 类间解耦
调用者角色和接收者角色之间没有任何依赖关系，调用者实现功能时只需要Command抽象类的execute方法就可以了，不需要了解到底是哪个接收者执行

#### 模型缺点
命令较多的时候，会导致产生很多Command类的子类
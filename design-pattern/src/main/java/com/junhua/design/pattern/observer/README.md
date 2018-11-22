#### 定义
Define a one-to-many dependency between objects so that when one object changes state,all its dependents are notified and updated automatically.（定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。）

#### 角色定义
- Subject被观察角色
  定义被观察者的职责，能动态的增删观察者，通知观察者
- Observer观察者
  接收消息，随即进行update操作
- ConcreteSubject具体的被观察者
  具体定义被观察者的业务逻辑
- ConcreteObject具体的观察者
  对接收到的消息进行具体的反应
  
#### 应用场景
- 解耦了观察者和被观察者
  观察者和被观察者都可以很方便的扩展
- 事件多级触发的场景
- 发布订阅的场景          
  
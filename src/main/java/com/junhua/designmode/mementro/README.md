#### 定义
Without violating encapsulation,capture and externalize an object's internal state so that the object can be restored to this state later.
（在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。）

备忘录模式就是一个根据对象的状态(属性)，提供一种程序备份的方法

#### 角色定义
- Originator 发起人角色定义
  记录当前时刻的内部状态，定义哪些状态需要备份，提供创建和恢复备忘的功能
- Memento 备忘录角色
  负责存储Originator发起人对象的内部属性，在需要的时候，提供属性
- Caretaker 备忘录管理员角色
  对备忘录进行管理，保存和提取
  
#### 使用场景
- 需要保存和恢复数据的相关状态的场景
- 需要提供一种回滚操作的场景
- 数据库连接的事务管理      
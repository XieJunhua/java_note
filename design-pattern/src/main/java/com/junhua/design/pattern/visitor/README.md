#### 定义
Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates. （封装一些作用于某种数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。）

#### 角色定义
- Visitor 抽象访问者
  抽象类或者接口，声明访问者可以访问哪些元素，具体到程序中就是visit方法的参数定义哪些对象是可以被访问的
- ConcreteVisitor 具体访问者
  具体实现访问者访问到一个类后该怎么干
- Element 抽象元素
  声明接受哪一类访问者访问，程序上通过accept方法中的参数来定义
- ConcreteElement 具体元素
  实现accept，通常是visitor.visit(this)
- ObjectStructure 结构对象
  元素产生者，一般是一个容纳多个不同类，不同接口的容器，List，Set，Map等
  
#### 使用场景
- 业务规则要求遍历多个不同的对象        
     
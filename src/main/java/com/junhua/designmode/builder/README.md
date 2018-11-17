#### 定义
“Separate the construction of a complex object from its representation so that the same construction process can create different representations.”

将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

#### 角色定义
- 产品类 要生产的模型。最好在产品类中定义模板方法，来实现构建过程中具体顺序的执行
- Builder 抽象建造者。规范产品
- ConcreteBuilder 具体建造这。实现具体的构建
- Director 导演类 按照规则安排好所需的模块，调用具体的Builder构造产品

#### 使用场景
- 相同的方法，不同的执行顺序，产生不同事件结果时，可以采用构造方法
- 多个零部件，按照不同顺序，不同组合成不同的结果时

#### 注意事项
建造者模式与工厂模式的区别在于，建造者模式关注的是零部件装配顺序和排列组合，而工厂方法模式关注的是创建本身这个行为，而并不关心组装顺序什么的。同为创建类，但是关注的重点不同
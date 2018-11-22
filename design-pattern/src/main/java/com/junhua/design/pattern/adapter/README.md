#### 定义
Convert the interface of a class into another interface clients expect.Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.（将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。）

#### 角色定义
- Target角色
  目标接口，希望转换为的接口
- Adaptee 源角色
  待转换的角色，已存在的，并运行良好的类
- Adapter 适配器角色
  适配器模式的核心角色，注意在适配器模式中，其他两个角色都是事先存在的，而是适配器角色是后面新建的
  它的职责是将源角色转换为目标角色，主要通过继承或者类关联(因为java中只支持单继承，所以有多个类的时候，就只能用类关联)
  
  
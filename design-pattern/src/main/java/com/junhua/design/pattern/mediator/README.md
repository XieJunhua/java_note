#### 定义
“Define an object that encapsulates how a set of objects interact.Mediator promotes loose coupling by keeping objects from referring to each other explicitly,and it lets you vary their interaction independently.（用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变它们之间的交互。）”

#### 角色定义
- Mediator 抽象中介者：抽象中介者定义中介者统一接口，用于各同事角色之间通信
- Concrete Mediator 具体中介者：实现和同事角色之间通信的逻辑
- Colleague 同事角色: 每个同事角色之间不进行直接通信，而是通过中介者来进行通信

#### 使用场景
多个对象耦合紧密的情况下，进行解耦。使类之间呈现出一个星型拓扑结构
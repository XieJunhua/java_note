#### 定义
Compose objects into tree structures to represent part-whole hierarchies.Composite lets clients treat individual objects and compositions of objects uniformly.（将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性。）
组合模式又叫部分-整体模式，主要用来描述部分与整体的关系

#### 角色定义
- Component 抽象构建角色
  定义参加组合对象的行为和属性
- Leaf 节点
  终点对象，不再包含其他的Component对象
- Composite 树枝构件
  组合树枝节点和叶子节点形成树形结构，非终点节点。
  
#### 使用场景
- 维护部分-整体关系的场景，如树形菜单，文件夹等。
- 节点自由的增删。对节点的操作成本很低，想增加节点，或者调整分支数量都比较简单。      
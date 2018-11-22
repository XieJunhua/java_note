#### 定义
Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.Chain the receiving objects and pass the request along the chain until an object handles it.（使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。）

责任链模式的重点在"链"上，由一条链去处理相识的请求，在链中决定谁来处理这个请求，并返回相应的结果

#### 角色定义
在处理者中要定义好三个方法
- setNext
- handleRequest
- processRequest

#### 模式的应用
- 优点：将请求和处理分开。请求者不用关心是谁处理了具体的请求，处理者也不用关心请求的全貌，两者解耦，提供系统的灵活性。
- 缺点：每个请求都需要便利整个责任链，在性能上会有影响
public class StaticDemo{
static int staticVariable=10;
int instanceVariable=20;
static{
System.out.println("Inside static block");
}
void instanceMethod(){
System.out.println("Inside instance method");
}
static void staticMethod(){
System.out.println("static method");
}
static class staticNestedclass{
void nestedclassMethod(){
System.out.println("Inside static nested class method");
System.out.println("Accessing static variable from nested class:"+staticVariable);
staticMethod();
}
}
public static void main (String[] args){
StaticDemo demo = new StaticDemo();
System.out.println("Instance variable value:"+demo.instanceVariable);
demo.instanceMethod();
staticMethod();
staticNestedclass nestedclass=new staticNestedclass();
nestedclass.nestedclassMethod();
}
}




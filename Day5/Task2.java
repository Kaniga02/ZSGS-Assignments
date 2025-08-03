/*Can we override private method, constructor, static method, final method? Illustrate with an example.
‌ */
//Package Day5;
public class Task2 {
    public static void main(String[] args) {
        Parent obj = new Child();
        // obj.privateMethod();
        // obj.staticMethod();
        obj.normalMethod();
    }
}

class Parent {
    private void privateMethod() {
        System.out.println(" Parent : Privatemethod ");
    }
    static void staticMethod() {
        System.out.println("Parent : StaticMethod");
    }
    final void finalMethod() {
        System.out.println("Parent : finalMethod");
    }
    Parent() {
        System.out.println("Parent Constructor");
    }

    void normalMethod() {
        System.out.println("Parent: normalMethod");
    }
}
 
class Child extends Parent{
    //Not inherited → not overridden. 
    @override
    private void privateMethod() {
        System.out.println("Child: privateMethod");
    }
    @override
    static void staticMethod() { //Method hiding, not overriding
        System.out.println("Child: staticMethod");
    }
    ////Cannot be overridden → compile-time error
    // final void finalMethod() {
    //     System.out.println("Child: finalMethod");

    // }
    Child() { //Not inherited
        System.out.println("Child Constructor");
    }
    @override
    void normalMethod() {
        System.out.println("Child: normalMethod");
    }
}

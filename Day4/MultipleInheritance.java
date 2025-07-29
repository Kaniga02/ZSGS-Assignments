class A {
    void displayA() {
        System.out.println("Class A method");
    }
}

class B {
    void displayB() {
        System.out.println("Class B method");
    }
}

class MultipleInheritance extends A, B {
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.displayA();
    }
}
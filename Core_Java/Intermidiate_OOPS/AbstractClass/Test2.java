package Core_Java.Intermidiate_OOPS.AbstractClass;

public abstract class Test2 {

    public void printSomething() {
        System.out.println("Hello From  abstract class");
    }
}

class NewClass {

    public static void main(String[] args) {

        Test2 obj = new Test2();// WE CAN NOT INSTANTIATE ABSTRACT CLASS
    }
}

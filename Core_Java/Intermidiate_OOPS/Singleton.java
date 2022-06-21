package Core_Java.Intermidiate_OOPS;

public class Singleton {

    private Singleton() {
        System.out.println("single ton constructor");
    }

    class Driver extends Singleton {
        public static void main(String[] args) {

        }
    }

}

package pt.com.srg.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        System.out.println(EagerInitializedSingleton.getInstance());
        System.out.println(LazyInitializedSingleton.getInstance());
    }
}

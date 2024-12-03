package a1203.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonLogger logger = SingletonLogger.getInstance();
        logger.log("This is a log message");

        SingletonLogger anotherLogger = SingletonLogger.getInstance();
        anotherLogger.log("This is anotehr log massage.");

        if(logger == anotherLogger){
            System.out.println("Both logger instances are the same");
        }
    }
}

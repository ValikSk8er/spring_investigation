package messanger;

public class HelloWorld {
    public static void main(String[] args) {

        version1();
        version2(args);
        version3();

    }

    public static void version1() {
        System.out.println("-------v1------");

        System.out.println("Hello world!");
    }


    public static void version2(String[] args) {
        System.out.println("-------v2------");

        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello world!");
        }
    }

    public static void version3() {
        System.out.println("-------v3------");

        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();

        mr.setMessageProvider(mp);
        mr.render();
    }
}

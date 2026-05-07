package december;
class Example extends java.lang.Object {
    static int a;
    static int b;
    int x;

    Example(int p) {
        super();
        this.x = 20;
        System.out.println("IPC");
    }

    static {
        Example.a = 10;
        { System.out.println("SB1"); }
        Example.b = 20;
        { System.out.println("SB2"); }
    }
}

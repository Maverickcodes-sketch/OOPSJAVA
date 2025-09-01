interface  inter1
{
    //if interface has no method then it is known as marker: used for serialization
    //if one method then functional interface
    int x=112;//by default public static final
    void method();//by default public abstract
}
interface inter2
{
    int x=115;
    void method2();
}

public class test1 implements inter1,inter2
{
    public static void main(String[] args) {
        System.out.println("main entry point");
        System.out.println(inter2.x);
        int x=132;
        System.out.println(x);
        test1 a=new test1();
        a.method();
        a.method2();
    }
    @Override
    public void method() {
        System.out.println("inside method");
    }

    @Override
    public void method2() {
        System.out.println("inside method2");

    }
}


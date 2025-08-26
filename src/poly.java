//static or compiletime
public class poly {
    public static void main(String[] args) {
        System.out.println("A");
        poly check=new poly();
        check.al(1);
        check.al('a');
    }
    void al(int a)
    {
        System.out.println("B");
    }
    void al(char a)
    {
        System.out.println("C");
    }
}

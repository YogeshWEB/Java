/**
 * Demo of instance
 */
class Demo {
    int num1=2;
    int num2=3;
    public void print(){
        System.out.println(num1);
        System.out.println(num2);
    }
}

public class instance {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        obj1.num1=20;
        obj1.num2=30;
        obj1.print();
    }
}

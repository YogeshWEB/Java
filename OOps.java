

class Calculator{
    public int add(int n1,int n2){
        int r = n1+n2;
        return r;
    }
    public int sub(int n1,int n2){
        int r= n1-n2;
        return r;
    }
    public long mul(int n1,int n2){
        long r= n1*n2;
        return r;
    }
    public int div(int n1,int n2){
        int r= n1/n2;
        return r;
    }
}





public class OOps {
    public static void main(String[] args) {
        int n1=4;
        int n2=5;
        Calculator calc = new Calculator();
        int res = calc.add(n1, n2);
        System.out.println(res);
        res= calc.sub(n1, n2);
        System.out.println(res);
        res = (int)calc.mul(n1, n2);
        System.out.println(res);
        res = calc.div(n1, n2);
        System.out.println(res);

    }
}


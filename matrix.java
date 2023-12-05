public class matrix {
    public static void main(String[] args) {

        int num[][]= new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                num[i][j]=(int)(Math.random()*10);//random method give the value between 0.0-1.0
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(num[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}

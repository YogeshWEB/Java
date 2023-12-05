import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        int x=5;
        int y=6;
        boolean result = x<y;
        System.out.println(result);
        System.out.println(userName);
        myObj.close();
    }
}

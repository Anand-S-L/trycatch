import java.util.Scanner;
public class TRYCATCH {

    public static void main(String[] args) {
        while (true){
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("option 1: Arithematic error");
                System.out.println("option 2: Array index outofbounds exception");
                System.out.println("option 3: Exit");
                System.out.println("Enter the option:");
                int option= input.nextInt();
                switch (option){
                    case 1:
                        int x=12;
                        int y=0;
                        int z=x/y;
                        System.out.println(z);
                        break;
                    case 2:
                        int [] array = new int[3];
                        System.out.println(array[3]);
                        break;
                    case 3:
                        return;
                }

            }
            catch (ArithmeticException v){
                System.out.println(v);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }}

}
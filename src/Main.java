/**
 * Created by Mahi on 2/6/2017.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        System.out.print("Please Enter unmber: ");
        int i;

        while(sn.hasNext()) {
            //System.out.print(i);

            i = sn.nextInt();

            if(i==1){
                Class1 c1 = new Class1();
                c1.print();
            }
            else if(i==2){
                Class2 c2 = new Class2();
                c2.print();
            }
            else if(i==3){
                Class3 c3 = new Class3();
                c3.print();
            }

        }

    }
}

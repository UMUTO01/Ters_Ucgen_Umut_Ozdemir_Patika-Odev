import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the line number: ");

        int a = scan.nextInt();
        int d = a;
        int p = a ;
        int CheckList =0;

        int AbsoluteMerhc = 1;

        //for(int c = 0; c < a; c ++ ){
        int Truth =0;
        while ( Truth ==0){

          if(AbsoluteMerhc !=0){

              for ( int delta = 1; delta<= AbsoluteMerhc; delta++){
                  System.out.print(" ");
              }
              AbsoluteMerhc++;
          }

          for(int b = 0; b < (d*2)-1; b++){
                System.out.print("*");
            }
            System.out.print("\n");
            d--;

            CheckList++;

            if(CheckList < a){
                Truth =0;
            }
            else {
                Truth = 1;
            }


        }
    }
}

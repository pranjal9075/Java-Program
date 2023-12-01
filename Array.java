import java.util.Scanner;
public class Array{
    static int i,cal,size;
    
    public static void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size=");
        size=sc.nextInt();
        static int[] num=new int[size];
        System.out.println("Enter\t"+size+"\tNumber");
        for(i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        Smallest(num);
        Ascending(num);
        Decending(num);
         }
    public static void Smallest(int num[]){
        cal=num[0];
        for(i=0;i<size;i++){
            System.out.println("Number"+num[i]);
            if(num[i]<cal)
                cal=num[i];
        }
    
    System.out.println("The smallest number is="+cal);
    }
    public static void Ascending(int num[]){
        System.out.println("Array Element is Ascending Order");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            System.out.print(num[i] + "\t");
        }
        System.out.println();
    }
    public static void Decending(int num[]){
        System.out.println("Array Element is Descending Order");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            System.out.print(num[i] + "\t");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args){
        accept();
        
    }
     }

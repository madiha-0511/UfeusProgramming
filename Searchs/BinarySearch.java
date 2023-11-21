import java .util.Scanner;

public class BinarySearch{
    public static void main(String args[]){
        int BS[]={1,3,5,7,8,9,12,14,16,18};
        int Start=0;
        int End=BS.length-1;
        //int key=8;
        int flag=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Key:  ");
        int key = sc.nextInt();
        while(Start<=End){
            int Mid=(Start+End)/2;
            if(BS[Mid]== key){
                flag=Mid;
                System.out.print("Key is present at "+flag+" index");
                break;
            }
            else if(BS[Mid]>key){
                End=Mid-1;
            }
            else{
                Start=Mid+1;
                
            }
        }
        if(flag == 0){
                System.out.println("key is not Found");
            }
        
    }

}
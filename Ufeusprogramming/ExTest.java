public class ExTest{
public static void main(String[] args) { 
    //example 1
     int x = 2; 
     int y = 5;
     int expl = (x * y / x);
     int exp2 = (x * (y / x));
     System.out.print(expl+",");
     System.out.println(exp2);
    //example2
     int p = 9, q = 12;
     int a = 2, b = 4, c = 6;
     int exp = 4/3*(p+34)+9*(a+b*c)+(3+q*(2+a))/(a+b*q);
     //         1 *  43  +9*   26  +     51    /   50
     //             43   +   234   +           1        =278
     System.out.println(exp);
     

     //example3
     int i=10, j=5;
     int exp3=(j*(i/j+i/j));
            // 5*  2 +  2    =20
     int exp4=(j*i/j+j*i/j);
              /* 5* 2 +5*  2
                10  +  10   =20*/
     System.out.println(exp3);
     System.out.println(exp4);



    }
}
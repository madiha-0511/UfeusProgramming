class AssignmentOp{
    public static void main(String args[]){
        //declear 2 operand means input values
        int val1=20, val2=5;

        //= operator means vlaue assingn to vairable
        System.out.println(val1);
         System.out.println(val2);

        //== operater it is used to check two values are equals means a=b
        int val3=20;
        boolean result=(val1==val3);
        System.out.println(result);

        // operand1+=operand2 means operand1=operand1+operand2
         System.out.println("val1= "+(val1+=val2));//20+5=25

        //operand1-=operand2 means operand1=operand1-operand2
         System.out.println("val1 = "+(val1-=val2));//25-5=20

        //operand1*=operand2 means operand1=operand1*operand2
         System.out.println("val1 = "+(val1*=val2));//20*5=100

        //operand1/=operand2 means operand1=operand1/operand2......it gives Quotion
         System.out.println("val1 = "+(val1/=val2));//100/5=20

        //operand1%=operand2 means operand1=operand1%operand2......it gives reminder
        System.out.println("val1 = "+(val1%=val2));//20%5=0
        int a=5, b=3;
         System.out.println("a = "+(a%=b));//5%3=2



    }
}
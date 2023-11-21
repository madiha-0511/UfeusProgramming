class UnaryOp{
    public static void main(String args[]){
        int a=10, b=11;

         System.out.println("Increment Operator:");
        //Increment Operator  1)pre-increment operator   2)post-increment operator
        //firstly value of a increment by 1 then use 
        System.out.println("Pre-Increment Operator:");
        System.out.println(++a);//a=10 here firstly 'a' is  increment by 1 then use so a=11
        System.out.println(++b);//similarly b=11->b=12

        //firstly use then value of a increment by 1
        System.out.println("Post-Increment Operator:");
        System.out.println(a++);//when we use 'a' last time that value is 11 so here firstly 'a' is used means a=11 print then 'a' is increment by 1 i.e a->12
        System.out.println(b++);//similarly b=12 print after that b=13

        System.out.println("After that Operation a and b values:");
        System.out.println(a);//a=12
        System.out.println(b);//b=13
        


        System.out.println("Decrement Operator:");
        //Decrement Operator  1)pre-decrement operator   2)post-decrement operator
        //firstly value of a decrement by 1 then use 
        System.out.println("Pre-Decrement Operator:");
        System.out.println(--a);//a=12 here firstly 'a' is  decrement by 1 then use so a=11
        System.out.println(--b);//similarly b=13->b=12

        System.out.println("Post-Decrement Operator:");
        //firstly use then value of a decrement by 1
        System.out.println(a--);//when we use last time 'a' that value is 11 so here firstly 'a' is used means a=11 print then 'a' is decrement by 1 i.e a->10
        System.out.println(b--);//similarly b=12 print after that b=11

        System.out.println("After that Operation a and b values:");
        System.out.println(a);//a=10
        System.out.println(b);//b=11

        




    }
    
}
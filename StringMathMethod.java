class StringMathMethod{
    public static void main(String args[]){
        //declear value
        int a=16, b=27;
        // to Find Largest Value among given Values
        System.out.println(Math.max(a,b));
         // to Find Smallest Value among given Values
        System.out.println(Math.min(a,b));
         // to Find squreRoot of given Value
        System.out.println(Math.sqrt(a));
        System.out.println(Math.sqrt(b));
        // to Find cubeRoot of given Value
        System.out.println(Math.cbrt(a));
        System.out.println(Math.cbrt(b));
        //
        int c=-56, d=45;
        System.out.println(Math.abs(c));
        System.out.println(Math.abs(d));
        // to Find power of x raise to y
        int x=2, y=3, z=-3;
        System.out.println(Math.pow(x,y));
        System.out.println(Math.pow(x,z));
        // 
        double e=14.56;
        System.out.println(Math.round(e));
        System.out.println(Math.floor(e));
        System.out.println(Math.ceil(e));
        //
        int n=45;
        System.out.println(Math.toRadians(n));

        

    }
}
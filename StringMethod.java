class StringMethod{
    public static void main(String args[]){
        //create String
        String s1="  Madiha";
        String s2=new String("Hello World ");
        //Print Both String
        System.out.println(s1);
        System.out.println(s2);
        //To calculate Length of String
        System.out.println(s1.length());
        System.out.println(s2.length());
        //To convert String Into Upper Case
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());
        //To convert String Into Lower Case
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toLowerCase());
        //To find in which index which character is their
        System.out.println(s1.charAt(4));
        System.out.println(s2.charAt(4));
        //To find subString in specify Relation
        // String s3=s2.subString(World);
        // System.out.println(s2.subString(ld););
        // System.out.println(s3);
        //to Remove Lef and Right spaces in  Given String
        System.out.println(s1.trim());
        System.out.println(s2.trim());
        //Replace 
        String s3="Honey";
        System.out.println(s3.replace("H","M"));
        


        

    }
}
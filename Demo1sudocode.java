class Demo1sudocode{
    public static void main(String args[]){
        int x=259;
        if(x==0){
            System.out.print(0);

        }
        else if(x%9==0){
            System.out.print(9);

        }
        else{
            System.out.print(x%9);
        }
        
    }
}
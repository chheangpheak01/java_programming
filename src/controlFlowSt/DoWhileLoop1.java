package controlFlowSt;

public class DoWhileLoop1{
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        do{
            Thread.sleep(100);
            System.out.println("Result : " + i );
            i ++;
            if(i == 10){
                break;
            }
        }while(i>0);
    }
}



package controlFlowSt;

public class DoWhileLoop2 {
    public static void main(String[] args) throws InterruptedException {
        char cha = 'A';
        do{
            Thread.sleep(100);
            System.out.print(" " + cha + " ");
            cha ++;
            if(cha == 'Z'){
                break;
            }
        }while(cha != 'Z');
    }
}

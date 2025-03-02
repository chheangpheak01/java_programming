package controlFlowSt;

public class DoWhileLoop3 {
    public static void main(String[] args) {
        int num = 0;
        do{
            num ++;
            if(num == 10){
                continue;
            }
            System.out.print(" " + num + " ");
            if(num == 20){
                break;
            }
        }while (num>0);
    }
}

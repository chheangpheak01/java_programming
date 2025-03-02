package controlFlowSt;

public class DoWhileLoop5 {
    public static void main(String[] args) {
        for(int a=0;a<=10;a++){
            mylable:
            for(int b=0;b<10;b++){
                for(int c=1;c<10;c++){
                    if(c%2 ==0){
                        break mylable;
                    }
                    System.out.print(a);
                }
            }
        }
    }
}

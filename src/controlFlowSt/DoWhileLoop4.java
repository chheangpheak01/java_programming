package controlFlowSt;

public class DoWhileLoop4 {
    public static void main(String[] args) {
        mylable:
        for(int i=0;i<10;i++){
            for(int j=1;j<10;j++){
                if(j%2 == 0){
                    break mylable;
                }
                System.out.println("I = " + i + " J : " + j);
            }
        }
    }
}

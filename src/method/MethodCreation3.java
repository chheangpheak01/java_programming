package method;

public class MethodCreation3 {
    public static void findDuplicatedNumber(int[] arrayNumbers){
        for(int i=0;i<arrayNumbers.length;i++){
            //System.out.println("Outer loop : [" + arrayNumbers[i] + "]");
            for(int j=i+1;j<arrayNumbers.length;j++){
                //System.out.println("Inner loop : " + arrayNumbers[j]);
                if(arrayNumbers[i] == arrayNumbers[j]){
                    System.out.println(arrayNumbers[i] + " : " + " Duplicated");
                }
            }
            //System.out.println();
        }
        //System.out.println("Total of array elements " + "-> " + arrayNumbers.length);
    }
    public static void main(String[] args){
//        int[] numbers = {1,2,3,1};
//        findDuplicatedNumber(numbers);
        findDuplicatedNumber(new int[]{1,3,2,1,2,3});
    }
}

package array1;

public class FindDuplicatedNumber {
    public static void main(String[] args){
        int[] numbers = {1,2,3,1};
       for(int i=0;i<numbers.length;i++){
           for(int j=i+1;j<numbers.length;j++){
               if(numbers[i]==numbers[j]){
                   System.out.println(numbers[i] + " : is Duplicated");
               }
           }
       }
        System.out.println(numbers.length);
    }
}

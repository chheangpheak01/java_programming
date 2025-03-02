package array2;

public class Array2 {
    public static void main(String[] args) {
        String[][] studentName = {{"Winn","Dara","water","food"},{"kim","Sok"},{"Sean"}};
       for(int i=0;i<studentName.length;i++){
           System.out.print("Row " + (i+1) + " | ");
           for(int j=0;j<studentName[i].length;j++){
               System.out.print("Column[" + (j) + "] = ");
               System.out.print(studentName[i][j] + " ");
           }
           System.out.println();
       }
    }
}

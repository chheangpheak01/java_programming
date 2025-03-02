package array1;

public class FindDuplicatedWord {
    public static void main(String[] args) {
        String [] name = {"som","jame","even","jame"};
        for(int i=0;i<name.length;i++){
            for(int j=i+1;j<name.length;j++){
                if(name[i].equalsIgnoreCase(name[j])){
                    System.out.println("Name : " + name[i] + " is duplicated");
                }
            }
        }
    }
}

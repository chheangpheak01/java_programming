package classNObject.Constructor;

public class Book{
    String bName;
    String bRank;
    public Book(){
        System.out.println("You're calling constructor with no parameter");
    }
    public Book(String bName, String bRank){
        this.bName = bName;
        this.bRank = bRank;
    }
    public void setName(String bName){
        this.bName = bName;
    }
    public void setRank(String bRank){
        this.bRank = bRank;
    }
    public String getName(){
        return this.bName;
    }
    public String getRank(){
        return this.bRank;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", bRank='" + bRank + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("Math Book","No1");
        System.out.println("Result 1 -> " + book);
        System.out.println("Result 2 -> " + book1);
        System.out.println("*".repeat(23) + " After using Setter and Getter methods " + "*".repeat(25));
        book1.setName("IT Coffee Book");
        System.out.println("Result of book1 after changing of it's name -> " + book1);
        System.out.println(book1.getName());
    }
}

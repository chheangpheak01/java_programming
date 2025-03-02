//package introduction;
//import org.nocrala.tools.texttablefmt.BorderStyle;
//import org.nocrala.tools.texttablefmt.CellStyle;
//import org.nocrala.tools.texttablefmt.ShownBorders;
//import org.nocrala.tools.texttablefmt.Table;
//import java.util.Scanner;
//import java.util.UUID;
//
//public class InputOutput3{
//    public static void main(String[] args) {
//        String uuid = UUID.randomUUID().toString();
//        System.out.print("Insert Student's Name : ");
//        String stName = new Scanner(System.in).nextLine();
//        System.out.print("Insert Student's Class : ");
//        String stClass = new Scanner(System.in).nextLine();
//        System.out.print("Insert Student's Score : ");
//        float stScore = new Scanner(System.in).nextFloat();
//        //adding table
//        Table myTable = new Table(4,BorderStyle.CLASSIC,ShownBorders.ALL);
//        myTable.addCell("Student's Name",new CellStyle(CellStyle.HorizontalAlign.center));
//        myTable.addCell("Student's Class",new CellStyle(CellStyle.HorizontalAlign.center));
//        myTable.addCell("Student's Score",new CellStyle(CellStyle.HorizontalAlign.center));
//        myTable.addCell("UUID", new CellStyle(CellStyle.HorizontalAlign.center));
//        myTable.setColumnWidth(0,20,40);
//        myTable.setColumnWidth(1,20,40);
//        myTable.setColumnWidth(2,20,40);
//        myTable.setColumnWidth(3,20,40);
//        myTable.addCell(stName,new CellStyle(CellStyle.HorizontalAlign.center));
//        myTable.addCell(String.valueOf(stClass), new CellStyle(CellStyle.HorizontalAlign.center));
//        myTable.addCell(String.valueOf(stScore), new CellStyle(CellStyle.HorizontalAlign.center));
//        myTable.addCell(String.valueOf(uuid), new CellStyle(CellStyle.HorizontalAlign.center));
//        System.out.println(myTable.render());
//    }
//}

//package introduction;
//import org.nocrala.tools.texttablefmt.BorderStyle;
//import org.nocrala.tools.texttablefmt.CellStyle;
//import org.nocrala.tools.texttablefmt.ShownBorders;
//import org.nocrala.tools.texttablefmt.Table;
//import java.util.Random;
//import java.util.Scanner;
//import java.util.UUID;
//
//public class InputOutput2 {
//    public static void main(String[] args) {
//        int id = new Random().nextInt(999999);
//    //  String uuid = UUID.randomUUID().toString();
//        System.out.print("[+] Insert Product Name: ");
//        String productName = new Scanner(System.in).nextLine();
//        System.out.print("[+] Insert Product Price: ");
//        float productPrice = new Scanner(System.in).nextFloat();
//        System.out.print("[+] Insert Product Quantity: ");
//        int qty = new Scanner(System.in).nextInt();
//        // adding table
//        Table table = new Table(4, BorderStyle.CLASSIC, ShownBorders.ALL);
//        table.addCell("ID",new CellStyle(CellStyle.HorizontalAlign.center));
//        table.addCell("Product Name",new CellStyle(CellStyle.HorizontalAlign.center));
//        table.addCell("Product Price",new CellStyle(CellStyle.HorizontalAlign.center));
//        table.addCell("Product Qty",new CellStyle(CellStyle.HorizontalAlign.center));
//        // set width
//        table.setColumnWidth(0,10,20);
//        table.setColumnWidth(1,10,20);
//        table.setColumnWidth(2,10,20);
//        table.setColumnWidth(3,10,20);
//        table.addCell(String.valueOf(id), new CellStyle(CellStyle.HorizontalAlign.center));
//        table.addCell(productName, new CellStyle(CellStyle.HorizontalAlign.center));
//        table.addCell(String.valueOf(productPrice), new CellStyle(CellStyle.HorizontalAlign.center));
//        table.addCell(String.valueOf(qty), new CellStyle(CellStyle.HorizontalAlign.center));
//        System.out.println(table.render());
//    }
//}
//

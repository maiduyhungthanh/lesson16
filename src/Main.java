import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    
       
       
    
    public static void main(String[] args) {

 //TODO Auto-generated constructor stub
        ArrayList<Product> listProduct = new ArrayList<Product>();
        // Create students
        Product product01 = new Product(1, "iphone", "5S", 1500000L);
        Product product02 = new Product(2, "iphone", "8S", 10000000L);
        Product product03 = new Product(3, "iphone", "10S", 15000000L);
        Product product04 = new Product(4, "samsung", "no5", 6000000L);
        Product product05 = new Product(5, "samsung", "no6", 8000000L);
        Product product06 = new Product(6, "asus", "n55", 3000000L);
        Product product07 = new Product(7, "dell", "m3000", 9000000L);  
        Product product08 = new Product(8, "macbook", "1000", 20000000L);
        Product product09 = new Product(9, "oppo", "01", 1000000L);

        listProduct.add(product01);
        listProduct.add(product02);
        listProduct.add(product03);
        listProduct.add(product04);
        listProduct.add(product05);
        listProduct.add(product06);
        listProduct.add(product07);
        listProduct.add(product08);
        listProduct.add(product09);
        
        // for (Product product : listProduct) {
           
        // }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Bạn có muốn tiếp tục chương trình: \nY để tiếp tục \nQ để thoát chương trình");
            System.out.print("Lựa chọn của bạn: ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                Menu.choose();
                System.out.print("Lựa chọn của bạn: ");
                int i =Integer.valueOf( sc.nextLine());
                
                switch (i) {
                    case 1:
                        Menu.chooseCategory();
                        System.out.print("Lựa chọn của bạn: ");
                            int j = sc.nextInt();
                            
                                    switch (j) {
                                             case 1:
                                                 Menu.chooseDienthoai();
                                                 System.out.print("Chọn hãng điện thoại : " );
                                                 int k = sc.nextInt();
                                                 switch (k) {
                                                                    case 1:
                                                                    System.out.println(product01.toString());
                                                                    System.out.println(product02.toString());
                                                                    System.out.println(product03.toString());
                                                                    break;
                                                                     case 2:
                                                                     System.out.println(product04.toString());
                                                                    System.out.println(product05.toString());
                                                                   break;
                                                                   case 3:
                                                                   System.out.println(product09.toString());
                                                                    break;
                                                 }
                                                 break;
                                             case 2:
                                                 Menu.chooseLaptop();
                                                 System.out.println(" Chọn hãng Laptop");
                                                 int l = sc.nextInt();
                                                 switch (l) {
                                                                case 1:
                                                                System.out.println(product06.toString());
                                                                break;
                                                               case 2:
                                                                System.out.println(product07.toString());
                                                                break;
                                                                case 3:
                                                                System.out.println(product08.toString());
                                                                break;
                                                }
                                                 break;
                                                    }

                        break;
                    case 2:
                        System.out.println("Nhập hãng bạn muốn tìm kiếm:(Gợi ý''iphone'',''samsung'') ");
                        String hang = sc.nextLine();
                        for (Product product : listProduct) {
                            if (product.getBrand().equalsIgnoreCase(hang)) {
                                System.out.println(product.toString());
                            }     
                        }
                        break;
                    case 3:
                        Menu.choosePrice();
                        System.out.print("Lựa chọn mức giá: ");
                        int m = sc.nextInt();
                        switch (m) {
                                        case 1:
                                            System.out.println(product01.toString());
                                            System.out.println(product09.toString());
                                            break;
                                        case 2:
                                            System.out.println(product06.toString());
                                            break;
                                        case 3:
                                            System.out.println(product04.toString());
                                            break;
                                        case 4:
                                            System.out.println(product02.toString());
                                            System.out.println(product05.toString());
                                            System.out.println(product07.toString());
                                            break;
                                        case 5:
                                            System.out.println(product03.toString());
                                            System.out.println(product08.toString());
                                            
                                            break;
                        }
                        

                        break;
                    case 4:
                        System.out.println("Nhập tên sản phẩm muốn tìm kiếm: (gợi ý ''n55'')");
                        String ten = sc.nextLine();
                        
                        for (Product product : listProduct) {
                            if (product.getName().equalsIgnoreCase(ten)) {
                                System.out.println(product.toString());
                            }     
                        }
                        break;

                }
            } else if (choice.equalsIgnoreCase("q")) {
                System.exit(0);
            }
        }

    }
}
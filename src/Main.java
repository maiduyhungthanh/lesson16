import java.util.Scanner;

public class Main {
    
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Bạn có muốn tiếp tục chương trình: \nY để tiếp tục \nQ để thoát chương trình");
            System.out.print("Lựa chọn của bạn: ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                Menu.choose();
                System.out.print("Lựa chọn của bạn: ");
                int i = sc.nextInt();
                
                switch (i) {
                    case 1:
                        Menu.chooseCategory();
                        System.out.print("Lựa chọn của bạn: ");
                            int j = sc.nextInt();
                            
                                    switch (j) {
                                             case 1:
                                                        Menu.chooseDienthoai();
                                                    }

                        break;
                    case 2:
                        System.out.print("Nhập hãng bạn muốn tìm kiếm: ");
                        String hang = sc.nextLine();
                        break;
                    case 3:
                        Menu.choosePrice();
                        System.out.print("Lựa chọn của bạn: ");         
                        

                        break;
                    case 4:
                        System.out.print("Nhập tên sản phẩm muốn tìm kiếm: ");
                        String ten = sc.nextLine();
                        break;

                }
            } else if (choice.equalsIgnoreCase("q")) {
                System.exit(0);
            }
        }

    }
}
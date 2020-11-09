import java.util.Scanner;

public class Exercise {
    public  static  boolean isPreme(int n){
        if (n<2)
            return false;
        for (int i=2; i<=Math.sqrt(n);i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[]args){
        int choice;
        Scanner scanner=new Scanner(System.in);
        int num;
        int[]array =new int[0];

        while (true) {
            System.out.println("1. Kiểm tra số lẻ dương");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Danh sách số nguyên tố");
            System.out.println("4. Nhập n vào mảng ");
            System.out.println("5. Hiển thị số nguyên tố trong mảng");
            System.out.println("6. Kiểm tra số nguyên tố trong mảng");
            System.out.println("7. Kiểm tra giá trị trong mảng");
            System.out.println("8. Xóa n ");
            System.out.println("9. Sắp xếp");
            System.out.println("10. Thoát");
            System.out.println("Chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập một số :");
                    num = scanner.nextInt();
                    if (num % 2 != 0 && num > 0) {
                        System.out.println(num + "là số lẻ");
                    } else {
                        System.out.println("nhập lại");
                    }
                    break;
                case 2:
                    System.out.println("Nhập một số");
                    num = scanner.nextInt();
                    if (isPreme(num)) {
                        System.out.println(num + " là số nguyên tố");
                    } else {
                        System.out.println(num + " không là số nguyên tố");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Nhập số nguyên tố đầu tiên");
                    num = scanner.nextInt();
                    int dem = 0;
                    int i = 2;
                    while (dem < num) {
                        if (isPreme(i)) {
                            System.out.println(i + " ");
                            dem++;
                        }
                        i++;
                    }
                case 4:
                    int n;
                    do {
                        System.out.println("Nhập số phần tử vào mảng");
                        n = scanner.nextInt();

                    } while (n < 0);
                        array = new int[n];
                        for (int j = 0;j<=n-1; j++){
                            System.out.println("Nhập phần tử thứ " + (j+1) + " :");
                            array[j] = scanner.nextInt();
                        }
                case 5:
                        System.out.println("Hiển thị mảng");
                        for ( int a=0;a<array.length;a++){
                            System.out.println(array[a]);
                        }
                case 6:
                    String a= " ";
                    for (int b=0;b<array.length;b++){
                        if (isPreme(array[b])){
                            a+=array[b]+ " ";
                            System.out.println("Các số nguyên tố có trong mảng là : "+ array[b] );

                        }
                    }
                case 7:
                    System.out.println("nhập giá trị để kiểm tra :");
                    int x= scanner.nextInt();
                    int z;
                    for (z=0;z<array.length;z++){
                        if (array[z]==x){
                            System.out.println("Có phần tử "+x+ " tại vị trí "+z);
                        }
                    }
//                case 8:
//                    int v,c=0;
//                    System.out.println("Nhập phần tử bị xóa");
//                    int Num =scanner.nextInt();
//                    for (v=0;v<=array.length;c++){
//                        if(array[v]==Num){
//                        }
//                    }
//                case 9:
//                    int temp;
//                    for (int i1=0;i1<=array.length;i1++){
//                        for (int i2=0;i2<= array.length;i2++){
//                            if (array[i2]>=array[i2+1]) {
//                                temp = array[i2];
//                                array[i2] = array[i2 + 1];
//                                array[i2 + 1] = temp;
//                            }
//                        }
//                    }
//                    System.out.println("mảng sau khi sắp xếp là :");
//                    for (int m=0;m< array.length;m++){
//                        System.out.println(array[m]);
//                    }
            }
        }
    }

}

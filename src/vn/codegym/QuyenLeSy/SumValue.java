package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class SumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, sum = 0;

        System.out.print("Nhập vào số dòng: ");
        i = scanner.nextInt();

        System.out.print("Nhập vào số cột: ");
        j = scanner.nextInt();
        double[][] array = new double[i][j];

        System.out.println("Nhập vào danh sách phẩn tử của mảng: ");
        for (int row = 0; row < array.length; row++)
        {
            for (int column = 0; column < array[row].length; column++)
                {
                    System.out.print("a["+row+"]["+column+"] = ");
                    array[row][column] = scanner.nextDouble();
                }
        }

        System.out.print("Nhập vào cột muốn tính tổng ( 0 < cột <= "+j+"): ");
        int col = scanner.nextInt();

        for (int row = 0; row < array.length; row++)
        {
            sum += array[row][col-1];
        }
        System.out.print("Tổng giá trị các phần từ cột "+col+"là: "+sum);
    }
}

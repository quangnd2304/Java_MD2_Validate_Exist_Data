import ra.StudentClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<StudentClass> listClass = new ArrayList<>();
    public static void main(String[] args) {
        //ma lop gom 5 ky tu, bat dau la J va khong duoc trung lap
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so lop can nhap thong tin: ");
        int cnt = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cnt; i++) {
            StudentClass studentClass = new StudentClass();
            studentClass.inputData(sc,listClass);
            listClass.add(studentClass);
        }
    }
}
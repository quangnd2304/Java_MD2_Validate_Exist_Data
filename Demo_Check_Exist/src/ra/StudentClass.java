package ra;

import java.util.List;
import java.util.Scanner;

public class StudentClass {
    private String classId;
    private String className;
    private String descriptions;
    private boolean classStatus;

    public StudentClass() {
    }

    public StudentClass(String classId, String className, String descriptions, boolean classStatus) {
        this.classId = classId;
        this.className = className;
        this.descriptions = descriptions;
        this.classStatus = classStatus;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isClassStatus() {
        return classStatus;
    }

    public void setClassStatus(boolean classStatus) {
        this.classStatus = classStatus;
    }

    public void inputData(Scanner sc, List<StudentClass> listClass) {
        //ma lop gom 5 ky tu, bat dau la J va khong duoc trung lap
        System.out.println("Nhap vao ma lop hoc: ");
        do {
            this.classId = sc.nextLine();
            //Ma lop phai gom 5 ky tu
            if (this.classId.trim().length() == 5) {
                //Ma lop phai bat dau la J
                if (this.classId.trim().charAt(0) == 'J') {
                    //Ma lop khong duoc trung
                    boolean checkExist = false;
                    for (StudentClass stClass : listClass) {
                        if (stClass.getClassId().equals(this.classId)){
                            checkExist = true;
                            break;
                        }
                    }
                    if (!checkExist){
                        break;
                    }else {
                        System.err.println("Ma nhan vien da ton tai, vui long nhap lai");
                    }
                } else {
                    System.err.println("Vui long nhap ma lop bat dau la J");
                }
            } else {
                System.err.println("Vui long nhap ma lop gom 5 ky tu");
            }
        } while (true);


        System.out.println("Nhap vao ten lop:");
        this.className = sc.nextLine();
        System.out.println("Nhap vao mo ta: ");
        this.descriptions = sc.nextLine();
        System.out.println("Nhap vao trang thai: ");
        this.classStatus = Boolean.parseBoolean(sc.nextLine());
    }
}

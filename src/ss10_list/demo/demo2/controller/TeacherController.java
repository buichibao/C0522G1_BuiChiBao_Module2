package ss10_list.demo.demo2.controller;

import ss10_list.demo.demo2.service.ipml.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    TeacherService teacherService = new TeacherService();
    public void menuTeacher(){
        do {
            System.out.println("BẠN MUỐN ");
            System.out.println("1.Thêm giảng viên mới");
            System.out.println("2.Xóa giảng viên");
            System.out.println("3.Hiện thị danh sách giảng viên");
            System.out.println("4.Tìm giảng viên theo id");
            System.out.println("5.Tìm kiếm theo tên");
            System.out.println("6.Quay lại menu chính");
            System.out.println("Nhập chức năng bạn muốn :");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    teacherService.add();
                    break;
                case 2:
                    teacherService.remove();
                    break;
                case 3:
                    teacherService.displayAll();
                    break;
                case 4:
                    teacherService.findId();
                    break;
                case 5:
                    teacherService.findName();
                    break;
                case 6:
                    return;
            }
        }while (true);
    }
}

//package BaiTapThemHaiTT.QuanLyCodeGym.service.impl;
//
//import BaiTapThemHaiTT.QuanLyCodeGym.model.Student;
//import BaiTapThemHaiTT.QuanLyCodeGym.service.IStudentService;
//import BaiTapThemHaiTT.QuanLyCodeGym.utils.ReadWriteStudentFile;
//import on_tap.QuanLyGianVienVaHocSinh.utils.ReadWriteFileStudent;
//
//import java.util.*;
//import java.util.zip.DataFormatException;
//
//public class StudentService implements IStudentService {
//    private static final Scanner SCANNER = new Scanner(System.in);
//    private static String Date = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
//
//    final String PATH = "src\\BaiTapThemHaiTT\\QuanLyCodeGym\\data\\student.csv";
//
//    @Override
//    public void addElement() {
//        List<Student> studentList = ReadWriteFileStudent.readFileStudent(PATH);
//        Student student = inforStudent();
//        studentList.add(student);
//        ReadWriteStudentFile.writeFileStudent(PATH, studentList);
//        System.out.println("Thêm thành công");
//    }
//
//    @Override
//    public void disPlay() {
//        List<Student> studentList = ReadWriteStudentFile.readFileStudent(PATH);
//        if(studentList.isEmpty()){
//            System.out.println("Danh sách đang trống");
//        }else {
//            for (Student student : studentList) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    @Override
//    public void removeById() {
//        List<Student> studentList = ReadWriteStudentFile.readFileStudent(PATH);
//        if(studentList.isEmpty()){
//            System.out.println("Danh sách học viên đang trống");
//        }else{
//            System.out.print("Nhập id bạn cần xóa :");
//            String idRemove = SCANNER.nextLine();
//            boolean checkId = false;
//            for (Student student : studentList) {
//                if (idRemove.equals(student.getId())) {
//                    System.out.println("Bạn có muốn xóa học viên có id là " + idRemove + " không ?");
//                    System.out.println("1.Có");
//                    System.out.println("2.Không");
//                    int chooseYesNo = Integer.parseInt(SCANNER.nextLine());
//                    if (chooseYesNo == 1) {
//                        studentList.remove(student);
//                        ReadWriteStudentFile.writeFileStudent(PATH,studentList);
//                        System.out.println("Xóa thành công");
//                        checkId = true;
//                        break;
//                    }
//                }
//            }
//            if (!checkId) {
//                System.out.println("Không thấy học viên có id " + idRemove);
//            }
//        }
//
//    }
//    @Override
//    public void findName() {
//        List<Student> studentList = ReadWriteStudentFile.readFileStudent(PATH);
//        boolean checkName= false;
//        System.out.print("Nhập tên cần tìm kiếm :");
//        String nameFind = SCANNER.nextLine();
//        for (Student student:studentList) {
//            if(student.getName().toLowerCase().contains(nameFind.toLowerCase())){
//                System.out.println(student);
//                checkName = true;
//            }
//        }
//        if(!checkName){
//            System.out.println("Không có tên này");
//        }
//    }
//
//    @Override
//    public void findId() {
//        List<Student> studentList = ReadWriteStudentFile.readFileStudent(PATH);
//        System.out.print("Nhập id cần tìm :");
//        String idFind = SCANNER.nextLine();
//        boolean checkId =false;
//        for (Student student:studentList) {
//            if(idFind.equals(student.getId())){
//                System.out.println("Đã tìm thấy học viên có id "+idFind+" là :");
//                System.out.println(student);
//                checkId=true;
//                break;
//            }
//        }
//        if(!checkId){
//            System.out.println("Không có hoc viên nào có id "+idFind);
//        }
//    }
//
//    @Override
//    public void sortByName() {
//        List<Student> studentList = ReadWriteStudentFile.readFileStudent(PATH);
//        Collections.sort(studentList);
//        ReadWriteStudentFile.writeFileStudent(PATH,studentList);
//        for (Student student:studentList) {
//            System.out.println(student);
//        }
//    }
//
//    public static Student inforStudent() {
//        System.out.print("Nhập id :");
//        String id = SCANNER.nextLine();
//
//        System.out.print("Nhập tên :");
//        String name = SCANNER.nextLine();
//
//        String dateOfBirth;
//        do {
//            try {
//                System.out.print("Nhập ngày sinh : ");
//                dateOfBirth = SCANNER.nextLine();
//                if(dateOfBirth.matches(Date)){
//                    break;
//                }else {
//                    throw new DataFormatException("Bạn nhập sai rồi mời bạn nhập lại");
//                }
//            } catch (DataFormatException e) {
//                System.out.println(e.getMessage());
//            }
//
//        }while (true);
//
//
//        System.out.print("Nhập giới tính :");
//        String sex = SCANNER.nextLine();
//
//        System.out.print("Nhập điểm :");
//        double score = Double.parseDouble(SCANNER.nextLine());
//
//        System.out.print("Nhập tên lớp :");
//        String className = SCANNER.nextLine();
//
//        return new Student(id, name, dateOfBirth, sex, score, className);
//    }
//}

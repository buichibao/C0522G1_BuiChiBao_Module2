package BaiTapThemHaiTT.QuanLyCodeGym.utils;

import BaiTapThemHaiTT.QuanLyCodeGym.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteStudentFile {
    private static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReade = new BufferedReader(fileReader);

            while ((line = bufferedReade.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReade.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Student> readStudentFile(String path) {
        List<String> stringList = readFile(path);
        List<Student> studentList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            studentList.add(new Student(info[0], info[1], info[2], info[3], Double.parseDouble(info[4]), info[5]));
        }
        return studentList;
    }

    public static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public  static  void writeStudentFile(String path,List<Student> students){
        StringBuilder data = new StringBuilder();
        for (Student student:students) {
            data.append(student.getInfor());
        }
        writeFile(path,data.toString());
    }
}

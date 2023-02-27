package work_with_multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataBase implements DataBaseDao {
    //Singletone
    private static DataBase dataBase;
    private ArrayList<Student> studentsList = new ArrayList();
    private DataBase() {

    }

    public static DataBase getInstanse(){
        if (dataBase == null) {
            dataBase= new DataBase();
        }

        return dataBase;

    }

    public void addStudentd (Student student){
        studentsList.add(student);
    }

    public List<Student> listSdt(){
        List<Student> studentsCopy = new ArrayList<>();
       // Collections.copy(studentsCopy,studentsList);
        //System.out.println(studentsList);
        //System.out.println(studentsCopy);
        return studentsList;
    }

    public synchronized void addBall(int ball){
        for (Student student : studentsList) {
            for (int i = 0; i < 15; i++) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                student.setBall(student.getBall()+1);
            }

        }
    }



    public synchronized void deliteStudent(int ballNorma){
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getBall() < ballNorma){
                studentsList.remove(studentsList.get(i));
            }
        }

    }


}

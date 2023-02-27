package work_with_multithreading;

import java.util.ArrayList;
import java.util.List;

public interface DataBaseDao {

    void addStudentd (Student student);
    List<Student> listSdt();
    void addBall(int ball);
    void deliteStudent(int ballNorma);

}

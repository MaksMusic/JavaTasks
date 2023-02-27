package work_with_multithreading;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private DataBaseDao dataBaseDao;

    public void start(){


        dataBaseDao = DataBase.getInstanse();
        System.out.println("1 список пользователей");
        System.out.println("2 добавить пользователя");
        System.out.println("3 удалить пользователей с балами ниже 50 (1 в секунду)");
        System.out.println("4 удалить пользователей с балами ниже 10 (1 в секунду)");
        System.out.println("5 увеличить баллы пользователей на 20 (1 балл в секунду)");
        System.out.println("----------------");
        switch (scanner.nextLine()){

            case "1" -> {
                printList();
                start();
            }

            case "2" -> {
                add();
                start();
            }

            case "3" -> {
                deliteStudentsBall50();
                start();
            }
            case "4" -> {

                deliteStudentsBall10();
                start();

            }
            case "5" -> {
              addBall();
              start();

            }
            default -> {
                start();
            }
        }
    }

    private void deliteStudentsBall50(){
        Thread thread = new Thread( () -> {
            dataBaseDao.deliteStudent(50);
        });
        thread.start();
    }

    private void deliteStudentsBall10(){
        Thread thread = new Thread( () -> {
            dataBaseDao.deliteStudent(10);
        });
        thread.start();

    }


    private void add(){
//        System.out.print("Student name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Student ball: ");
//        int ball = scanner.nextInt();
//        scanner.nextLine();
   //     dataBaseDao.addStudentd(new Student(name,ball));
     dataBaseDao.addStudentd(new Student("name1",41));
     dataBaseDao.addStudentd(new Student("name2",55));
     dataBaseDao.addStudentd(new Student("name3",46));
     dataBaseDao.addStudentd(new Student("name4",491));
     dataBaseDao.addStudentd(new Student("name5",1));



    }

    private void printList(){
        int nomber = 1;
        for (Student student : dataBaseDao.listSdt()) {
            System.out.println(nomber++ + " "+ student);
        }
    }

    private void addBall(){
        Thread thread = new Thread(()->{
            dataBaseDao.addBall(15);
        });
        thread.start();
    }



}

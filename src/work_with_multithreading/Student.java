package work_with_multithreading;

public class Student {
    private String name;
    private int ball;

    public Student(String name, int ball) {
        this.name = name;
        this.ball = ball;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "Student " + name + " ball = " + ball;
    }
}

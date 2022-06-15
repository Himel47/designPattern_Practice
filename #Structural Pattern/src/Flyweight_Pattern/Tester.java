package Flyweight_Pattern;

public class Tester implements Employee{

    private final String JOB;
    private String skill;

    public Tester(){
        JOB = "Test the ISSUE.";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill=skill;
    }

    @Override
    public void task() {
        System.out.println("Tester with "+skill+" skill doing "+JOB+" job.");
    }
}

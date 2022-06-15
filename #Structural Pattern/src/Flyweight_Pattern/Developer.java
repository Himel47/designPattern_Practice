package Flyweight_Pattern;

public class Developer implements Employee{

    private final String JOB;
    private String skill;

    public Developer(){
        JOB= "Fix the ISSUE.";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill=skill;
    }

    @Override
    public void task() {
        System.out.println("Developer with "+skill+" skill doing "+JOB+" job.");
    }
}

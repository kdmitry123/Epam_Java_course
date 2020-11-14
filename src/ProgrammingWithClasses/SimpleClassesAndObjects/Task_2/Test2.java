package ProgrammingWithClasses.SimpleClassesAndObjects.Task_2;

public class Test2 {
    private int firstVariable;
    private int secondVariable;

    public Test2() {
        this.firstVariable = 0;
        this.secondVariable = 0;
    }

    public Test2(int firstVariable, int secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public int getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(int firstVariable) {
        this.firstVariable = firstVariable;
    }

    public int getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }
}

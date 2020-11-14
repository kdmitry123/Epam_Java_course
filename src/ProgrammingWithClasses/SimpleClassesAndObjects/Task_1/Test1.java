package ProgrammingWithClasses.SimpleClassesAndObjects.Task_1;

public class Test1 {
    private int firstVariable;
    private int secondVariable;

    public Test1(int firstVariable, int secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public int getFirstVariable() {
        return firstVariable;
    }

    public int getSecondVariable() {
        return secondVariable;
    }

    public void setFirstVariable(int firstVariable) {
        this.firstVariable = firstVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }

    public int summ() {
          return firstVariable + secondVariable;
    }
    public int max(){
        if(firstVariable >= secondVariable){
            return firstVariable;
        } else return secondVariable;

    }
}

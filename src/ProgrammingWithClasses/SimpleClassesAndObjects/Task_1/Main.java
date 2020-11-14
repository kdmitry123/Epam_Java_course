package ProgrammingWithClasses.SimpleClassesAndObjects.Task_1;

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1(1,2);
        System.out.println(test1.summ());
        System.out.println(test1.max());

        test1.setFirstVariable(3);
        System.out.println(test1.summ());
        System.out.println(test1.max());

        test1.setFirstVariable(2);
        System.out.println(test1.summ());
        System.out.println(test1.max());
    }
}

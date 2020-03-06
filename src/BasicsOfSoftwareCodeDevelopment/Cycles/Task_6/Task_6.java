package BasicsOfSoftwareCodeDevelopment.Cycles.Task_6;
/**
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Task_6 {
    static void charValue(){
        for (int i = 0; i < Character.MAX_CODE_POINT; i++) {
            System.out.println(i + " = " + (char)i);
        }
    }

    public static void main(String[] args) {
        charValue();
    }
}

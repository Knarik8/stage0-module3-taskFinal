package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void revert(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        System.out.print(third);
        System.out.print(second);
        System.out.println(first);
    }

    public static void main(String[] args){
        revert(489);
    }

}

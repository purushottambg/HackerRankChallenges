package lambda;

import java.util.function.BiFunction;

@FunctionalInterface
interface Addition{
    int addOperation(int a, int b);
}

public class LamdaForAddition {
    public static void main(String[] args) {
        Addition addition = (a, b) -> a+b;

        System.out.println("Doing the lambda for addition: "+ addition.addOperation(12,64) );

    }
}

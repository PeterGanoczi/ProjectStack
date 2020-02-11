package sk.itsovy.ganoczi.main;

import sk.itsovy.ganoczi.exception.StackOverflowException;
import sk.itsovy.ganoczi.stack.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>(3);
        try {
            stack.push(17);
            stack.push(17);
            stack.push(54);

            System.out.println(stack.top());
        } catch (StackOverflowException e) {
            e.printStackTrace();
        }
    }
}

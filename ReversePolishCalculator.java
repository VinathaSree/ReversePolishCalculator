package Project;

import java.util.*;
import java.io.*;
    class sol {
        public int stacky(String[] tokens) {
            Stack<String> stack = new Stack<String>();
            int x, y;
            String result = "";
            //int get = 0;
            String choice;
            int value = 0;
            String p = "";


            for (int i = 0; i < tokens.length; i++) {

                if (tokens[i] != "+" && tokens[i] != "-" && tokens[i] != "*" && tokens[i] != "/") {
                    stack.push(tokens[i]);
                    continue;
                } else {
                    choice = tokens[i];
                }
                x = Integer.parseInt(stack.pop());
                y = Integer.parseInt(stack.pop());

                switch (choice) {
                    case "+":
                        value = x + y;
                        result = p + value;
                        stack.push(result);
                        break;

                    case "-":
                        value = y - x;
                        result = p + value;
                        stack.push(result);
                        break;

                    case "*":
                        value = x * y;
                        result = p + value;
                        stack.push(result);
                        break;
                    case "/":
                        value = y / x;
                        result = p + value;
                        stack.push(result);
                        break;

                    default:
                        continue;
                }
            }

            return Integer.parseInt(stack.pop());
        }

        public class ReversePolishCalculator {
            public static void main(String[] args) {
                String[] s = {"3", "5", "+", "7", "2", "-", "*"};
                sol str = new sol();
                int result = str.stacky(s);
                System.out.println(result);
            }
        }
    }

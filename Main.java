import java.util.*;

// Operator list : '-', '+', '*', '/', '^', '%', '!', '(', ')'

public class Main {
    public static void main(String[] args) {
        // Call for input and store in expression String
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        String input = scanner.nextLine();
        System.out.println(evaluate(input));
    }
    static Integer evaluate(String s){
        // Convert the string into a tokenized string array
        int sLength = s.length();
        String[] expression = new String[]{};
        for (int i = 0; i <= sLength; i++){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                int j = i;
                while(Character.isDigit(c)){
                    expression[i] += String.valueOf(s.charAt(j));
                    if (j < sLength){
                        c = s.charAt(j++);
                    }
                    else {
                        break;
                    }
                }
            }
            else if (c == '-' || c == '+' || c == '*' || c == '/' || c == '^' || c == '%' || c == '!' || c == '(' || c == ')'){
                expression[i] = String.valueOf(s.charAt(i));
            }
            else if (c != ' '){
                // If the character isn't a space then something has been inputted wrong
                // TODO: ERROR HANDLING
            }
        }
        // Evaluate the tokenized char array known as expression
        Stack<Character> operators = new Stack<>();
        Stack<Character> output = new Stack<>();
        int i = 0;
        char c = s.charAt(i);
        while (i <= sLength){
            if (Character.isDigit(s.charAt(i))){

            }
        }
        return 0;
    }
}


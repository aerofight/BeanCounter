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

    static String evaluate(String s){
        int sLength = s.length();
        // Create a tokenized string array
        ArrayList<String> expression = new ArrayList<>();
        for (int i = 0; i < sLength; i++){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                StringBuilder num = new StringBuilder();
                int j = i;
                boolean period = false;
                while((Character.isDigit(c) || c == ',' || c == '.') && j < sLength){
                    c = s.charAt(j);
                    if (Character.isDigit(c)) {
                        num.append(String.valueOf(c));
                    }
                    else if (c == '.' && !period){
                        period = true;
                        num.append(String.valueOf(c));
                    }
                    j++;
                }
                i = j - 2;
                expression.add(num.toString());
            }
            else if (c == '-' || c == '+' || c == '*' || c == '/' || c == '^' || c == '%' || c == '!' || c == '(' || c == ')'){
                expression.add(String.valueOf(s.charAt(i)));
            }
            else if (c == ' ' || c == ','){
                // Ignore spaces and commas
            }
            else {
                // A letter or some other invalid character has been inputted or a comma is out of place
                return "Invalid input.";
            }
        }

        // Convert the tokenized string array in reverse polish notation evaluating during the process (shunting yard algorithm)
        // https://en.wikipedia.org/wiki/Shunting_yard_algorithm
        /*
        Stack<Character> operators = new Stack<>();
        Stack<Character> output = new Stack<>();
         */
        return String.valueOf(expression);
    }
}


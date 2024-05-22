/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice.task.pkg3;

/**
 *
 * @author lab_services_student
 */
public class ICETASK3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

public class GFG {

        public static boolean areBracketsBalanced(String s) {
            int openCount = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    openCount++;
                } else if (ch == ')' || ch == '}' || ch == ']') {
                    if (openCount == 0) {
                        return false; 
                    }
                    openCount--;
                }
            }
            return openCount == 0; 
        }

        public static void main(String[] args) {
            String expr = "{){{}";

            
            if (areBracketsBalanced(expr)) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not Balanced");
            }
        }
    }

}

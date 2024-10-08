// employee management
// You are tasked with developing an employee management system for a company. To efficiently store employee data, you decide to use a HashMap>. In this HashMap, the keys represent unique employee IDs, and the values are ArrayLists of employee details as strings, including the employee's name, job title, and department.

// you will be getting T queries which includes:

// case-1 (add) -> add employee with details.
// case-2 (update) -> update job title of a given employee.
// case-3 (delete) -> remove the employee.
// case-4 (show) -> print details of a given employee else print -1.
// Input Format

// first line of input contains an integer T representing number of queries. second line of input contains T queries.

// Constraints

// 1<= T <= 10^4
// Output Format

// print the desired output

// Sample Input 0

// 5
// add a21 Akhil Developer Tech
// add a34 anuj TeamLead Hr
// update a34 Manager 
// delete a21
// show a34 
// Sample Output 0

// anuj Manager Hr



import java.util.*;

public class Q9 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> employeeMap = new HashMap<>();

        // Read the number of queries
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Process each query
        for (int i = 0; i < T; i++) {
            String query = scanner.nextLine();
            String[] parts = query.split(" ");
            String command = parts[0];

            switch (command) {
                case "add":
                    // Add employee details
                    String employeeId = parts[1];
                    ArrayList<String> details = new ArrayList<>();
                    details.add(parts[2]); // Name
                    details.add(parts[3]); // Job Title
                    details.add(parts[4]); // Department
                    employeeMap.put(employeeId, details);
                    break;

                case "update":
                    // Update job title of a given employee
                    employeeId = parts[1];
                    if (employeeMap.containsKey(employeeId)) {
                        ArrayList<String> currentDetails = employeeMap.get(employeeId);
                        currentDetails.set(1, parts[2]); // Update Job Title
                    }
                    break;

                case "delete":
                    // Remove the employee
                    employeeId = parts[1];
                    employeeMap.remove(employeeId);
                    break;

                case "show":
                    // Print details of a given employee
                    employeeId = parts[1];
                    if (employeeMap.containsKey(employeeId)) {
                        ArrayList<String> empDetails = employeeMap.get(employeeId);
                        System.out.println(empDetails.get(0) + " " + empDetails.get(1) + " " + empDetails.get(2));
                    } else {
                        System.out.println(-1);
                    }
                    break;

                default:
                    // Invalid command handling (not specified but good for robustness)
                    System.out.println("Invalid command");
                    break;
            }
        }

        scanner.close();
    }
}
//fINDED
// Time Complexity: O(1) for each operation (add, update, delete, show) on average due to hash map operations.
// Space Complexity: O(N) where N is the number of employees stored.

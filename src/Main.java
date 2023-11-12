public class Main {
    public static void main(String[] args){
        Employee employee = new Employee("John", "Doe", 30, "Software Engineer");

        System.out.println("Original Employee Information:");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Title: " + employee.getTitle());

        employee.setAge(35);

        System.out.println("\nUpdated Employee Information:");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Title: " + employee.getTitle());
            }
        }

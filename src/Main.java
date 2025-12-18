import java.util.*;
class Main
{
    public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            StudentManager manager = new StudentManager();
            boolean exit= false;
            while(!exit)
            {
                System.out.println("\n--- Student Management System ---");
                System.out.println("1. Add Student");   
                System.out.println("2. View All Students");
                System.out.println("3. Search Student by ID");
                System.out.println("4. Delete Student by ID");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
            
            switch(choice) {
    case 1:
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        System.out.print("Enter student marks: ");
        double marks = sc.nextDouble();
        Student student = new Student(id, name, age, marks);
        manager.addStudent(student);
        System.out.println("Student added successfully.");
        break;
    case 2:
        manager.viewAllStudents();
        break;
    case 3:
        System.out.print("Enter student ID to search: ");
        int searchId = sc.nextInt();    
        Student foundStudent = manager.searchById(searchId);
        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent);
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }
        break;
    case 4:
        System.out.print("Enter student ID to delete: ");
        int deleteId = sc.nextInt();    
        boolean deleted = manager.deleteStudent(deleteId);
        if (deleted) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student with ID " + deleteId + " not found.");
        }
        break;
    case 5:
        exit = true;
        System.out.println("Exiting...");
        break;
    default:
        System.out.println("Invalid choice. Try again.");
}
}
        sc.close();
    }

}
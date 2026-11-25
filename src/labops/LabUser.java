package labops;

public class LabUser {
    final int userId;
    String name;
    final String department;
    LabUser(int userId, String name, String department){
        this.userId = userId;
        this.name = name;
        this.department = department;
    }
    void displayDetails(){
        System.out.println("User ID:" + userId);
        System.out.println("Name:" + name);
        System.out.println("Department:" + department);
    }
}

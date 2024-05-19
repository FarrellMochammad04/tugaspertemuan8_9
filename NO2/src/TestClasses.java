public class TestClasses {
    public static void main(String[] args) {
        Person person = new Person("Akira Frye", "123 Main St", "555-5555", "frye.akira@example.com");
        Student student = new Student("Jin Sakai", "456 Maple Ave", "555-1234", "jin.sakai@example.com", Student.MahasiswaTahunKedua);
        MyDate dateHired = new MyDate(2020, 5, 15);
        Employee employee = new Employee("Kim Dokja", "789 Elm St", "555-9876", "dokja.kim@example.com", "Office 101", 50000, dateHired);
        Faculty faculty = new Faculty("Connor Kenway", "321 Oak St", "555-4321", "connor.kenway@example.com", "Office 202", 60000, dateHired, 10, "Professor");
        Staff staff = new Staff("Hinata Shoyo", "654 Pine St", "555-8765", "shoyo.hinata@example.com", "Office 303", 40000, dateHired, "Manager");

        System.out.println("Person Information:");
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Phone: " + person.getPhoneNumber());
        System.out.println("Email: " + person.getEmailAddress());
        System.out.println();

        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Phone: " + student.getPhoneNumber());
        System.out.println("Email: " + student.getEmailAddress());
        System.out.println("Status: " + student.getStatus());
        System.out.println();

        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Phone: " + employee.getPhoneNumber());
        System.out.println("Email: " + employee.getEmailAddress());
        System.out.println("Office: " + employee.getOffice());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Date Hired: " + employee.getDateHired());
        System.out.println();

        System.out.println("Faculty Information:");
        System.out.println("Name: " + faculty.getName());
        System.out.println("Address: " + faculty.getAddress());
        System.out.println("Phone: " + faculty.getPhoneNumber());
        System.out.println("Email: " + faculty.getEmailAddress());
        System.out.println("Office: " + faculty.getOffice());
        System.out.println("Salary: " + faculty.getSalary());
        System.out.println("Date Hired: " + faculty.getDateHired());
        System.out.println("Office Hours: " + faculty.getOfficeHours());
        System.out.println("Rank: " + faculty.getRank());
        System.out.println();

        System.out.println("Staff Information:");
        System.out.println("Name: " + staff.getName());
        System.out.println("Address: " + staff.getAddress());
        System.out.println("Phone: " + staff.getPhoneNumber());
        System.out.println("Email: " + staff.getEmailAddress());
        System.out.println("Office: " + staff.getOffice());
        System.out.println("Salary: " + staff.getSalary());
        System.out.println("Date Hired: " + staff.getDateHired());
        System.out.println("Title: " + staff.getTitle());
    }
}

class Q13_Employee {
    public int employeeID;
    protected String department;
    private double salary;
    public Q13_Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
class Q13_Manager extends Q13_Employee {
    public String team;
    public Q13_Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }
    public void display() {
        System.out.println("ID: " + employeeID + ", Department: " + department + ", Team: " + team);
    }
    public static void main(String[] args) {
        Q13_Manager mgr = new Q13_Manager(1001, "IT", 80000, "Dev Team");
        mgr.display();
        System.out.println("Salary: " + mgr.getSalary());
        mgr.setSalary(90000);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}

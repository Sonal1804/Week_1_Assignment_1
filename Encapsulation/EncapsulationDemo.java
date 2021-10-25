// Encapsulation Example

class Employee {
    private int empId;
    private String empName;

    //Setter
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    //Getter
    public String getEmpName() {
        return empName;
    }

    public int getEmpId() {
        return empId;
    }
}

public class EncapsulationDemo {
    public static void main(String args[]) {
        Employee emp = new Employee();
        emp.setEmpId(1);
        emp.setEmpName("Sonal");

        System.out.println("Employee Id :" + emp.getEmpId());
        System.out.println("Employee Name :" + emp.getEmpName());
    }
}
		
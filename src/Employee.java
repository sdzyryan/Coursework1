public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int counter = 1;
    private final int ID;

    public Employee(String fullName, int salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        this.ID = counter++;
    }


    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "ФИО сотрудника: " + fullName + ". " + "ID: "+ ID +
                ". Зарплата: " + salary + " рублей. " +
                "Департамент: " + department + ". ";
    }
}

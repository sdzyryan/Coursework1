public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int counter = 1;
    private int id;

    public Employee(String fullName, int salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
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
        return id + ". " + "ФИО сотрудника: " + fullName + ". " +
                "Зарплата: " + salary + " рублей. " +
                "Департамент: " + department + ". ";
    }
}

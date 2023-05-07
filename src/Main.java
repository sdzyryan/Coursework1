import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Зырянова Светлана Дмитриевна", 58_600, 2);
        Employee employee2 = new Employee("Масловская Евгения Александровна", 55_000, 3);
        Employee employee3 = new Employee("Шиляков Дмитрий Вадимович", 61_000, 1);
        Employee employee4 = new Employee("Душкин Павел Евгеньевич", 43_200, 5);
        Employee employee5 = new Employee("Новопашина Алена Ильинична", 47_080, 4);
        Employee employee6 = new Employee("Уфимцева Анастасия Сергеевна", 77_490, 1);
        Employee employee7 = new Employee("Мещеряков Илья Алексеевич", 47_836, 5);
        Employee employee8 = new Employee("Алланова Екатерина Эдуардовна", 28_750, 2);
        Employee employee9 = new Employee("Руфова Алина Викторовна", 44_123, 4);
        Employee employee10 = new Employee("Соколов Юрий Юрьевич", 39_980, 3);


        Employee[] employeeBook = new Employee[10];
        employeeBook[0] = employee1;
        employeeBook[1] = employee2;
        employeeBook[2] = employee3;
        employeeBook[3] = employee4;
        employeeBook[4] = employee5;
        employeeBook[5] = employee6;
        employeeBook[6] = employee7;
        employeeBook[7] = employee8;
        employeeBook[8] = employee9;
        employeeBook[9] = employee10;

        printListEmployees(employeeBook);
        printSeparator();

        System.out.println("Сумма затрат на зарплату всем сотрудникам в месяц: " + calculateSumAllSalary(employeeBook) +
                " рублей.");
        printSeparator();

        calculateAverageSalary(employeeBook);
        System.out.println("Средняя зарплата в месяц: " + calculateAverageSalary(employeeBook) +
                " рублей.");
        printSeparator();

        calculateMinSalary(employeeBook);
        printSeparator();

        calculateMaxSalary(employeeBook);
        printSeparator();
        
        printListOfAllEmployees(employeeBook);

    }

    private static void printListEmployees(Employee[] employeeBook) {
        System.out.println("Список всех сотрудников:");

        for (int i = 0; i < employeeBook.length; i++) {
            System.out.println(employeeBook[i]);
        }
    }

    private static int calculateSumAllSalary(Employee[] employeeBook) {
        int sum = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            sum += employeeBook[i].getSalary();
        }
        return sum;
    }

    private static float calculateAverageSalary(Employee[] employeeBook) {
        int sum = 0;
        int averageSum = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            sum += employeeBook[i].getSalary();
        }
        averageSum = sum / employeeBook.length;
        return averageSum;
    }

    public static void calculateMinSalary(Employee[] employeeBook) {
        Employee minSalary = employeeBook[0];
        for (Employee employee : employeeBook) {
            if (minSalary.getSalary() > employee.getSalary()) {
                minSalary = employee;
            }
        }
        System.out.println("Минимальная зарплата "+ minSalary.getSalary() +" рублей.");
    }

    public static void calculateMaxSalary(Employee[] employeeBook) {
        Employee maxSalary = employeeBook[0];
        for (Employee employee : employeeBook) {
            if (maxSalary.getSalary() < employee.getSalary()) {
                maxSalary = employee;
            }
        }
        System.out.println("Максимальная зарплата "+ maxSalary.getSalary() +" рублей.");
    }

    public static void printListOfAllEmployees(Employee[] employeeBook) {
        System.out.println("Список всех сотрудников:");
        for (Employee employee : employeeBook) {
            System.out.println(employee.getFullName());
        }
    }

    public static void printSeparator() {
        System.out.println("--------------");
    }


}


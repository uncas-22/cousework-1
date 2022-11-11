public class Main {
    private static Employee[] employees;
    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Петров Петр Петрович", 2, 44_000.00);
        employees[2] = new Employee("Андреев Андрей Андреевич", 3, 32_300.00);
        employees[3] = new Employee("Александров Александр Александрович", 1, 30_300.00);
        employees[4] = new Employee("Григорьев Григорий Григорьевич", 4, 84_200.00);
        employees[5] = new Employee("Степанов Степан Степанович", 1, 75_200.00);
        employees[8] = new Employee("Валерьев Валерий Валерьевич", 5, 49_600.00);
        printListEmployees();
        System.out.println("\n Сумма зарплат всех работников за текущий месяц составила: " + calculateSumSalary());

        System.out.println("\n Сотрудник с минимальной заработной платой: " + findSalaryMin());

        System.out.println("\n Сотрудник с максимальной заработной платой: " + findSalaryMax());

        System.out.println("\n Среднее значение зарплат действующих сотрудников: " + findAverageValueSalary());
        findFullNameCurrentEmployees();
    }

    public static void printListEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static double calculateSumSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }


    }
}

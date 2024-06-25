public class Main {
    public static void main(String[] args) {
        Employee[] workZone = new Employee[10];

        Person personOne = new Person("Серожа", "Петров", "Инакентьевич");
        Person personTwo = new Person("Петька", "Павлов", "Евгеньевич");
        Person personThree = new Person("Гадя", "Петрович", "Хренова");
        Person personFour = new Person("Вадя", "Пупкин", "Петрович");
        Person personFive = new Person("Иван", "Иванов", "Иванович");
        Person personSix = new Person("Маргарита", "Черезпеньколоду", "Олеговна");
        Person personSeven = new Person("Клара", "Коралавна", "Украдовна");
        Person personEight = new Person("Карл", "Коралович", "Хиросимович");
        Person personNine = new Person("Гена", "Чупыриков", "Чебурашкин");
        Person personTen = new Person("Герберт", "Уэльс", "Ануфриевич");
        Employee employeeOne = new Employee(personOne, 5, 10000);
        Employee employeeTwo = new Employee(personTwo, 1, 20000);
        Employee employeeThree = new Employee(personThree, 3, 30000);
        Employee employeeFour = new Employee(personFour, 2, 40000);
        Employee employeeFive = new Employee(personFive, 4, 25000);
        Employee employeeSix = new Employee(personSix, 1, 50000);
        Employee employeeSeven = new Employee(personSeven, 1, 390010);
        Employee employeeEight = new Employee(personEight, 2, 390000);
        Employee employeeNine = new Employee(personNine, 3, 18000);
        Employee employeeTen = new Employee(personTen, 4, 28000);
        workZone[0] = employeeOne;
        workZone[1] = employeeTwo;
        workZone[2] = employeeThree;
        workZone[3] = employeeFour;
        workZone[4] = employeeFive;
        workZone[5] = employeeSix;
        workZone[6] = employeeSeven;
        workZone[7] = employeeEight;
        workZone[8] = employeeNine;
        workZone[9] = employeeTen;

        Employee.getAllEmployee(workZone);
        System.out.println("Затраты на ЗП - " + Employee.getSummarySalary(workZone));
        System.out.println("Минимальная ЗП из всех работников " + Employee.getMinimalSalaryWorker(workZone));
        System.out.println("Максимальная ЗП из всех работников " + Employee.getMaximalSalaryWorker(workZone));
        Employee.printAllNames(workZone);
        System.out.println("Средняя ЗП - " + Employee.getAverageSalary(workZone));
        System.out.println("___________");
        System.out.println(Employee.getAmountOfEmployees(workZone));
        System.out.println("Минимальная зарплата в отделе у  - " + Employee.getEmployeeMinSalaryDep(workZone,1));
        System.out.println("Максимальная зарплата в отделе у  - " + Employee.getEmployeeMaxSalaryDep(workZone,1));
        System.out.println("Середняя ЗП по отделу - " + Employee.getAverageSalaryDep(workZone, 1));
        System.out.println("Суммарная ЗП по отделу - " + Employee.getSummarySalaryDep(workZone,1));

    }
}
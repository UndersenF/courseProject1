import java.util.Objects;

public class Employee {
    private Person person;
    private int department;
    private int salary;
    private int id;
    private static int counter;

    public Employee(Person person, int department, int salary) {
        this.person = person;
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Отдела " + department + " не существует!");
        }
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    // блок сеттеров и геттеров
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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

    public int getId() {
        return id;
    }

    //блок методов
    public static void getAllEmployee(Employee[] workers) {
        for (Employee worker : workers) {
            System.out.println(worker);
        }
    }

    public static int getSummarySalary(Employee[] workers) {
        int sum = 0;
        for (Employee worker : workers) {
            if (worker == null) {
                continue;
            }
            sum += worker.salary;
        }
        return sum;
    }

    public static void getMinimalSalaryWorker(Employee[] workers) {
        int min = workers[0].salary;
        String name = String.valueOf(workers[0].person);
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null && workers[i].salary < min) {
                min = workers[i].salary;
                name = String.valueOf(workers[i].person);
            }
        }
        System.out.println("Самая низкая зарплата  - " + min + " У " + name);
    }

    public static void getMaximalSalaryWorker(Employee[] workers) {
        int max = workers[0].salary;
        String name = String.valueOf(workers[0].person);
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] == null) {
                continue;
            } else if (workers[i].salary > max) {
                max = workers[i].salary;
                name = String.valueOf(workers[i].person);
            }
        }
        System.out.println("Самая высокая зарплата  - " + max + " У " + name);
    }

    public static void printAllNames(Employee[] workers) {
        for (Employee worker : workers) {
            if (worker == null) {
                continue;
            }
            System.out.println(worker.person);
        }
    }

    public static double getAverageSalary(Employee[] workers) {
        double averageSalary = getSummarySalary(workers) / getMaximalID(workers);
        System.out.println("Средняя зарплата - " + averageSalary);
        return averageSalary;
    }

    public static int getMaximalID(Employee[] workers) {
        int maxId = workers[0].id;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] == null) {
                continue;
            } else if (workers[i].id > maxId) {
                maxId = workers[i].id;
            }
        }
        return maxId;
    }

    public static int getAmountOfEmployees(Employee[] workers) {
        int counter = 0;
        for (int i = 0; i < workers.length; i++) {
            if(workers[i] != null)  {
                counter++;
            }
        }
        return counter;
    }
    public static Employee[] getEmployeesOfOneDepartment (Employee[] workers, int department) {
        Employee[] workersFromOneDepartment = new Employee[getAmountOfEmployees(workers)];
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null && workers[i].getDepartment() == department) {
                workersFromOneDepartment[i] = workers[i];
            }
        }
        return workersFromOneDepartment;
    }

    public static void getEmployeeWithMinSalary(Employee[] workers, int department) {
        Employee[] employeesOfDep = getEmployeesOfOneDepartment(workers, department);
        Employee minSalaryDepartment = employeesOfDep[0];
        getMinimalSalaryWorker(employeesOfDep);
        }


    // Блок переопределений
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && id == employee.id && Objects.equals(person, employee.person) && salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, department, id, salary);
    }

    @Override
    public String toString() {
        return "№ - " + this.id + "/ Ф.И.О. - " + this.person + "/ Отдел -  " + this.department + "/ ЗП - " + this.salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.addEmployeeToDirectory(new Employee(1, 79093456456L, "Миша", 5));
        directory.addEmployeeToDirectory(new Employee(2, 79334563289L, "Таня", 8));
        directory.addEmployeeToDirectory(new Employee(3, 79274545824L, "Аня", 7));
        directory.addEmployeeToDirectory(new Employee(4, 79726678861L, "Андрей", 5));
        directory.addEmployeeToDirectory(new Employee(5, 74959651234L, "Тоша", 3));
        directory.addEmployeeToDirectory(new Employee(6, 79839547887L, "Федя", 2));
        directory.addEmployeeToDirectory(new Employee(7, 75688001234L, "Женя", 10));
        directory.print();
        System.out.println();
        System.out.println(directory.findEmployeeByExperience(5));
        System.out.println();
        System.out.println(directory.findPhoneNumberByName("Egor"));
        System.out.println();
        System.out.println(directory.findEmployeeByPersonellNumber(3));

    }
}
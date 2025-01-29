// Задание 1
class Employee {
    private String fio;      // ФИО
    private String dolzhnost; // Должность
    private String email;    // Email
    private String telefon;  // Телефон
    private double zarplata; // Зарплата
    private int vozrast;     // Возраст

    // Конструктор класса
    public Employee (String fio, String dolzhnost, String email, String telefon, double zarplata, int vozrast) {
        this.fio = fio;
        this.dolzhnost = dolzhnost;
        this.email = email;
        this.telefon = telefon;
        this.zarplata = zarplata;
        this.vozrast = vozrast;
    }

    // Метод для вывода информации об объекте
    public void printInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + dolzhnost);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + telefon);
        System.out.println("Зарплата: " + zarplata);
        System.out.println("Возраст: " + vozrast);
        System.out.println(); // Пустая строка для разделения
    }
    // Задание 2
    // Пример использования класса
    public static void main(String[] args) {
        // Создаем массив из 5 сотрудников
        Employee[] persArray = new Employee[5];

        // Массив сотрудников
        persArray[0] = new Employee("Иванов Иван Иванович", "Менеджер", "ivanov@example.com", "+7 (999) 123-45-67", 50000, 30);
        persArray[1] = new Employee("Петров Петр Петрович", "Разработчик", "petrov@example.com", "+7 (999) 234-56-78", 60000, 28);
        persArray[2] = new Employee("Сидоров Сидор Сидорович", "Дизайнер", "sidorov@example.com", "+7 (999) 345-67-89", 55000, 35);
        persArray[3] = new Employee("Кузнецов Николай Николаевич", "Аналитик", "kuznetsov@example.com", "+7 (999) 456-78-90", 70000, 40);
        persArray[4] = new Employee("Смирнова Анна Андреевна", "HR-менеджер", "smirnova@example.com", "+7 (999) 567-89-01", 45000, 27);

        // Выводим информацию о каждом сотруднике
        for (Employee employee : persArray) {
            employee.printInfo();
        }
    }
}
// Задание 3
public class Park {
    private String name; // Название парка
    private Attraction[] attractions; // Массив аттракционов
    private int count; // Количество аттракционов

    // Конструктор класса Park
    public Park(String name, int maxAttractions) {
        this.name = name;
        this.attractions = new Attraction[maxAttractions];
        this.count = 0;
    }

    // Внутренний класс Attraction
    public class Attraction {
        private String name; // Название аттракциона
        private String workingHours; // Время работы
        private double price; // Стоимость

        // Конструктор класса Attraction
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации об аттракционе
        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println(); // Пустая строка для разделения
        }
    }

    // Метод для добавления аттракциона
    public void addAttraction(String name, String workingHours, double price) {
        if (count < attractions.length) {
            attractions[count] = new Attraction(name, workingHours, price);
            count++;
        } else {
            System.out.println("Достигнуто максимальное количество аттракционов.");
        }
    }

    // Метод для вывода информации о всех аттракционах
    public void printAttractions() {
        System.out.println("Аттракционы в парке " + name + ":");
        for (int i = 0; i < count; i++) {
            attractions[i].printInfo();
        }
    }

    // Пример использования класса
    public static void main(String[] args) {
        Park park = new Park("Развлекательный парк", 5);

        // Добавляем аттракционы
        park.addAttraction("Американские горки", "10:00 - 20:00", 300);
        park.addAttraction("Колесо обозрения", "09:00 - 22:00", 250);
        park.addAttraction("Водные горки", "11:00 - 19:00", 400);
        park.addAttraction("Поездка на паровозике", "10:00 - 18:00", 150);
        park.addAttraction("Качели", "10:00 - 21:00", 100);

        // Выводим информацию об аттракционах
        park.printAttractions();
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];

        // Анализ аргументов командной строки и создание для них экземпляров соответствующих классов
        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");

            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();  // Создание экземпляра сыра
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);  // Создание экземпляра яблока с размером
            } else if (parts[0].equals("Burger")) {
                breakfast[itemsSoFar] = new Burger(parts[1]);  // Создание экземпляра бургера с размером
            }
            itemsSoFar++;
        }

        // Перебор всех элементов массива и их употребление
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();  // Употребить продукт
            } else {
                break;  // Если элемент null, значит достигнут конец списка
            }
        }

        // Подсчитываем количество каждого типа продукта
        System.out.println("Количество сыра: " + countType(breakfast, Cheese.class));
        System.out.println("Количество яблок: " + countType(breakfast, Apple.class));
        System.out.println("Количество бургеров: " + countType(breakfast, Burger.class));

        System.out.println("Всего хорошего!");
    }

    // Метод для подсчета продуктов заданного типа
    public static int countType(Food[] breakfast, Class<?> type) {
        int count = 0;
        for (Food item : breakfast) {
            if (item != null && item.getClass().equals(type)) {
                count++;  // Увеличиваем счетчик, если тип продукта совпадает
            }
        }
        return count;
    }
}

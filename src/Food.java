public abstract class Food implements Consumable {
    String name = null;

    public Food(String name) {
        this.name = name;
    }

    // Переопределение equals() для сравнения объектов Food
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;  // Шаг 1: Проверка на тип
        if (name == null || ((Food) arg0).name == null) return false;  // Шаг 2: Проверка на null
        return name.equals(((Food) arg0).name);  // Шаг 3: Сравнение по имени
    }

    // Переопределение toString() для вывода информации о продукте
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Абстрактный метод consume(), который должен быть реализован в наследниках
    public abstract void consume();
}

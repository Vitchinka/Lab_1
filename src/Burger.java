import java.util.Scanner;

public class Burger extends Food {
    private String size;  // Размер бургера

    public Burger(String size) {
        super("Бургер");  // Инициализируем продукт с именем "Бургер"
        this.size = size;
    }

    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {  // Сравнение по имени
            if (!(arg0 instanceof Burger)) return false;  // Проверка на тип
            return size.equals(((Burger) arg0).size);  // Сравнение по размеру
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}

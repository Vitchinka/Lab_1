public class Apple extends Food {
    private String size;  // Размер яблока

    public Apple(String size) {
        super("Яблоко");  // Инициализируем продукт с именем "Яблоко"
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
            if (!(arg0 instanceof Apple)) return false;  // Проверка на тип
            return size.equals(((Apple) arg0).size);  // Сравнение по размеру
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}

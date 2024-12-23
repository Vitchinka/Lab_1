public class Cheese extends Food {

    public Cheese() {
        super("Сыр");  // Инициализируем продукт с именем "Сыр"
    }

    @Override
    public void consume() {
        System.out.println(this + " съеден");
    }

    // Метод equals() не переопределяется, так как сравнение происходит по полю name
    // Метод toString() не переопределяется, так как метод из базового класса уже выполняет необходимую работу
}

package tasks;

public class task1 {
    public static void main(String[] args) {
        // Создаем массив для списка дел
        String[] todoList = {"Купить продукты", "Сходить в спортзал", "Позвонить другу", "Закончить проект", "Погулять с собакой"};

        // Выводим список дел
        for (String task : todoList) {
            System.out.println(task);
        }
    }
}

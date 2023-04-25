package HW5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Пусть дан список сотрудников:
//Иван Иванов
//Светлана Петрова
//Кристина Белова
//Анна Мусина
//Анна Крутова
//Иван Юрин
//Петр Лыков
//Павел Чернов
//Петр Чернышов
//Мария Федорова
//Марина Светлова
//Мария Савина
//Мария Рыкова
//Марина Лугова
//Анна Владимирова
//Иван Мечников
//Петр Петин
//Иван Ежов
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> namePeople = new HashMap<>();
        String[] staff = {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        };
        countName(staff, namePeople);
        sortedStaff(namePeople);

    }

    // Функция, считающая кол-во повторений имен сотрудников
    public static void countName(String[] people, Map<String, Integer> namePeople) {
        for (String person : people) {
            String name = person.split(" ")[0];
            if (namePeople.containsKey(name)) {
                namePeople.put(name, namePeople.get(name) + 1);
            } else {
                namePeople.put(name, 1);
            }
        }
    }

    // Функция сотртировки по убыванию популярности имени
    public static void sortedStaff(Map<String, Integer> namePeople) {
        Map<String, Integer> sortedWorkerMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : namePeople.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : namePeople.entrySet()) {
                String key = entry.getKey();
                if (namePeople.get(key) == i) {
                    sortedWorkerMap.put(key, namePeople.get(key));
                }
            }
        }
        System.out.println(sortedWorkerMap);
    }

}

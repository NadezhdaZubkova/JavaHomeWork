package HW6;
//    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков (ArrayList).
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
// Выводить только те ноутбуки, что соответствуют условию
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Notebook nb1 = new Notebook("Asus", "15 D543MA-DM1368", 4, 1000,
                "Windows 10", "black");
        Notebook nb2 = new Notebook("Acer", "Aspire 3 A315-23-R0HR", 4, 256,
                "Windows 10", "black");
        Notebook nb3 = new Notebook("Lenovo", "IdeaPad 3 15IML05", 8, 1000,
                "Windows 11", "grey");
        Notebook nb4 = new Notebook("MSI", "Modern 15 B11-002RU", 8, 256,
                "Windows 11", "black");
        Notebook nb5 = new Notebook("Asus", "VivoBook Pro 14 K3400PA-KP109", 16, 512,
                "Windows 10", "grey");
        Notebook nb6 = new Notebook("MSI", "Summit E13 Flip Evo A12MT-061RU", 16, 512,
                "Без ОС", "red");
        Notebook nb7 = new Notebook("Huawei", "MateBook D16 RLEF-X", 16, 512,
                "Windows 10", "grey");
        Notebook nb8 = new Notebook("Asus", "ROG Zephyrus G14 GA402RJ-L4045", 8, 1000,
                "Без ОС", "red");

        List<Notebook> notebookList = List.of(nb1, nb2, nb3, nb4, nb5, nb6, nb7, nb8);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующий цвет или бренд: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (Notebook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.showInfo());
                }
            }

        } else if (choiceUserSearch == 2) {
            for (Notebook brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.showInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        }
        scannerUser.close();
    }
}
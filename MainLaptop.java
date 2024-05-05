import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainLaptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(8, 512, "Windows 8", "Black");
        Laptop laptop2 = new Laptop(8, 1, "Windows 10", "Silver");
        Laptop laptop3 = new Laptop(16, 1, "Windows 10", "Black");
        Laptop laptop4 = new Laptop(8, 512, "MacOS", "Blue");
        Laptop laptop5 = new Laptop(16, 1, "Windows 11", "Red");
        Laptop laptop6 = new Laptop(32, 2, "Windows 11", "Gold");
        
        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6));
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
        
        Map<Integer, String> laptopSort = new HashMap<>();
        laptopSort.put(1, "Ram");
        laptopSort.put(2, "Hdd");
        laptopSort.put(3, "OS");
        laptopSort.put(4, "Color");

        System.out.println("\nВведите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ\n 2 - Объем ЖД\n 3 - Операционная система\n 4 - Цвет\n");
        
        Scanner scanner = new Scanner(System.in, "ibm866");
        int number = scanner.nextInt();       
        

        System.out.println("\nВведите минимальный критерий фильтрации: ");
        Scanner scannerFilter = new Scanner(System.in, "ibm866");
        String parametrs = scannerFilter.nextLine();    
        switch (number) {
            case 1:
                for (Laptop laptop : laptops) {
                    if (Integer.parseInt(parametrs.trim()) == laptop.getRam() || Integer.parseInt(parametrs.trim()) < laptop.getRam()){
                        System.out.println(laptop);
                    }
                }
                break;
            case 2:
                for (Laptop laptop : laptops) {
                    if (Integer.parseInt(parametrs.trim()) == laptop.getHdd() || Integer.parseInt(parametrs.trim()) < laptop.getRam()){
                        System.out.println(laptop);
                    }
                }
                break;
            case 3:
                for (Laptop laptop : laptops) {
                    if (parametrs.equals(laptop.getOS())){
                        System.out.println(laptop);
                    }
                }
                break;
            case 4:
                for (Laptop laptop : laptops) {
                    if (parametrs.equals(laptop.getColor())){
                        System.out.println(laptop);
                    }
                }
                break;
        
            default:
                break;
        }
        scanner.close();
        scanner.close();
        

        
        
        // for (int selectChoise: laptopSort.keySet()) {
        //     String choise = laptopSort.get(selectChoise);
        //     if (choise.equals(number)) {
        //         System.out.println(laptops);
        //     }
        // }
    }
}

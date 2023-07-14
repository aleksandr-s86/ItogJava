
import java.util.LinkedHashMap;
import java.util.Map;

public class cat {


    public static void main(String[] args) {
        // Поля:                                                Методы:
        // 1). Кличка - string                                  Позвать
        // 2). Порода - string                                  Определить породу
        // 3). Окрас -string                                    Определить окрас
        // 4). Пол кота - string                                Указать Пол
        // 5). Возраст кота - integer                           Указать Возраст
        // 6). Хозяин - string,                                 Имя хозяина
        
        Map<String,String>cat1 = new LinkedHashMap<>();
        Map<String,String>cat2 = new LinkedHashMap<>();

            cat1.put("Name ", "Barsik"); 
            cat1.put("Breed", "Siberian");
            cat1.put("Color", "Red");
            cat1.put("Gender of cats", "Male");
            cat1.put("Age", "5");
            cat1.put("Owner", "Pete");

            cat2.put("Name ", "Mus'ka"); 
            cat2.put("Breed", "British");
            cat2.put("Color", "Grey");
            cat2.put("Gender of cats", "Female");
            cat2.put("Age", "2");
            cat2.put("Owner", "Fedor");

            for(Map.Entry<String,String>cats : cat1.entrySet()){
                System.out.printf("%s:  %s\n", cats.getKey(), cats.getValue());
            }
            System.out.println("-----------------------");

            for(Map.Entry<String,String>cats : cat2.entrySet()){
                System.out.printf("%s:  %s\n", cats.getKey(), cats.getValue());
            }
            
        }
}



    

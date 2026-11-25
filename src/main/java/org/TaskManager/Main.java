//ІО-46 №20 Шкурлатівський Д.С.
//Завдання 2.1

package org.TaskManager;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person1= new Person("Віталій", "Персона",25);
        System.out.println("Створений об'єкт "+
                person1.getName()+" "+
                person1.getSurname()+", "+
                person1.getAge()+" років"
        );
        Gson gson = new Gson();

        String json = gson.toJson(person1);

        Person person2 = gson.fromJson(json, Person.class);
        System.out.println("Розпакований з Json об'єкт "+
                person2.getName()+" "+
                person2.getSurname()+", "+
                person2.getAge()+" років"
        );

        if (person1.equals(person2)){
            System.out.println("person1 та person2 ідентичні");
        }else{
            System.out.println("person 1 та person 2 різні");
        }

        if (person1.hashCode() == person2.hashCode()){
            System.out.println("person1 та person2 ідентичні(За Hash кодом)");
        }else{
            System.out.println("person 1 та person 2 різні(За Hash кодом)");
        }
    }
}

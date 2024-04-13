package org.example;

import java.util.ArrayList;
import java.util.List;

enum Sex {
    male, female
}

class CatList {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Yamada", "Tama", 0, 3, 4.5, Sex.female));
        cats.add(new Cat("Sato", "Mike", 0, 0, 6.2, Sex.male));
        cats.add(new Cat("Maeda", "Nyanta", 2, 6, 0.0, Sex.male));

        cats.get(0).setOwnerLastName("Suzuki");

        System.out.println("---Cat_List---");
        int number = 1;
        for (Cat cat : cats) {
            System.out.printf("<No.%d_Name:%s>\n Age:%s\n Sex:%s\n Weight:%s\n",
                    number, cat.getFullName(),
                    (cat.ageYears > 0 || cat.ageMonths > 0 ? cat.getAge() : "0 years 0 months"),
                    (cat.sex),
                    cat.weight > 0 ? cat.weight + " kg" : "0 kg");
            System.out.println(cat.getHealthMessage());
            number++;
        }
    }
}

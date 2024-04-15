package org.example;

class Cat {
    public String ownerLastName;
    public String name;
    public int ageYears;
    public int ageMonths;
    public double weight;
    public Sex sex;

    public Cat(String ownerLastName, String name, int ageYears,
               int ageMonths, double weight, Sex sex) {
        this.ownerLastName = ownerLastName;
        this.name = name;
        this.ageYears = ageYears;
        this.ageMonths = ageMonths;
        this.weight = weight;
        this.sex = sex;
    }

    public String getFullName() {
        return ownerLastName + " " + name;
    }

    public void setOwnerLastName(String newLastName) {
        System.out.printf("Changed from %S %s to %s %s.\n",
                ownerLastName, name, newLastName, name) ;
        this.ownerLastName = newLastName;
    }

    public String getAge() {
        return ageYears + " years " + ageMonths + " months";
    }


    public String getHealthMessage() {
        String message = " Spay/Neuter:";
        if (ageYears == 0) {
            message += "Data is insufficient.\n";
        } else {
            switch (sex) {
                case female:
                    message += "Spaying is necessary.\n";
                    break;
                case male:
                    message += "Neutering is necessary.\n";
                    break;
            }
        }

        message += " Level of obesity:";
        if (weight == 0.0) {
            message += "Data is insufficient.";
        } else if (weight < 5.0) {
            message += "Standard.";
        } else if (weight >= 5.0 && weight < 6.0) {
            message += "Slightly overweight.";
        } else if (weight >= 6.0) {
            message += "Obese, Diet required.";
        }
        return message;
    }
}

package org.example;

public class Cat {
    public String ownerLastName;
    public String name;
    public int ageYears;
    public int ageMonths;
    public double weight;
    public String gender;

    public Cat(String ownerLastName, String name, int ageYears,
               int ageMonths, double weight, String gender) {
        this.ownerLastName = ownerLastName;
        this.name = name;
        this.ageYears = ageYears;
        this.ageMonths = ageMonths;
        this.weight = weight;
        this.gender = gender;
    }

    public String getFullName() {
        return "name:" + ownerLastName + " " + name;
    }

    public void setOwnerLastName(String newLastName) {
        System.out.println("Changed from "
                + ownerLastName + " "
                + name + " to "
                + newLastName + " "
                + name + ".");
        this.ownerLastName = newLastName;
    }

    public String getAge() {
        return ageYears + " years " + ageMonths + " months";
    }


    public String getHealthMessage() {
        String message = "Spay/Neuter:";
        if (ageYears == 0) {
            message = "Data is insufficient.\n";
        } else if ("female".equalsIgnoreCase(gender)) {
                message += "Spaying is necessary.\n";
            } else if ("male".equalsIgnoreCase(gender)) {
                message += "Neutering is necessary.\n";
            }

        message += "Level of obesity:";
        if (weight == 0.0) {
            message += "Data is insufficient.";
        } else if (weight < 5.0) {
            message += "Standard.";
        } else if (weight >= 5.5 && weight < 6.0) {
            message += "Slightly overweight.";
        } else if (weight >= 9.0) {
            message += "Obese, diet required.";
        }
        return message;
    }
}

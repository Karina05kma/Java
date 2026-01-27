package com.example.calculator.school.lesson1;

import java.util.ArrayList;
import java.util.List;

public class FirstClass {
        public static class StaffMember {
            String fullName, post, email, phone;
            int age, salary;
         public StaffMember(String fullName, String post, String email, int age, String phone, int salary) {
                this.fullName = fullName;
                this.post = post;
                this.email = email;
                this.age = age;
                this.phone = phone;
                this.salary = salary;
            }
            @Override
            public String toString(){
                String format = String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                        fullName, post, email, phone, salary, age);
                return format;}
            public void print(){
                System.out.println(this);
            }
        }

    public static void main(String[] args) {
        StaffMember[] persArray = new StaffMember[5];
        persArray[0] = new StaffMember("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 30, "+792312312", 30000);
        persArray[1] = new StaffMember("Petrov Peter", "Director", "pp@mailbox.ru", 41, "+79998884455", 210000);
        persArray[2] = new StaffMember("Sidorov Dmitriy", "Security", "dm@mailbox.ru", 34, "+79997771234", 10000);
        persArray[3] = new StaffMember("Volkova Anna", "Developer", "vanna@mailbox.ru", 29, "+79995554789", 200000);
        persArray[4] = new StaffMember("Pavlova Marina", "PC", "pmarina@mailbox.ru", 44, "+79994445896", 190000);

        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) {
                persArray[i].print();
            }
        }
        public class Park{
            private String name;
            private List<Attractions> attractions = new ArrayList<>();

            public Park(String name, List<Attractions> attractions) {
                this.name = name;
            }
            public void addAttractions(String attrName, String workingHours, double cost) {
                attractions.add(new Attractions(attrName, workingHours, cost));
            }
            public class Attractions {
                String attrName;
                String workingHours;
                double cost;


                public Attractions(String attrName, String workingHours, double cost) {
                    this.attrName = attrName;
                    this.workingHours = workingHours;
                    this.cost = cost;
                }
            }
        }
    }






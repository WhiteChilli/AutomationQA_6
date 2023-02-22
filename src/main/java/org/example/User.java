package org.example;

public class User {
    String name;
    int id;
    int age;

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public User() {
    }

    public void changeName (String newName) {
        this.name = newName;
    }

}


//Часть 2
//        6) Создайте класс User с полями name, id, age.
//        7) Создайте конструктор, инициализирующий поля и конструктор по умолчанию
//        8) Создайте метод, обновляющий name (c входным параметром)
//        9) Напишите юнит тесты, реализующие
//        (а) проверку работы обоих конструкторов
//        (б) проверку работы метода
//        10) дополните файл readme
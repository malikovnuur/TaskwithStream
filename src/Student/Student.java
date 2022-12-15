package Student;

import java.math.BigDecimal;

public class Student {
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private BigDecimal cash;


    public Student(String name, String surname, int age, Gender gender, BigDecimal cash) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.cash = cash;

    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", cash=" + cash +
                '}';
    }



    }



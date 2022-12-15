package Student;

import java.math.BigDecimal;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Aalym", "Berdibekov", 23, Gender.Male, new BigDecimal(4500)),
                new Student("Berdigul", "Kimsanbaev", 26, Gender.Male, new BigDecimal(9500)),
                new Student("Arun", "Berdibekov", 13, Gender.Male, new BigDecimal(850)),
                new Student("Abay", "Jenishov", 23, Gender.Male, new BigDecimal(12500)),
                new Student("Jazgul", "Mamatova", 28, Gender.Female, new BigDecimal(10500)),
                new Student("Ayana", "Maksatova", 24, Gender.Female, new BigDecimal(1999))

        ));

        System.out.println(" // 1 ATY 'a' MENEN BASHTALGAN STUDENTTER // ");
        students.stream().filter(x -> x.getName().startsWith("A")).forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(" // 2 JASHY 15DEN CHON JANA AKCHASY 2000DEN CHON STUDENTTER // ");
        students.stream().filter(x -> x.getAge() > 15 && x.getCash().intValue() > 2000).forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(" // 3 EN KOP AKCHASY BAR STUDENT // ");
        Optional<Student> max = students.stream().max(Comparator.comparing(Student::getCash));
        System.out.println(max);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" // 4 AKCHASY EN KOP KYZ // ");

        Optional<Student> maxFemale=students.stream().filter(x->x.getGender().equals(Gender.Female)).max(Comparator.comparing(Student::getCash));
        System.out.println(maxFemale);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(" // 5 AKCHASY EN KOP BALA // ");

        Optional<Student> maxMale=students.stream().filter(x->x.getGender().equals(Gender.Male)).max(Comparator.comparing(Student::getCash));
        System.out.println(maxMale);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(" // 6 BAARDYK STUDENTTERDIN ``ATY`` // ");
        students.stream().map(Student::getName).forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(" // 7 BAARDYK STUDENTTERDIN ATYNA 1000SOM KOSHUP CHYGARUU // ");
        students.stream().map(x->x.getCash().intValue()+1000).forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(" // 8 BIRINCHI TURGAN STUDENTTI CHYGARUU // ");
        System.out.println(students.stream().findFirst());


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(" // 9 KANCHA STUDENT BAR // ");
        System.out.println((long)students.size());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(" // 10 BALDARDY JANA KYZDARDY GRUPPAGA SALUU // ");

        List<Student>MaleStudents=students.stream().filter(x->x.getGender().equals(Gender.Male)).toList();
        List<Student>FemaleStudents=students.stream().filter(x->x.getGender().equals(Gender.Female)).toList();
        System.out.println("Male Students\n" + MaleStudents);
        System.out.println("Female Students\n" + FemaleStudents);


    }
}

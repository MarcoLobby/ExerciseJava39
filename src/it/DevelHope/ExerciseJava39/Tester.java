package it.DevelHope.ExerciseJava39;

public class Tester {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Marco"," Lo Bello", "Via dei Pini, 4");
        Badge badge1 = new Badge(employee1);
        badge1.showBadgeDetails();

        System.out.println("-------------------");

        Employee employee2 = new Employee("Jason", " Di Bartolo","Via dei Pigni, 20");
        Badge badge2 = new Badge(employee2);
        badge2.showBadgeDetails();

    }
}

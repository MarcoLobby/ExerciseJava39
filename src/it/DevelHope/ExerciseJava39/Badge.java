package it.DevelHope.ExerciseJava39;

public class Badge {
    private static int totalNumberOfEmployees = 0;
    final private  String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }
    private String generateBadgeIdCode(){
        return "XYZ"+employee.getName()+employee.getSurname()+"ZXY";
    }

    public void showBadgeDetails(){
        System.out.println("Total number of employees tracked by badges: " + totalNumberOfEmployees);
        System.out.println("EMPLOYEE DETAILS : " + "\n" + employee.getEmployeeDetails());
        System.out.println("The badge's ID Code is: " + badgeIdCode);

    }
    public Badge (Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
}

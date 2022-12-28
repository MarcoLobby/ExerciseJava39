package it.DevelHope.ExerciseJava39;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Employee {

    final private  String name;
    final private  String surname;
    final private  String address;

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public String getEmployeeDetails (){
        return "Employee name: " + name + "\n" + "Employee surname: " + surname + "\n" + "Employee Address: " + address;

    }
}

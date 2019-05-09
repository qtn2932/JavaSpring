package com.quannnguyen.webemployees;

import java.util.ArrayList;

public class EmpList {
    public ArrayList<Employee> empList=new ArrayList<Employee>();
    public EmpList(){
        empList.add(new Employee("Steve","Green", 45000, true,1,1));
        empList.add(new Employee("Same","Ford", 80000, true,1,1));
        empList.add(new Employee("John","Jons", 75000, true,1,1));
    }
    public Employee findEmployee(CheckEmployee tester){
        for(Employee e:empList){
            if(tester.test(e)){
                return e;
            }
        }
        return null;
    }
    public ArrayList<Employee> findEmployees(CheckEmployee tester){
        ArrayList<Employee> tempEmpList= new ArrayList<>();
        for(Employee e:empList){
            if(tester.test(e)){
                tempEmpList.add(e);
            }
        }
        return tempEmpList;
    }
}

package com.quannnguyen.webemployees;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping
public class EmployeeController {
    // localhost:8080/data/allemployees
    @RequestMapping(value="/allemployees")
    public ResponseEntity<?> getAllEmployees(){
        //WebemployeesApplication.ourEmpList.empList.sort((e1,e2)->(e1.getFname().compareToIgnoreCase(e2.getFname())));
        return new ResponseEntity<>(WebemployeesApplication.ourEmpList.empList, HttpStatus.OK);
    }
    @GetMapping(value="/employees/{letter}")
    public ResponseEntity<?> getEmployeesLetter(@PathVariable char letter){
        ArrayList<Employee>  rtnEmps=WebemployeesApplication.ourEmpList.
                findEmployees(e->e.getFname().toUpperCase().charAt(0)==Character.toUpperCase(letter));
        return new ResponseEntity<>(rtnEmps,HttpStatus.OK);
    }
}

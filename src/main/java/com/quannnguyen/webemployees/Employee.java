package com.quannnguyen.webemployees;

//POJO- plain ol' java object
public class Employee {
    private static final AtomicLong counter= new AtomicLong(); //thread safe( allow concerency)
    private long id;
    private String fname;
    private String lname;
    private double salary;
    private boolean has401k;
    private int companyID;
    private int healthPlanID;

    public Employee(String fname, String lname, double salary, boolean has401k, int companyID, int healthPlanID) {
        this.id=counter.incrementAndGet();
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401k = has401k;
        this.companyID = companyID;
        this.healthPlanID = healthPlanID;
    }

    public Employee(Employee toClone) {
        this.id = toClone.getId();
        this.fname = toClone.getFname();
        this.lname = toClone.getLname();
        this.salary = toClone.getSalary();
        this.has401k = toClone.isHas401k();
        this.companyID = toClone.getCompanyID();
        this.healthPlanID = toClone.getHealthPlanID();
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isHas401k() {
        return has401k;
    }

    public int getCompanyID() {
        return companyID;
    }

    public int getHealthPlanID() {
        return healthPlanID;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", salary=" + salary +
                ", has401k=" + has401k +
                ", companyID=" + companyID +
                ", healthPlanID=" + healthPlanID +
                '}';
    }
}

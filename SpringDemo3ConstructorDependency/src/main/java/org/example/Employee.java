package org.example;

public class Employee {
    private int empId;
    private String name;
    private String email;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        System.out.println("Employee: setter empId");
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void init() {
        System.out.println("Employee init() method called");
    }

    public void destroy() {
        System.out.println("Employee destroy() method called");
    }
}

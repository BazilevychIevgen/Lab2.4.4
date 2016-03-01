package edu.brainacad;

/**
 * Created by Admin on 01.03.2016.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private int occupation;
    private long telephone;
    private static int numberOfEmployees;

    public Employee(String firstName, String lastName,int occupation, long telephone){

        numberOfEmployees++;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOccupation(int occupation) {
        this.occupation = occupation;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getOccupation() {
        return occupation;
    }

    public long getTelephone() {
        return telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}

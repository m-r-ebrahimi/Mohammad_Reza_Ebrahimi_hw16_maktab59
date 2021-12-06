package entity.core;

import entity.Team;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import java.util.Date;

@MappedSuperclass
public abstract class Person extends BaseEntity {
    @Column
    private String name;
    @Column
    private double salary;
    @Column
    private double price;
    @Column
    private Date hireDate;
    @Column
    private Date hireExpiryDate;

    public Person() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getHireExpiryDate() {
        return hireExpiryDate;
    }

    public void setHireExpiryDate(Date hireExpiryDate) {
        this.hireExpiryDate = hireExpiryDate;
    }

    public Integer getId() {
        return super.getId();
    }

    @Override
    public abstract String getClassName();

    @Override
    public String toString() {
        return super.toString() +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", price=" + price +
                ", hireDate=" + hireDate +
                ", hireExpiryDate=" + hireExpiryDate;
    }
}

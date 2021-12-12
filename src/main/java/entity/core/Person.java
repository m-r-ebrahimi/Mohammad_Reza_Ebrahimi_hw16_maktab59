package entity.core;

import entity.Player;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class Person extends BaseEntity {
    @Column
    private String name;
    @Column
    private double salary;
    @Column
    private Date hireDate;
    @Column
    private Date hireExpiryDate;

    public Person(String name, double salary, Date hireDate, Date hireExpiryDate) {
        super();
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.hireExpiryDate = hireExpiryDate;
    }

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
                ", hireDate=" + hireDate +
                ", hireExpiryDate=" + hireExpiryDate +
                ", ";
    }

    public static PersonBuilder personBuilder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String name;
        private double salary;
        private Date hireDate;
        private Date hireExpiryDate;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public PersonBuilder setHireDate(Date hireDate) {
            this.hireDate = hireDate;
            return this;
        }

        public PersonBuilder setHireExpiryDate(Date hireExpiryDate) {
            this.hireExpiryDate = hireExpiryDate;
            return this;
        }

        public Person createPerson() {
            return new Person(name, salary, hireDate, hireExpiryDate) {
                @Override
                public String getClassName() {
                    return Person.class.getName();
                }
            };
        }
    }
}

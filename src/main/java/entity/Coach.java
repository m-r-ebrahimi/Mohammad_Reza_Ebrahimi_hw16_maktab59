package entity;

import entity.core.Person;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Coach extends Person {
    @OneToOne
    private Team team;

    public Coach(String name, double salary, Date hireDate, Date hireExpiryDate, Team team) {
        super(name, salary, hireDate, hireExpiryDate);
        this.team = team;
    }

    public Coach() {
        super();
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String getClassName() {
        return Coach.class.getSimpleName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "team=" + team.getName()+
                '}'+
                "\n";
    }
    public static CoachBuilder coachBuilder() {
        return new CoachBuilder();
    }
    public static class CoachBuilder {
        private String name;
        private double salary;
        private Date hireDate;
        private Date hireExpiryDate;
        private Team team;

        public CoachBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CoachBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public CoachBuilder setHireDate(Date hireDate) {
            this.hireDate = hireDate;
            return this;
        }

        public CoachBuilder setHireExpiryDate(Date hireExpiryDate) {
            this.hireExpiryDate = hireExpiryDate;
            return this;
        }

        public CoachBuilder setTeam(Team team) {
            this.team = team;
            return this;
        }

        public Coach createCoach() {
            return new Coach(name, salary, hireDate, hireExpiryDate, team);
        }
    }
}

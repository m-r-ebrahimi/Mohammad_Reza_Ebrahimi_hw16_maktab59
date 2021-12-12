package entity;

import entity.core.Person;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Player extends Person {
    @ManyToOne
    private Team team;

    public Player(String name, double salary, Date hireDate, Date hireExpiryDate, Team team) {
        super(name, salary, hireDate, hireExpiryDate);
        this.team = team;
    }
    public Player() {
        super();
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String getClassName() {
        return Player.class.getSimpleName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "team=" + team.getName() +
                '}'+
                "\n";
    }
    public static PlayerBuilder playerBuilder() {
        return new PlayerBuilder();
    }
    public static class PlayerBuilder {
        private String name;
        private double salary;
        private Date hireDate;
        private Date hireExpiryDate;
        private Team team;

        public PlayerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlayerBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public PlayerBuilder setHireDate(Date hireDate) {
            this.hireDate = hireDate;
            return this;
        }

        public PlayerBuilder setHireExpiryDate(Date hireExpiryDate) {
            this.hireExpiryDate = hireExpiryDate;
            return this;
        }

        public PlayerBuilder setTeam(Team team) {
            this.team = team;
            return this;
        }

        public Player createPlayer() {
            return new Player(name, salary, hireDate, hireExpiryDate, team);
        }
    }
}

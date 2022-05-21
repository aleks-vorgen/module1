package com.kulykov;

public class Soldier extends Person {
    protected String rank;
    protected int company; //Рота
    private Commander commander;

    public Soldier() {
        super();
    }

    public Soldier(String name, int age, String rank, int company) {
        super(name, age);
        this.rank = rank;
        this.company = company;
    }

    public Soldier(String name, int age, String rank, int company, Commander commander) {
        super(name, age);
        this.rank = rank;
        this.company = company;
        this.commander = commander;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getCompany() {
        return company;
    }

    public void setCompany(int company) {
        this.company = company;
    }

    public Commander getCommander() {
        return commander;
    }

    public void setCommander(Commander commander) {
        this.commander = commander;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String fightable() {
        return "I`m soldier. I can fight";
    }

    @Override
    public String reportable() {
        return "I`m soldier. My commander is " + commander.getName();
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name= " + getName() +
                ", age= " + getAge() +
                ", rank= '" + rank +
                ", company= " + company +
                ", commander= " + commander +
                '}';
    }
}

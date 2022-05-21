package com.kulykov;

public class General extends Soldier {
    private String fleet; //Флот
    private String squadron; //Эскадрилья

    public General() {
        super();
    }

    public General(String name, int age, String rank, int company, String fleet, String squadron) {
        super(name, age, rank, company);
        this.fleet = fleet;
        this.squadron = squadron;
    }

    public String getFleet() {
        return fleet;
    }

    public void setFleet(String fleet) {
        this.fleet = fleet;
    }

    public String getSquadron() {
        return squadron;
    }

    public void setSquadron(String squadron) {
        this.squadron = squadron;
    }

    @Override
    public String getRank() {
        return super.getRank();
    }

    @Override
    public void setRank(String rank) {
        super.setRank(rank);
    }

    @Override
    public int getCompany() {
        return super.getCompany();
    }

    @Override
    public void setCompany(int company) {
        super.setCompany(company);
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
        return "I`m general. I may not fight";
    }

    @Override
    public String reportable() {
        return "I`m general. I can report";
    }

    @Override
    public String toString() {
        return "General{" +
                " name='" + getName() +
                ", age='" + getAge() +
                ", rank='" + getRank() +
                ", company=" + getCompany() +
                ", fleet='" + fleet +
                ", squadron='" + squadron +
                '}';
    }
}

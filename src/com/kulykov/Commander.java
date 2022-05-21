package com.kulykov;

public class Commander extends Soldier {
    private int platoon; //Взвод
    private int didvision; //Дивизион
    private General general;

    public Commander() {
        super();
    }

    public Commander(String name, int age, String rank, int company, int platoon, int didvision, General general) {
        super(name, age, rank, company);
        this.platoon = platoon;
        this.didvision = didvision;
        this.general = general;
    }

    public int getPlatoon() {
        return platoon;
    }

    public void setPlatoon(int platoon) {
        this.platoon = platoon;
    }

    public int getDidvision() {
        return didvision;
    }

    public void setDidvision(int didvision) {
        this.didvision = didvision;
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
        return "I`m commander. I can fight";
    }

    @Override
    public String reportable() {
        return "I`m commander. My general is " + general.getName();
    }

    @Override
    public String toString() {
        return "Commander{" +
                " name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", rank='" + getRank() + '\'' +
                ", company=" + getCompany() +
                ", platoon=" + platoon +
                ", didvision=" + didvision +
                '}';
    }
}

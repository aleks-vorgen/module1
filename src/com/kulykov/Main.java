package com.kulykov;

import com.kulykov.interfaces.Warable;

public class Main {

    public static void main(String[] args) {

        Warable[] army = new Warable[9];
        army[0] = new General("General", 58, "Сolonel-general", 113, "Military fleet", "Maritime aviation");
        army[1] = new Commander("Commander1", 42, "Colonel", 111, 36, 3, (General) army[0]);
        army[2] = new Commander("Commander2", 40, "Private", 100, 24, 4, (General) army[0]);
        army[3] = new Soldier("Soldier1", 25, "Private-second", 113, (Commander) army[1]);
        army[4] = new Soldier("Soldier2", 26, "Specialist", 113, (Commander) army[1]);
        army[5] = new Soldier("Soldier3", 24, "Corporal", 113, (Commander) army[1]);
        army[6] = new Soldier("Soldier4", 25, "Sergeant", 113, (Commander) army[2]);
        army[7] = new Soldier("Soldier5", 30, "Master-sergeant", 113, (Commander) army[2]);
        army[8] = new Soldier("Soldier6", 32, "Corporal", 113, (Commander) army[2]);

        for(Warable person : army) {
            System.out.println(person);
            System.out.println(person.fightable());
            System.out.println(person.reportable());
        }
    }
}

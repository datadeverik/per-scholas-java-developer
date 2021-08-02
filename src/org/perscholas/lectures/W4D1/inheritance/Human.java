package org.perscholas.lectures.W4D1.inheritance;

public class Human extends LivingThing {
    private String lang;
    private int ssn;
    private boolean canDrive;
    private boolean canCook;

    public Human(String eat, float height, float weight, String walk, int age, boolean vision, String feelings, String breath, String name, String gender, String communication, String lang, int ssn, boolean canDrive, boolean canCook) {
        super(eat, height, weight, walk, age, vision, feelings, breath, name, gender, communication);
        this.lang = lang;
        this.ssn = ssn;
        this.canDrive = canDrive;
        this.canCook = canCook;
    }
}

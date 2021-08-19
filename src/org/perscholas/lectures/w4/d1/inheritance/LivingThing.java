package org.perscholas.lectures.w4.d1.inheritance;

public class LivingThing {
    protected String eat;
    protected float height;
    protected float weight;
    protected String walk;
    protected int age;
    protected boolean vision;
    protected String feelings;
    protected String breath;
    protected String name;
    protected String gender;
    protected String communication;

    public LivingThing() {
    }

    public LivingThing(String eat, float height, float weight, String walk, int age, boolean vision, String feelings, String breath, String name, String gender, String communication) {
        this.eat = eat;
        this.height = height;
        this.weight = weight;
        this.walk = walk;
        this.age = age;
        this.vision = vision;
        this.feelings = feelings;
        this.breath = breath;
        this.name = name;
        this.gender = gender;
        this.communication = communication;
    }

    public void eat() {
        this.eat = "yes they can eat";
        System.out.println(this.eat);
    }

    public void howToCommunicate() {
        System.out.println("living things are able to communicate");
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVision() {
        return vision;
    }

    public void setVision(boolean vision) {
        this.vision = vision;
    }

    public String getFeelings() {
        return feelings;
    }

    public void setFeelings(String feelings) {
        this.feelings = feelings;
    }

    public String getBreath() {
        return breath;
    }

    public void setBreath(String breath) {
        this.breath = breath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    @Override
    public String toString() {
        return "LivingThing{" +
                "eat='" + eat + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", walk='" + walk + '\'' +
                ", age=" + age +
                ", vision=" + vision +
                ", feelings='" + feelings + '\'' +
                ", breath='" + breath + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", communication='" + communication + '\'' +
                '}';
    }
}


package com.example.petnannydev.Classes;

public class PetProfile {
    private String name;
    private String owner;
    private String breed;
    private Birthday birthday;
    private Picture pic;
    private int age;
    public PetProfile(String name, String owner, String breed, Birthday birthday, Picture Pic, int age) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.birthday = birthday;
        this.pic = pic;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Picture getPic() {
        return pic;
    }

    public String getBreed() {
        return breed;
    }

    public String getOwner() {
        return owner;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    /** Implement once access to java Time/Calendar library is granted */
    public void updateAge() {

    }
}
package LinkedList;

public class Horse {
    public String name;
    public int age;
    public String gender;

    public Horse(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public Horse(Horse horse) {
        System.err.println(
                "Nama Kuda" + horse.getName() + "Umur Kuda" + horse.getAge() + " Gender Kuda" + horse.getGender());
    }

}
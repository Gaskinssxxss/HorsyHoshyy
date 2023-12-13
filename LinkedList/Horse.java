package LinkedList;

public class Horse {
    public String name;
    public int age;
    public String gender;
    Kandang nomorKandang;

    public Horse(String name, int age, String gender, Kandang nomorKandang) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nomorKandang = nomorKandang;
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
    
    public void setNomorKandang(Kandang nomorKandang) {
        this.nomorKandang = nomorKandang;
    }
    

    public int getNomorKandang() {
        return nomorKandang.getNomor();
    }

    public Horse(Horse horse) {
        System.err.println("Suksess suksesss!!!");
    }

}
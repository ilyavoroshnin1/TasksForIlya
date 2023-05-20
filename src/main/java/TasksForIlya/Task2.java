package TasksForIlya;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Katy");
        names.add("Michel");
        names.add("Andrew");
        names.add("Cris");
        names.add("Stan");
        names.add("Lebron");
        names.add("Melany");
        names.add("Victor");
        names.add("Gus");

        System.out.println(Randoms.getRandomName(names));
    }
}

class User{
    private String name;
    private int age;
    private boolean isMaried;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMaried(boolean maried) {
        isMaried = maried;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMaried() {
        return isMaried;
    }
}

class Randoms {
    public static String getRandomName(List<String> T) {
        Random random = new Random();
        int randomIndex = random.nextInt(T.size());
        String randomName = T.get(randomIndex);
        return randomName;
    }
}
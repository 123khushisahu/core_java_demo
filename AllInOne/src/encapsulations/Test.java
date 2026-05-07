package encapsulations;

class Student {
    private String name;   // hidden data

    public void setName(String n) {   // set method
        name = n;
    }

    public String getName() {   // get method
        return name;
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ram");
        System.out.println(s.getName());
    }
}

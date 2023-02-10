public class Animal {

    static final double PI=3.14;
    private String name;
    private int age;

    private boolean old;

    public Animal(int age){
        this.age=age;

    }
    public static void alive(){
        System.out.println("Живое животное");
    }
    public void run(){
        System.out.println("This animal runs");
    }

    public Animal(String f, int e){
    this.name=f;
    this.age=e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOld() {
        return old;
    }

    public void setOld(boolean old) {
        this.old = old;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", old=" + old +
                '}';
    }
}

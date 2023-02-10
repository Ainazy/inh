public class Snake extends Animal {
   private  String longer;

    public Snake(String f,int e,String longer) {
        super(f,e);
        this.longer=longer;
    }


    public void run() {
        System.out.println("This animal creeps");
    }
}

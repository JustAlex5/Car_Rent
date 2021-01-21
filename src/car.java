public class car {

    private int ID;
    private String Maker;
    private String Model;
    private double engine;
    private int airBags;
    public car(int ID,String Maker,String Model) {
        this.ID = ID;
        this.Model=Model;
        this.Maker=Maker;
    }

    public void print(){
        System.out.println(this.ID +" "+ this.Model +" "+ this.Maker);

    }


}
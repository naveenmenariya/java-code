public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();//creared a Pen object called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        //p1.setColor("yellow");
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
}



class Pen {
    private String color;
    private int tip;
    String getColor() {
        return this.color;
    }
    int getTip() {
        return this.tip;
    }
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}


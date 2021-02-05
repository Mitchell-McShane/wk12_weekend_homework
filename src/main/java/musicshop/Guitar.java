package musicshop;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private String model;
    private int numberOfStrings;

    public Guitar(String colour, String type, String model, int numberOfStrings) {
        super(colour, "String");
        this.model = model;
        this.numberOfStrings = numberOfStrings;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String play(){
        return "Rock on!";
    }
}

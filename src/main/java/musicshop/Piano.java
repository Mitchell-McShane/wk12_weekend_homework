package musicshop;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private String manufacturer;

    public Piano(String colour, String type, String manufacturer) {
        super(colour, "Piano");
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String play(){
        return "plink";
    }
}

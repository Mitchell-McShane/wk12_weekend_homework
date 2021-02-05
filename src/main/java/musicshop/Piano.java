package musicshop;

import behaviours.IPlay;

public class Piano implements IPlay {

    private String manufacturer;

    public Piano(String manufacturer){
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

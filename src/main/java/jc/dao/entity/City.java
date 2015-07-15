package jc.dao.entity;


/**
 * Created by 金成 on 2015/7/12.
 */

public class City {

    private long ID;
    private String Name;
    private String CountryCode;
    private String District;
    private long Population;


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }


    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }


    public long getPopulation() {
        return Population;
    }

    public void setPopulation(long population) {
        Population = population;
    }

}

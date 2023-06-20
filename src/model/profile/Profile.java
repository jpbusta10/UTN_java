package model.profile;

import model.Exceptions.MuyPendejoException;

public class Profile {
    private String dob;
    private String name;
    private String abaut;
    private String adress;
    private String company;
    private Location location;

    public Profile(String dob, String name, String abaut, String adress, String company) throws MuyPendejoException {
        this.dob = dob;
        String[] dobs = dob.split("-");
        if(Integer.parseInt(dobs[0])>1990){
            throw new MuyPendejoException("es muy joven este");
        }
        this.name = name;
        this.abaut = abaut;
        this.adress = adress;
        this.company = company;
        this.location = new Location();
    }
    public void agregarLocation (Location nueva){
        this.location = nueva;
    }

    public Profile() {
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbaut() {
        return abaut;
    }

    public void setAbaut(String abaut) {
        this.abaut = abaut;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "\nProfile{" +
                "\ndob='" + dob + '\'' +
                ", \nname='" + name + '\'' +
                ", \nabaut='" + abaut + '\'' +
                ", \nadress='" + adress + '\'' +
                ", \ncompany='" + company + '\'' +
                ", \nlocation=" + location +
                '}';
    }
}

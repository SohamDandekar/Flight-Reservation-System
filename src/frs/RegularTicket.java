package frs;

public class RegularTicket {
    private String[] specialServices;

    public RegularTicket(String[] specialServices) {
        this.specialServices = specialServices;
    }

    public String getSpecialServices() {
        String specialServices = "Selected Services: ";
        for(String ele: this.specialServices){
            specialServices = specialServices + ele + " ";
        }
        return specialServices;
    }

    public void setSpecialServices(String[] specialServices) {
        this.specialServices = specialServices;
    }
}

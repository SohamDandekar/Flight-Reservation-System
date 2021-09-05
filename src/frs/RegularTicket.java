package frs;

public class RegularTicket {
    private String[] specialServices;

    public RegularTicket(String[] specialServices) {
        this.specialServices = specialServices;
    }

    public String[] getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String[] specialServices) {
        this.specialServices = specialServices;
    }
}

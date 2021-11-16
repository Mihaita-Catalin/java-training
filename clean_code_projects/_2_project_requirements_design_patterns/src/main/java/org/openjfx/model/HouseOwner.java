package org.openjfx.model;

public class HouseOwner extends Person {
    private final Apartment apartment;

    private HouseOwner(Apartment apartment, String houseOwnerName, int houseOwnerPhoneNumber) {
        super(houseOwnerName, houseOwnerPhoneNumber);
        this.apartment = apartment;
    }

    void addBill(Bill bill) {
        apartment.getBills().add(bill);
        System.out.println("Factura adaugata!");
    }

    void displayUnpaidBills() {
        for (Bill bill : apartment.getBills()) {
            if (!bill.isStatus()) {
                System.out.println(bill);
            }
        }
    }

    public void addTenant(Tenant tenant) {
        apartment.getTenants().add(tenant);
        System.out.println(tenant.getUserName() + " este noul chirias!");
    }

    void removeTenant(int phoneNumber) {
        for (Tenant tenant : apartment.getTenants()) {
            if (tenant.getPhoneNumber() == phoneNumber) {
                System.out.println(tenant.getUserName() + " nu mai este chirias!");
                apartment.getTenants().remove(tenant);
            }
        }

    }

    public void displayTenants() {
        for (Tenant tenant : apartment.getTenants()) {
            System.out.println(tenant.toString());
        }
    }

    @Override
    public String toString() {
        return "HouseOwner{" +
                "apartment=" + apartment +
                '}';
    }
}



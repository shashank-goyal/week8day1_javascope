package com.allstate.compozed.policy;

/**
 * Created by localadmin on 5/31/16.
 */
public class HomeOwner {

    static String sharedValue = "Shared Value";

    private String ownerName;
    private String address;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Home Owner Policy";
    }

    public String fileClaim(){
        int amount = 5;
        return "$" + amount;
    }
}

package com.example.edoofun;

public class model_peminatan {
    private String peminatan, id;

    public model_peminatan(String id, String peminatan) {
        this.id = id;
        this.peminatan = peminatan;
    }

    public model_peminatan() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPeminatan() {
        return peminatan;
    }

    public void setPeminatan(String peminatan) {
        this.peminatan = peminatan;
    }

}

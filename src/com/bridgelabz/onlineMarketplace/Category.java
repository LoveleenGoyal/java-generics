package com.bridgelabz.onlineMarketplace;

interface Category {}

class BookCategory implements Category {
    private String genre;

    public BookCategory(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}

class ClothingCategory implements Category {
    private String type;

    public ClothingCategory(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class GadgetCategory implements Category {
    private String technology;

    public GadgetCategory(String technology) {
        this.technology = technology;
    }

    public String getTechnology() {
        return technology;
    }
}

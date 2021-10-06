package com.example.TermProjectTest;

public class FormObject {
    private String search;
    private String attribute;
    private String advIncluding;
    private String advExcluding;
    private String advExact;
    private String category;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getCategory() {
        return category;
    }

    public String getAdvExact() {
        return advExact;
    }

    public String getAdvExcluding() {
        return advExcluding;
    }

    public String getAdvIncluding() {
        return advIncluding;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAdvExact(String advExact) {
        this.advExact = advExact;
    }

    public void setAdvIncluding(String advIncluding) {
        this.advIncluding = advIncluding;
    }

    public void setAdvExcluding(String advExcluding) {
        this.advExcluding = advExcluding;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

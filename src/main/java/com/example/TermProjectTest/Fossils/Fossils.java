package com.example.TermProjectTest.Fossils;

import com.example.TermProjectTest.GenericTable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fossils extends GenericTable {
    private String name, image, purchasePrice;
    private Integer salePrice;
    private String fossilGroup, description, color_1, color_2, size, source, museumRoom, interactable;
    @Id
    private String uniqueEntryId;

    public String getColor_1() {
        return color_1;
    }

    public String getColor_2() {
        return color_2;
    }

    public String getDescription() {
        return description;
    }

    public String getFossilGroup() {
        return fossilGroup;
    }

    public String getImage() {
        return image;
    }

    public String getInteractable() {
        return interactable;
    }

    public String getMuseumRoom() {
        return museumRoom;
    }

    public String getName() {
        return name;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public String getSize() {
        return size;
    }

    public String getSource() {
        return source;
    }

    public String getUniqueEntryId() {
        return uniqueEntryId;
    }
}

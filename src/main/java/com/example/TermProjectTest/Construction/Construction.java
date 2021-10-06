package com.example.TermProjectTest.Construction;

import com.example.TermProjectTest.GenericTable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Construction extends GenericTable {
    private String name, image;
    private Integer purchasePrice;
    private String category, source;
    @Id
    private String uniqueEntryId;

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public String getSource() {
        return source;
    }

    public String getUniqueEntryId() {
        return uniqueEntryId;
    }

    public String getCategory() {
        return category;
    }
}

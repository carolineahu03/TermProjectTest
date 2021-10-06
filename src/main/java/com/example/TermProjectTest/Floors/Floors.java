package com.example.TermProjectTest.Floors;

import com.example.TermProjectTest.GenericTable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Floors extends GenericTable {
    private String name, image, VX, DIY, purchasePrice;
    private Integer SalePrice;
    private String color_1, color_2, source, sourceNotes, seasonEvent, catalog, version;
    @Id
    private String uniqueEntryId;

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getCatalog() {
        return catalog;
    }

    public String getSeasonEvent() {
        return seasonEvent;
    }

    public String getSourceNotes() {
        return sourceNotes;
    }

    public String getSource() {
        return source;
    }

    public String getColor_2() {
        return color_2;
    }

    public String getColor_1() {
        return color_1;
    }

    public Integer getSalePrice() {
        return SalePrice;
    }

    public String getpurchasePrice() {
        return purchasePrice;
    }

    public String getDIY() {
        return DIY;
    }

    public String getVX() {
        return VX;
    }

    public String getImage() {
        return image;
    }

    public String getUniqueEntryId() {
        return uniqueEntryId;
    }
}

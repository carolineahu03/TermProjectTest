package com.example.TermProjectTest.Headwear;

import com.example.TermProjectTest.GenericTable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Headwear extends GenericTable {
    private String name, closetImage, storageImage, variation, DIY, purchasePrice;
    private Integer salePrice;
    private String color_1, color_2, size, source, sourceNotes, seasonalAvailability, seasonEvent, style_1, style_2, labelThemes, type, villagerEquippable, catalog, version;
    @Id
    private String uniqueEntryId;

    public String getName() {
        return name;
    }

    public  String getImage() {
        return closetImage;
    }
    public String getClosetImage() {
        return closetImage;
    }

    public String getStorageImage() {
        return storageImage;
    }

    public String getVariation() {
        return variation;
    }

    public String getDIY() {
        return DIY;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public String getColor_1() {
        return color_1;
    }

    public String getColor_2() {
        return color_2;
    }

    public String getSize() {
        return size;
    }

    public String getSource() {
        return source;
    }

    public String getSourceNotes() {
        return sourceNotes;
    }

    public String getSeasonalAvailability() {
        return seasonalAvailability;
    }

    public String getSeasonEvent() {
        return seasonEvent;
    }

    public String getStyle_1() {
        return style_1;
    }

    public String getStyle_2() {
        return style_2;
    }

    public String getLabelThemes() {
        return labelThemes;
    }

    public String getType() {
        return type;
    }

    public String getVillagerEquippable() {
        return villagerEquippable;
    }

    public String getCatalog() {
        return catalog;
    }

    public String getVersion() {
        return version;
    }

    public String getUniqueEntryId() {
        return uniqueEntryId;
    }
}

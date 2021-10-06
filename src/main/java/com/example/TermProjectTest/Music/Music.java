package com.example.TermProjectTest.Music;

import com.example.TermProjectTest.GenericTable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Music extends GenericTable {
    private String name, framedImage, albumImage, purchasePrice, salePrice, color_1, color_2, size, source, sourceNotes, catalog, version;
    @Id
    private String uniqueEntryId;

    public String getName() {
        return name;
    }

    public String getFramedImage() {
        return framedImage;
    }

    public String getImage() {
        return albumImage;
    }

    public String getAlbumImage() {
        return albumImage;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public String getVersion() {
        return version;
    }

    public String getUniqueEntryId() {
        return uniqueEntryId;
    }

    public String getSalePrice() {
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

    public String getCatalog() {
        return catalog;
    }
}

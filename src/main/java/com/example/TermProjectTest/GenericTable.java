package com.example.TermProjectTest;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class GenericTable implements Serializable {
    public String name;
    @Id
    private String uniqueEntryId;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUniqueEntryId() {
        return uniqueEntryId;
    }
    public void setUniqueEntryId(String uniqueEntryId) {
        this.uniqueEntryId = uniqueEntryId;
    }
    public abstract String getImage();
}

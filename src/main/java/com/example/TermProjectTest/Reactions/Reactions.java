package com.example.TermProjectTest.Reactions;

import com.example.TermProjectTest.GenericTable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reactions extends GenericTable {
    private String name, image, source, sourceNotes, seasonEvent, version;
    @Id
    private String uniqueEntryId;

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getSource() {
        return source;
    }

    public String getSourceNotes() {
        return sourceNotes;
    }

    public String getSeasonEvent() {
        return seasonEvent;
    }

    public String getVersion() {
        return version;
    }

    public String getUniqueEntryId() {
        return uniqueEntryId;
    }
}
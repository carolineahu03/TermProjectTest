package com.example.TermProjectTest.Villagers;

import com.example.TermProjectTest.GenericTable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Villagers extends GenericTable {
    private String name, iconImage, photoImage, house_image, species, gender, personality, hobby, birthday, catchphrase, favoriteSong, style_1, style_2, color_1, color_2, wallpaper, flooring, furnitureNameList, version;
    @Id
    private String uniqueEntryId;

    public String getName() {
        return name;
    }

    public String getImage() {
        return photoImage;
    }

    public String getIconImage() {
        return iconImage;
    }

    public String getPhotoImage() {
        return photoImage;
    }

    public String getHouse_image() {
        return house_image;
    }

    public String getSpecies() {
        return species;
    }

    public String getGender() {
        return gender;
    }

    public String getPersonality() {
        return personality;
    }

    public String getHobby() {
        return hobby;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCatchphrase() {
        return catchphrase;
    }

    public String getFavoriteSong() {
        return favoriteSong;
    }

    public String getStyle_1() {
        return style_1;
    }

    public String getStyle_2() {
        return style_2;
    }

    public String getColor_1() {
        return color_1;
    }

    public String getColor_2() {
        return color_2;
    }

    public String getWallpaper() {
        return wallpaper;
    }

    public String getFlooring() {
        return flooring;
    }

    public String getFurnitureNameList() {
        return furnitureNameList;
    }

    public String getUniqueEntryId() {
        return uniqueEntryId;
    }
}
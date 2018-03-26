package com.example.jonib.notegreendao.db;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "NOTE".
 */
@Entity
public class Note {

    @Id(autoincrement = true)
    private Long id;

    @NotNull
    private String Title;
    private String Description;
    private byte[] Image;
    private String Date;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public Note() {
    }

    public Note(Long id) {
        this.id = id;
    }

    @Generated
    public Note(Long id, String Title, String Description, byte[] Image, String Date) {
        this.id = id;
        this.Title = Title;
        this.Description = Description;
        this.Image = Image;
        this.Date = Date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public String getTitle() {
        return Title;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTitle(@NotNull String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setImage(byte[] Image) {
        this.Image = Image;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}

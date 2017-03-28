package com.codevik.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;

/**
 * Created by Ankit Bansal on 10/25/2016.
 */
@Entity
@Table(name = "note")
public class Note implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String note;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt=new Timestamp(Calendar.getInstance().getTime().getTime());

    public Note( ) {
    }
    public Note(long id) {
        this.id = id;
    }


  public Note(String note) {
        this.note = note;
    }

    public Note(long id, String note) {
        this.id = id;
        this.note = note;
    }

    public Note(long id, String note, Timestamp createdAt) {
        this.id = id;
        this.note = note;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

}

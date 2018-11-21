package com.ahmadsisfo.droid_windi.model;

/**
 * Created by Lincoln on 18/05/16.
 */
public class Homemenu {
    private String name;
    private int numOfSongs;
    private int thumbnail;
    private String file;

    public Homemenu() {
    }

    public Homemenu(String name, int numOfSongs, int thumbnail, String file) {
        this.name = name;
        this.numOfSongs = numOfSongs;
        this.thumbnail = thumbnail;
        this.file = file;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}

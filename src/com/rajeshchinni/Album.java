package com.rajeshchinni;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String bandName;
    private String artist;
    private ArrayList<Song> songs;


    public Album(String name, String artist) {
        this.bandName = bandName;
        this.artist = artist;
        this.songs = new ArrayList<Song>(); // manually done
    }

    public boolean addSong (String title, double duration){
        if (findSong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for ( Song checkedSong: this.songs){
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber -1;
        if ((index >= 0) && (index <= this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("There does not exists track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList){
        Song checkedSong = findSong(title);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("There is no song as " + title + " in that album");
        return false;
    }

}

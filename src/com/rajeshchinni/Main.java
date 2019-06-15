package com.rajeshchinni;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private  static ArrayList<Album> albums1 = new ArrayList<Album>();

    public static void main(String[] args) {

        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()


        Album album = new Album("Stormbringer", "Deep purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love dont mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums1.add(album);


        Album pitthu = new Album("For those about to rock", "AC/DC");
        pitthu.addSong("For those about to rock", 5.44);
        pitthu.addSong("I put the finger on you", 3.25);
        pitthu.addSong("Let's go", 3.45);
        pitthu.addSong("Inject the venom", 3.33);
        pitthu.addSong("Snowballed", 4.51);
        pitthu.addSong("Evil walks", 3.45);
        pitthu.addSong("C.O.D", 5.25);
        pitthu.addSong("Breaking the rules", 5.32);
        pitthu.addSong("Night of the long knives", 5.12);
        albums1.add(pitthu);


        LinkedList<Song> rajs_meditation_songs_playlist = new LinkedList<Song>();
        albums1.get(0).addToPlaylist("You can't do it right", rajs_meditation_songs_playlist);
        albums1.get(0).addToPlaylist("Holy man", rajs_meditation_songs_playlist);
        albums1.get(0).addToPlaylist("Speed king", rajs_meditation_songs_playlist); // does not exist
        albums1.get(0).addToPlaylist(9 , rajs_meditation_songs_playlist);

        albums1.get(1).addToPlaylist(8, rajs_meditation_songs_playlist);
        albums1.get(1).addToPlaylist(3, rajs_meditation_songs_playlist);
        albums1.get(1).addToPlaylist(2, rajs_meditation_songs_playlist);
        albums1.get(1).addToPlaylist(24, rajs_meditation_songs_playlist); // there is no track 24

        play(rajs_meditation_songs_playlist);

    }


    private static void play(LinkedList<Song> playlist){
        ListIterator<Song> lIterator = playlist.listIterator();
        if (playlist.size() == 0){
            System.out.println("No songs in the playlist");
            return;
        }
        else {
            System.out.println("Now playing " + lIterator.next().toString());  // toString() is a method in Song class
        }
    }










}

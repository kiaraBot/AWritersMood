package com.example.awritersmood.ui.newboard;

import android.content.res.XmlResourceParser;
import android.media.Image;

import java.util.ArrayList;

public class NewBoardSingleton {
    
    private static NewBoardSingleton INSTANCE = null;
    public static NewBoardSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new NewBoardSingleton();
        }
        return (INSTANCE);
    }
    //TODO: Not sure how to set up the layout, a ResourceParser? This is crazy new to me and I don't know what type to use.

    private ArrayList<Board> boards;
    
    //Layout
    
    //Theme
    
    //Text
    private ArrayList<String> boardTextStrings;
    
    //App Image Gallery
    private ArrayList<Image> appGalleryImages;
    
    //Camera Images
    private ArrayList<Image> deviceGalleryImages;
    
    //Unsplash Images
    private ArrayList<Image> unsplashImages;
    
    //TODO: I am not sure if ResourceParser is what we are looking for
    //Save Board
    private ArrayList<XmlResourceParser>savedUserBoards;
    
    
    private NewBoardSingleton(){

        boards = new ArrayList<>();

        boardTextStrings = new ArrayList<>();
        appGalleryImages = new ArrayList<>();
        deviceGalleryImages = new ArrayList<>();
        unsplashImages = new ArrayList<>();
        savedUserBoards = new ArrayList<>();
    }

    public int addBoard(Board newBoard) {
        int curIndex = boards.size();
        boards.add(newBoard);
        return curIndex;
    } // int addBoard()

    public Board getBoard(int index)
    {
        Board board = null;
        if (boards.size() > index) {
            board = boards.get(index);
        }
        return board;
    } // Board getBoard()
    //----- //----- Getters -----// -----//
    public ArrayList<String>getBoardTextStrings(){return this.boardTextStrings;}
    
    public ArrayList<Image>getAppGalleryImages(){return this.appGalleryImages;}
    
    public ArrayList<Image>getDeviceGalleryImages(){return  this.deviceGalleryImages;}
    
    public ArrayList<Image>getUnsplashImages(){return this.unsplashImages;}
    
    public ArrayList<XmlResourceParser>getSavedUserBoards(){return this.savedUserBoards;}
    
    
    //----- //----- Setters -----// -----//
    public void addToBoardTextStrings(String value){
        boardTextStrings.add(value);
    }
    
    public void addToAppGalleryImages(Image image){
        appGalleryImages.add(image);
    }
    
    public void addToDeviceGalleryImages(Image image){
        deviceGalleryImages.add(image);
    }
    
    public void addToUnsplashImages(Image image){
        unsplashImages.add(image);
    }
    
    public void addToSavedUserBoards(XmlResourceParser xmlResourceParser){
        savedUserBoards.add(xmlResourceParser);
    }
    
}

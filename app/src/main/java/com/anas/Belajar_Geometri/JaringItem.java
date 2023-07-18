package com.anas.Belajar_Geometri;

/**
 * Created by anas on 5/6/2023.
 */

public class JaringItem {
    public String NamaJaring;
    public int ThumbJaring;
    public int WhiteThumbJaring;
    public int RumusJaring;

    public JaringItem(String namaJaring, int thumbJaring, int whiteThumbJaring, int rumusJaring){
        this.NamaJaring = namaJaring;
        this.ThumbJaring = thumbJaring;
        this.WhiteThumbJaring = whiteThumbJaring;
        this.RumusJaring = rumusJaring;
    }

    public String getNamaJaring() {
        return NamaJaring;
    }

    public int getThumbJaring() {
        return ThumbJaring;
    }

    public int getWhiteThumbJaring() {
        return WhiteThumbJaring;
    }
    public int getRumusJaring() {
        return RumusJaring;
    }
}

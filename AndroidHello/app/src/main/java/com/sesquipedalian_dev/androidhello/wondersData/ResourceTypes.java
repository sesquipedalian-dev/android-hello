package com.sesquipedalian_dev.androidhello.wondersData;

/**
 * Created by Scott on 4/21/2017.
 */

public enum ResourceTypes {
    LUMBER(false),
    STONE(false),
    CLAY(false),
    PAPYRUS(true)
    ;

    public static final String FILE_SUFFIX = ".png";

    boolean isAdvanced;

    ResourceTypes(boolean isAdvanced) {
        this.isAdvanced = isAdvanced;
    }

    public String getImageName(boolean small) {
        String sizePart = "_big";
        if(small) {
            sizePart = "_small";
        }
        return this.toString().toLowerCase() + sizePart + FILE_SUFFIX;
    }
}

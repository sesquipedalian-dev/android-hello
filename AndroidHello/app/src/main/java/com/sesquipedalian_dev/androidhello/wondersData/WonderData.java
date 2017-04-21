package com.sesquipedalian_dev.androidhello.wondersData;

import java.util.List;

/**
 * Created by Scott on 4/21/2017.
 */

public class WonderData {
    public String name;
    public String userName;
    public List<WonderStage> stages;

    public WonderData(String name, String userName, List<WonderStage> stages) {
        this.name = name;
        this.userName = userName;
        this.stages = stages;
    }

    public String getBackgroundImageName(int totalStages) {
        return "background_" + name + ".jpg";
    }
}

package com.sesquipedalian_dev.androidhello.wondersData;

import java.util.List;

/**
 * Created by Scott on 4/21/2017.
 */

public class WonderStage {
    public List<ResourceTypes> resources;
    public int stageIndex;
    // TODO results

    public WonderStage(List<ResourceTypes> resources, int stageIndex) {
        this.resources = resources;
        this.stageIndex = stageIndex;
    }

    public String getImageName(int totalStages) {
        return "wonder_stage_" + stageIndex + "_of_" + totalStages + ".png";
    }
}

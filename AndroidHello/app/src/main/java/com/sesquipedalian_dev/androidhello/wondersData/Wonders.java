package com.sesquipedalian_dev.androidhello.wondersData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Scott on 4/21/2017.
 */

public class Wonders {
    public static WonderData GIZA_A() {
        List<WonderStage> stages = new ArrayList<>();
        List<ResourceTypes> resources = null;

        resources = new ArrayList<>();
        resources.add(ResourceTypes.STONE);
        resources.add(ResourceTypes.STONE);
        stages.add(new WonderStage(resources, 1));

        resources = new ArrayList<>();
        resources.add(ResourceTypes.LUMBER);
        resources.add(ResourceTypes.LUMBER);
        resources.add(ResourceTypes.LUMBER);
        stages.add(new WonderStage(resources, 2));

        resources = new ArrayList<>();
        resources.add(ResourceTypes.STONE);
        resources.add(ResourceTypes.STONE);
        resources.add(ResourceTypes.STONE);
        resources.add(ResourceTypes.STONE);
        stages.add(new WonderStage(resources, 3));

        return new WonderData("giza", "The Great Pyramid At Giza", stages);
    }
}

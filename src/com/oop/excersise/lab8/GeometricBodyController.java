package com.oop.excersise.lab8;

import java.util.ArrayList;

public class GeometricBodyController {
    protected static GeometricBody getBiggestVolume(ArrayList<GeometricBody> geometricBodies) {
        GeometricBody result = null;
        for (GeometricBody geometricBody : geometricBodies) {
            if (result == null) {
                result = geometricBody;
            }
            else if (geometricBody.getVolume() > result.getVolume()) {
                result = geometricBody;
            }
        }
        return result;
    }

    protected static GeometricBody getBiggestSurface(ArrayList<GeometricBody> geometricBodies) {
        GeometricBody result = null;
        for (GeometricBody geometricBody : geometricBodies) {
            if (result == null) {
                result = geometricBody;
            }
            else if (geometricBody.getSurface() > result.getSurface()) {
                result = geometricBody;
            }
        }
        return result;
    }
}

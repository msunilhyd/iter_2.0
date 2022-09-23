package com.dailycodebuffer.crudWithHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewClass {

    public static void main(String[] args) {

        int arrival[] = {100, 140, 150, 200, 215, 400};

        int departure[] = {110, 300, 220, 230, 315, 600};

        int noOfPlatforms = 1;
        int noOfTrains = 6;

        Map<Integer, Integer> platformMap = new HashMap<Integer, Integer>();

        platformMap.put(1, 110);

        for (int i=1;i<6;i++) {
            int currentArrivalTime = arrival[i];
            for (Map.Entry<Integer, Integer> e: platformMap.entrySet()) {
                if (e.getValue() < currentArrivalTime) {
                    e.setValue(departure[i]);
                } else {
                    platformMap.put(platformMap.size() +1, departure[i]);
                }
            }
        }

    }
}
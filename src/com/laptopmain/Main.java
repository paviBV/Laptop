package com.laptopmain;

import com.laptopmain.manager.LapManager;

public class Main {

    public static void main(String[] args) {
        LapManager lapManager = new LapManager();
        lapManager.getLapList();
        lapManager.SingleLapMain(102);
        lapManager.updatelaptopMain();
        lapManager.deletelaptopMain();



    }
}

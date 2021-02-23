package com.laptopmain.dao;

import com.laptopmain.datastore.LapDataStore;
import com.laptopmain.entities.LapMain;

import java.util.List;

public class LapDao {
    LapDataStore lapDataStore = new LapDataStore();

    public void getLapList(){
        lapDataStore.setLapList();
    }

    public List<LapMain> laptopMainList(){
        return lapDataStore.laptopMainList();
    }
}

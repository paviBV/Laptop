package com.laptopmain.datastore;

import com.laptopmain.entities.LapMain;

import java.util.ArrayList;
import java.util.List;

public class LapDataStore {

        List<LapMain> laptopMainList = new ArrayList<>();
        public void setLapList(int id, String name, int cost) {
            LapMain laptopMain = new LapMain();
            laptopMain.setId(id);
            laptopMain.setName(name);
            laptopMain.setCost(cost);
            laptopMainList.add(laptopMain);
        }

        public void setLapList(){
                setLapList(101,"Thosibha",45000);
                setLapList(102, "Dell", 55000);
                setLapList(103, "Acer",35000);
                setLapList(104, "Asus",42000);
        }
        public List<LapMain> laptopMainList(){
                return laptopMainList;

        }
}

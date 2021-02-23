package com.laptopmain.manager;

import com.laptopmain.dao.LapDao;
import com.laptopmain.entities.LapMain;

import java.util.ArrayList;
import java.util.List;

public class LapManager {
    List<LapMain> list = new ArrayList<>();
    LapDao lapDao = new LapDao();

    public void getLapList(){

        list = lapDao.laptopMainList();
        lapDao.getLapList();
        for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
        }
        
    }
    public void SingleLapMain(int id){
        System.out.println(" Single");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println(list.get(i));
            }
        }

    }
    public void updatelaptopMain() {
        System.out.println(" Update");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == 103) {
                list.get(i).setName("Redme");
                list.get(i).setCost(30000);
                System.out.println(list.get(i));
            }
        }
    }
    public void deletelaptopMain(){
        System.out.println(" Delete");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == 103) {
                list.remove(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == 103) {
                System.out.println("found");
                break;
            }else {
                System.out.println("Deleted");
                break;
            }
        }
    }

    
}

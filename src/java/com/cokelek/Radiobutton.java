
package com.cokelek;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Radiobutton {
    
    String favoriteCar1 , favoriteCar2,favoriteCar3;
    private Map<String,Object> car2Value;

    
    @PostConstruct
    public void init(){
        
        car2Value = new LinkedHashMap<String,Object>();
        car2Value.put("BMW 335", "335");
        car2Value.put("BMW 316", "316");
        car2Value.put("BMW M3 SMG","M3 SMG");

    }
    
    public String getFavoriteCar1() {
        return favoriteCar1;
    }

    public void setFavoriteCar1(String favoriteCar1) {
        this.favoriteCar1 = favoriteCar1;
    }

    public String getFavoriteCar2() {
        return favoriteCar2;
    }

    public void setFavoriteCar2(String favoriteCar2) {
        this.favoriteCar2 = favoriteCar2;
    }

    public String getFavoriteCar3() {
        return favoriteCar3;
    }

    public void setFavoriteCar3(String favoriteCar3) {
        this.favoriteCar3 = favoriteCar3;
    }

    public Map<String, Object> getCar2Value() {
        return car2Value;
    }

    public void setCar2Value(Map<String, Object> car2Value) {
        this.car2Value = car2Value;
    }
    
    
    public static class Car
    {
        public String carLabel;
        public String carValue;

        public Car(String carLabel, String carValue) {
            this.carLabel = carLabel;
            this.carValue = carValue;
        }

        public String getCarLabel() {
            return carLabel;
        }

        public void setCarLabel(String carLabel) {
            this.carLabel = carLabel;
        }

        public String getCarValue() {
            return carValue;
        }

        public void setCarValue(String carValue) {
            this.carValue = carValue;
        }
    }//CAR CLASS
    
    public Car[] car3List;
    public Car[] getFavoriteCar3Value(){
        car3List = new Car[3];
        car3List[0] = new Car("BMW 335","335");
        car3List[1] = new Car("BMW 316","316");
        car3List[2] = new Car("BMW M3 SMG","M3 MSG");
        
        return this.car3List;
    }
    
    
    
    
}

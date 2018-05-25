
package com.cokelek;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Five {
    
    private String favoriteCar1;
    private String favoriteCar2;
    private String favoriteCar3;
    private  Map<String,Object> favoriteCars2Value;

    
       @PostConstruct
    public void init(){
        favoriteCars2Value = new LinkedHashMap<String,Object>();
        
        favoriteCars2Value.put("BMW Series 1-116", "116");
        favoriteCars2Value.put("BMW Series 1-118","118");
        favoriteCars2Value.put("BMW Series 1-120","120");
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
    
 
        
        
    

    public  Map<String, Object> getFavoriteCars2Value() {
        return favoriteCars2Value;
    }

   
    
    
    public static class Car{
    
        
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

    }//static Car
    
    
    public Car[] car3List;
    
    public Car[] getFavoriteCar3Value(){
        car3List = new Car[3];
        car3List[0] = new Car("BMW Series 3 - 316","316");
        car3List[1] = new Car("BMW Series 3 - 318","318");
        car3List[2] = new Car("BMW Series 3 - 320","320");
                
        return car3List;
    }
}

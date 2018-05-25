
package com.cokelek;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class More {
    
    private boolean rememberMe;
    public String[] favoriteCar1;
    public String[] favoriteCar2;
    public String[] favoriteCar3;
    public String[] favoriteCar4;

    private Map<String,Object> car3Value;
    
    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String[] getFavoriteCar1() {
        return favoriteCar1;
    }

    public void setFavoriteCar1(String[] favoriteCar1) {
        this.favoriteCar1 = favoriteCar1;
    }

    public String[] getFavoriteCar2() {
        return favoriteCar2;
    }

    public void setFavoriteCar2(String[] favoriteCar2) {
        this.favoriteCar2 = favoriteCar2;
    }

    public String[] getFavoriteCar3() {
        return favoriteCar3;
    }

    public void setFavoriteCar3(String[] favoriteCar3) {
        this.favoriteCar3 = favoriteCar3;
    }

    public String[] getFavoriteCar4() {
        return favoriteCar4;
    }

    public void setFavoriteCar4(String[] favoriteCar4) {
        this.favoriteCar4 = favoriteCar4;
    }
    
    
    public String getFavoriteCar1InString(){
        return Arrays.toString(this.favoriteCar1);
    }
    
    public String[] getFavoriteCar2Value(){
        this.favoriteCar2 = new String[5];
        this.favoriteCar2[0] = "116";
        this.favoriteCar2[1] = "118";
        this.favoriteCar2[2] = "X1";
        this.favoriteCar2[3] = "Series 1 Coupe";
        this.favoriteCar2[4] = "120";
        
        return this.favoriteCar2;
    }
    
    public String getFavoriteCar2InString(){
        return Arrays.toString(this.favoriteCar2);
    }
    @PostConstruct
    public void init(){
        
        this.car3Value = new LinkedHashMap<String,Object>();
        this.car3Value.put("Car3 - 316","BMW 316");
        this.car3Value.put("Car3 - 318","BMW 318");
        this.car3Value.put("Car3 - 320","BMW 320");
        this.car3Value.put("Car3 - 325","BMW 325");
        this.car3Value.put("Car3 - 330","BMW 330");
    }
    
    
    public String getFavoriteCar3InString(){
        return Arrays.toString(this.favoriteCar3);
    }

    public Map<String, Object> getCar3Value() {
        return car3Value;
    }

    public void setCar3Value(Map<String, Object> car3Value) {
        this.car3Value = car3Value;
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
       
    }//Car static CLASS
    
    
    public Car[] car4List;
    public Car[] getFavoriteCar4Value(){
        car4List = new Car[5];
        
        car4List[0] = new Car("Car 4 - MX","BMW M3 SMG");
        car4List[1] = new Car("Car 4 - X3","BMW X3");
        car4List[2] = new Car("Car 4 - X5","BMW X5");
        car4List[3] = new Car("Car 4 - X6","BMW X6");
        car4List[4] = new Car("Car 4 - 745","BMW 745");
        
        return this.car4List;
    }
    
    public String getFavoriteCar4InString(){
        return Arrays.toString(this.favoriteCar4);
    }
    
}

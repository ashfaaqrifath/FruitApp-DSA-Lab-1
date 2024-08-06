/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa23089754
 */
public class Fruit {
    
    private String fruitName;
    private String type;
    private String color;
    private String imagePath;

    public Fruit(String fruitName, String type, String color, String imagePath) {
        this.fruitName = fruitName;
        this.type = type;
        this.color = color;
        this.imagePath = imagePath;
    }

    public Fruit(String fruitName, String type, String color) {
        this.fruitName = fruitName;
        this.type = type;
        this.color = color;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getImagePath() {
        return imagePath;
    }
    
    
}

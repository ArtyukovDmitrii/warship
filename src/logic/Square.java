package logic;

import java.util.List;
import java.util.Random;

public class Square {
    private final List<List<Ship>> size;//поле
    int sizeX;//размеры поля
    int sizeY;//

    public Square(List<List<Ship>> size) {
        this.size = size;
    }

    public void randomLocation(){
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            size.get(random.nextInt(sizeX)).set(random.nextInt(sizeY),new Unit());
        }
        for (int i = 0; i < 3; i++) {
            size.get(random.nextInt(sizeX)).set(random.nextInt(sizeY),new Binary());
        }
        for (int i = 0; i < 2; i++) {
            size.get(random.nextInt(sizeX)).set(random.nextInt(sizeY),new Ternary());
        }
        size.get(random.nextInt(sizeX)).set(random.nextInt(sizeY),new Quaternary());
    }
}

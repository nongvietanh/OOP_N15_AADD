package uet.oop.bomberman.item;

import javafx.scene.image.Image;
import uet.oop.bomberman.BombermanGame;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.graphics.Sprite;
import uet.oop.bomberman.handlelevel.Handle;

public abstract class ItemUp extends Entity {

    public ItemUp(int x, int y, Image img) {
        super(x,y,img);
    }

    public abstract void remove();

    @Override
    public void update() {

    }
}

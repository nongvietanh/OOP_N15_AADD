package uet.oop.bomberman.entities.mob;

import javafx.scene.image.Image;
import uet.oop.bomberman.BombermanGame;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.mob.enemy.Balloom;
import uet.oop.bomberman.entities.mob.enemy.Oneal;
import uet.oop.bomberman.entities.notmoving.Brick;
import uet.oop.bomberman.entities.notmoving.Wall;

import java.awt.*;

public abstract class Mob extends Entity {

    protected boolean isAlive = true;
    private boolean isLife = true;

    public Mob(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);
    }

    @Override
    public void update() {

    }

    protected int _animate = 0;
    protected final int MAX_ANIMATE = 7500; //save the animation status and dont let this get too big

    protected void animate() {
        if(_animate < MAX_ANIMATE) _animate++; else _animate = 0; //reset animation
    }

    public abstract void kill();

    public abstract void afterKill();

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isAlive() {
        return isAlive;
    }
}

package freezemonsters.sprite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.ImageIcon;

import spriteframework.sprite.BadSprite;
import spriteframework.sprite.BadnessBoxSprite;
import freezemonsters.sprite.*;

public class Monster extends BadnessBoxSprite {
    private Goop goop;
    public int numMonster;

    public Monster(int x, int y, int numMonster) {
        initMonster(x, y, numMonster);
    }

    private void initMonster(int x, int y, int numMonster) {

        this.x = x;
        this.y = y;
        this.numMonster = numMonster;

        goop = new Goop(x, y);

        String monsterImg = "images/monster"+ numMonster
                + ".png";
        ImageIcon ii = new ImageIcon(monsterImg);
        Utils utils = new Utils();
        ii = utils.scaleImageIcon(ii, Commons.MONSTER_WIDTH, Commons.MONSTER_HEIGHT);
        setImage(ii.getImage());

        initDirection();

    }

    private void initDirection() {
        Random random = new Random();
        int direction = random.nextInt(4);
        switch (direction) {
            case 0:
                dy = 1;
                dx = 1;
                break;
            case 1:
                dy = -1;
                dx = 1;
                break;
            case 2:
                dx = 1;
                dy =-1;
                break;
            case 3:
                dx = -1;
                dy= -1;
                break;
        }
    }


    public Goop getGoop() {
        return goop;
    }

    @Override
    public LinkedList<BadSprite> getBadnesses() {
        LinkedList<BadSprite> aGoop = new LinkedList<BadSprite>();
        aGoop.add(goop);
        return aGoop;
    }
}

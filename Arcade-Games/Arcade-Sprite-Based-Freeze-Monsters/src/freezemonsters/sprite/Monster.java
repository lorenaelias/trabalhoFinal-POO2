package freezemonsters.sprite;

import java.util.LinkedList;
import javax.swing.ImageIcon;

import spriteframework.sprite.BadSprite;
import spriteframework.sprite.BadnessBoxSprite;

public class Monster extends BadnessBoxSprite {
    private Goop goop;

    public Monster(int x, int y) {

        initMonster(x, y);
    }

    private void initMonster(int x, int y) {

        this.x = x;
        this.y = y;

        goop = new Goop(x, y);

        String alienImg = "images/monster1.png";
        ImageIcon ii = new ImageIcon(alienImg);

        setImage(ii.getImage());
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

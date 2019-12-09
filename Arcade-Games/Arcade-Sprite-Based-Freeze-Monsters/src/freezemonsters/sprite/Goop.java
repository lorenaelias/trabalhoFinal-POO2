package freezemonsters.sprite;
import javax.swing.ImageIcon;

import spriteframework.sprite.BadSprite;

public class Goop extends BadSprite{
    private boolean frozen;

    public Goop(int x, int y){
        initGoop(x, y);
    }

    private void initGoop(int x, int y) {

        setFrozen(true);

        this.x = x;
        this.y = y;

        String bombImg = "images/gosma.png";
        ImageIcon ii = new ImageIcon(bombImg);
        setImage(ii.getImage());
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public boolean isFrozen() {
        return frozen;
    }
}

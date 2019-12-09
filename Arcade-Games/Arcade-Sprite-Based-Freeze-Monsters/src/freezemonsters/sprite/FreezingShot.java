package freezemonsters.sprite;

import spriteframework.sprite.BadSprite;

import javax.swing.*;

public class FreezingShot extends BadSprite {
    public FreezingShot(){
    }

    public FreezingShot(int x, int y){
        initShot(x, y);
    }

    private void initShot(int x, int y) {

        String shotImg = "images/ray.png";
        ImageIcon ii = new ImageIcon(shotImg);
        setImage(ii.getImage());

        int H_SPACE = 6;
        setX(x + H_SPACE);

        int V_SPACE = 1;
        setY(y - V_SPACE);
    }
}

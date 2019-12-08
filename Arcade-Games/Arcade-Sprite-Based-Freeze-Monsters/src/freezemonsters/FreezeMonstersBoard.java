package freezemonsters;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Random;
import javax.swing.ImageIcon;

import javafx.scene.paint.Color;
import spriteframework.AbstractBoard;
import spriteframework.sprite.BadSprite;
import spriteframework.sprite.Player;

import freezemonsters.sprite.*;

public class FreezeMonstersBoard extends AbstractBoard{
    private FreezingShot shot;

    private int direction = -1;
    private int freezes = 0;

    private String explImg = "images/explosion.png";

    public FreezeMonstersBoard () {

    }

    protected void setBoardColor(Graphics g){
        g.setColor(new java.awt.Color(240));
        g.fillRect(0, 0, d.width, d.height);
    }

    protected void createBadSprites(){
        int m = 1;
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                Monster monster = new Monster(Commons.MONSTER_INIT_X,
                        Commons.MONSTER_INIT_Y);
                badSprites.add(monster);
                m++;
            }
        }
    }

    protected void createOtherSprites(){
       shot = new FreezingShot();
    }

    private void drawShot(Graphics g) {
        if (shot.isVisible()) {
            g.drawImage(shot.getImage(), shot.getX(), shot.getY(), this);
        }
    }

    protected void drawOtherSprites(Graphics g) {
        drawShot(g);
    }

//    TODO:
    @Override
    protected void update() {

    }

    protected void processOtherSprites(Player player, KeyEvent e) {
        int x = player.getX();
        int y = player.getY();

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {

            if (inGame) {

                if (!shot.isVisible()) {

                    shot = new FreezingShot(x, y);
                }
            }
        }
    }
}

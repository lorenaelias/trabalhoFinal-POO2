package freezemonsters.sprite;

import freezemonsters.Commons;
import spriteframework.Utils;
import spriteframework.sprite.Player;
import spriteframework.sprite.BadSprite;

import javax.swing.*;

public class PlayerWoody extends spriteframework.sprite.Player {
    public PlayerWoody() {
        initPlayer(Commons.WOODY_INIT_X, Commons.WOODY_INIT_Y);
    }

    private void initPlayer(int x, int y) {
        super.x = x;
        super.y = y;
        String playerImg = "images/woody.png";
        ImageIcon ii = new ImageIcon(playerImg);
        Utils utils = new Utils();
        ii = utils.scaleImageIcon(ii, Commons.WOODY_WIDTH, Commons.WOODY_HEIGHT);
        setImage(ii.getImage());
    }

    protected void startLeftMovement() {
        dx = -3;
    }

    protected void startRightMovement() {
        dx = 3;
    }

    protected void startUpMovement() {
        dy = -3;
    }

    protected void startDownMovement() {
        dy = 3;
    }

    protected void stopHorizontalMovement() {
        dx = 0;
    }

    protected void stopVerticalMovement() {
        dy = 0;
    }

    public FreezingShot shoot() {
        // TODO Auto-generated method stub
        return null;
    }

    protected void warpOnEdges() {
    }

    protected void doMovement() {
        x += dx;
        y += dy;
    }


    public boolean collided(BadSprite bad) {
        int playerPositionWidth = this.getX() + Commons.WOODY_WIDTH ;
        int playerPositionHeight = this.getY() + Commons.WOODY_HEIGHT;

        int monsterPositionWidth = bad.getX() + bad.getImageWidth();
        int monsterPositionHeight = bad.getY() + bad.getImageHeight();
//		  if (bombX >= (playerX)
//                  && bombX <= (playerX + CommonsSpaceInvader.PLAYER_WIDTH)
//                  && bombY >= (playerY)
//                  && bombY <= (playerY + CommonsSpaceInvader.PLAYER_HEIGHT)) {
//

        if(bad.isVisible()) {
            if(bad.getX() >= this.getX()
                    && monsterPositionWidth <= playerPositionWidth
                    && bad.getY() >= this.getY()
                    && bad.getY() <= playerPositionHeight
            ) {
                return true;
            }
        }
        return false;
    }
}

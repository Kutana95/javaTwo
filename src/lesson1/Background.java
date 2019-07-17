package lesson1;

import java.awt.*;

public class Background extends GameCanvas{

    private int drawTime = 50; //пропуски отрисовок
    private int countDrawSkip = 0;

    Background(MainCircles gameWindow){
        super(gameWindow);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        countDrawSkip ++;
        if (countDrawSkip == drawTime){countDrawSkip = 0; updateBackground(this);}

    }

    void updateBackground(GameCanvas canvas) {

        Color color = new Color(
                (int)(Math.random() * 255),
                (int)(Math.random() * 255),
                (int)(Math.random() * 255)
        );
        canvas.setBackground(color);
    }



}

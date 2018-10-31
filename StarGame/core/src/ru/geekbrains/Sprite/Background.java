package ru.geekbrains.Sprite;

import ru.geekbrains.base.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


import ru.geekbrains.math.Rect;


public class Background extends Sprite {

    public Background(TextureRegion region) {
        super(region);
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(worldBounds.getHeight());
        pos.set(worldBounds.pos);
    }
}
//
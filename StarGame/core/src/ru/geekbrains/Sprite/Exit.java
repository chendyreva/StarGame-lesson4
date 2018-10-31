package ru.geekbrains.Sprite;

import ru.geekbrains.base.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.geekbrains.math.Rect;

public class Exit extends Sprite {

    public Exit(TextureAtlas atlas) {
        super(atlas.findRegion("exit"));
    }

    @Override
    public void resize(Rect worldBounds) {
        pos.set(worldBounds.pos);
    }
}
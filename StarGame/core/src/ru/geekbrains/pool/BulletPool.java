package ru.geekbrains.pool;

import ru.geekbrains.Sprite.Bullet;
import ru.geekbrains.base.SpritesPool;

public class BulletPool extends SpritesPool<Bullet> {
    @Override
    protected Bullet newObject() {
        return new Bullet();
    }
}
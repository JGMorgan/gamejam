package com.cultstoppers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Leon on 1/31/2016.
 */
public class Altar extends Entity {

    public Altar(){
        batch=new SpriteBatch();
        sprite=new Texture("altar.png");
        health=100;
    }
    public void render(){
        batch.begin();
        batch.draw(sprite, x+200, y+200, sprite.getWidth(), sprite.getHeight());
        batch.end();
    }

}
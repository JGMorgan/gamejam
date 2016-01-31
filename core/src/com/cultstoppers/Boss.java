package com.cultstoppers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

import java.util.Random;

/**
 * Created by jose on 1/30/16.
 */
public class Boss extends Enemy {
    Random bossType=new Random();
    int BossType;

    public Boss(){
        health = 10;
        sprite = new Texture("Characters/CatspriteSheetV_01.png");
        hitbox = new Rectangle(x,y,sprite.getWidth()/2,sprite.getHeight());
    }
    public void render(){
        batch.begin();
        batch.draw(sprite, x, y, sprite.getWidth()/2, sprite.getHeight());
        batch.end();
    }

    /*
    public void move(){
        hitbox.setPosition(x,y);
        BossType=bossType.nextInt(4);
        switch(BossType){
            case 1: bullets.add(new Shotgun(x,y,dir));
                break;
            case 2:bullets.add(new Sword(x,y,dir));
                break;
            case 3:bullets.add(new MachineGun(x,y,dir));
                break;
            case 4:bullets.add(new Pistol(x,y,dir));
                break;
        }
    }
    */
}

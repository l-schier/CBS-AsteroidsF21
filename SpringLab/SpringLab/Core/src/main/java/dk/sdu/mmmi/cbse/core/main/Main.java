/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.mmmi.cbse.core.main;


import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
/**
 *
 * @author lasse
 */
public class Main {
    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg =
		new LwjglApplicationConfiguration();
	cfg.title = "Asteroids";
	cfg.width = 500;
	cfg.height = 400;
	cfg.useGL30 = false;
	cfg.resizable = false;
		
        new LwjglApplication(new Game(), cfg);
    }
}

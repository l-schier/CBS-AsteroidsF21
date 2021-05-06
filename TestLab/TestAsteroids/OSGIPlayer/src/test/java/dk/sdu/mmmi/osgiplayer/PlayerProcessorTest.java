/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.mmmi.osgiplayer;


import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.GameKeys;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.data.entityparts.LifePart;
import dk.sdu.mmmi.cbse.common.data.entityparts.MovingPart;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;
import dk.sdu.mmmi.osgicommonplayer.Player;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lasse
 */
public class PlayerProcessorTest {
    
    public PlayerProcessorTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }


    /**
     * Test of process method, of class PlayerProcessor.
     */
    @org.junit.jupiter.api.Test
    public void testStartPos() {
        System.out.println("movement");
        GameData gameData = new GameData();
        World world = new World(); 
        PlayerPlugin playerPlugin = new PlayerPlugin();
        gameData.setDisplayWidth(100);
        gameData.setDisplayHeight(100);
        playerPlugin.start(gameData, world);
        
        float trueStartX = gameData.getDisplayWidth() / 2;
        float trueStartY = gameData.getDisplayHeight() / 2;
        
        float startX = 9999;
        float startY = 9999;
        
        for (Entity player : world.getEntities(Player.class)) {
            PositionPart posPart = player.getPart(PositionPart.class);
            startX = posPart.getX();
            startY = posPart.getY();
        }
        assertEquals(startX, trueStartX);
        assertEquals(startY, trueStartY);
    }

    
}

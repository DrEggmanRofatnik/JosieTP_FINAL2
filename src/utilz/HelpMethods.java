package utilz;

import static utilz.Constants.*;
import static utilz.Constants.ObjectConstants.*;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import entities.Crabby;
import objects.Cannon;
import objects.GameContainer;
import objects.Potion;
import objects.Projectile;
import objects.Spike;

public class HelpMethods {

    public static boolean IsTileSolid(int xTile, int yTile, int[][] lvlData) {
        // TODO: create an int named value and assign lvlData[yTile][xTile] to it.
        // TODO: check if value is greater than or equal to 48 or value < 0 or value != 11
        // TODO: (cont). when the condition is true return true, else false
        return false; // TODO: remove when done.
    }

    private static boolean IsSolid(float x, float y, int[][] lvlData) {
        // TODO: create an int called maxWidth and set to lvlData[0].length * Game.TILES_SIZE
        // TODO check if x is less than 0 or x is greater than or equal to maxWidth.
        // TODO: (cont.) if the condition is true return true
        // TODO: check if y is less than 0 or y is greater than or equal to Game.GAME_HEIGHT
        // TODO: (cont.) if the condition is true return true

        // TODO: make a float called xIndex and set to x / Game.TILES_SIZE
        // TODO: repeat for y

        // TODO: create an int named xTile and set to (int) xIndex.  This casts the float to an int chopping off the decimal.
        // TODO: repeat for y

        // TODO: return IsTileSolid passing in xTile, yTile, and lvlData
        return false; // TODO: remove when done.

    }

    public static boolean CanMoveHere(float x, float y, float width, float height, int[][] lvlData) {
        // TODO: This checks if the four corners of something is able to move.
        // TODO: we will need 4 booleans first.  Initialize them all to false.
        // TODO: make one called bottomLeftGood
        // TODO: another called topRightGood
        // TODO: another called bottomRightGood
        // TODO: and finally one called topLeftGood
        // TODO: assign to topLeftGood !IsSolid(x, y, lvlData)
        // TODO: assign to topRightGood !IsSolid(x + width, y, lvlData)
        // TODO: assign to bottomRightGood !IsSolid(x + width, y + height, lvlData)
        // TODO: assign to bottomLeftGood !IsSolid(x, y + height, lvlData)

        // TODO: return bottomLeftGood && topRightGood && bottomRightGood && topLeftGood;
        return false; // TODO: remove when done.

    }


    public static boolean IsProjectileHittingLevel(Projectile p, int[][] lvlData) {
        // TODO: create a float named hitboxCenterX and set to (p.getHitbox().x + p.getHitbox().width) / 2
        // TODO: repeat for hitboxCenterY in the same fashion but use y and height instead
        // TODO: return IsSolid(
        //         hitboxCenterX,
        //         hitboxCenterY,
        //         lvlData);
        return false; // TODO: remove when done.

    }


    public static float GetEntityXPosNextToWall(Rectangle2D.Float hitbox, float xSpeed) {
        // TODO: create an int named currentTile and set to (int) (hitbox.x / Game.TILES_SIZE)
        // TODO: check if xSpeed is positive.  (This is the Right)
        // TODO: (cont.) if the condition is true do the following
        // TODO: (cont.) create an int named tileXPos and set to currentTile * Game.TILES_SIZE
        // TODO: (cont.) create an int named xOffset and set to (int)(Game.TILES_SIZE - hitbox.width
        // TODO: (cont.) return tileXPos + xOffset - 1
        // TODO: else return currentTile * GAME.TILES_SIZE  (This is the Left)
        return 0; // TODO: remove when done.

    }

    public static float GetEntityYPosUnderRoofOrAboveFloor(Rectangle2D.Float hitbox, float airSpeed) {
        // TODO: create an int named currentTile and set to (int) (hitbox.y / Game.TILES_SIZE)
        // TODO: check if airSpeed is positive.  (This is the Falling - touching floor)
        // TODO: (cont.) if the condition is true do the following
        // TODO: (cont.) create an int named tileYPos and set to currentTile * Game.TILES_SIZE
        // TODO: (cont.) create an int named yOffset and set to (int)(Game.TILES_SIZE - hitbox.height
        // TODO: (cont.) return tileXPos + yOffset - 1
        // TODO: else return currentTile * GAME.TILES_SIZE  (This is Jumping)
        return 0; // TODO: remove when done.

    }

    public static boolean IsEntityOnFloor(Rectangle2D.Float hitbox, int[][] lvlData) {
        // TODO: if !IsSolid(hitbox.x, hitbox.y + hitbox.height +1, lvlData then
        // TODO: if !IsSolid(hitbox.x + hitbox.width, hitbox.y + hitbox.height + 1, lvlData then
        // TODO: return false
        return true;
    }

    public static boolean IsFloor(Rectangle2D.Float hitbox, float xSpeed, int[][] lvlData) {
        // TODO: if xSpeed is greater than 0 then
        // TODO: return IsSolid(hitbox.x + hitbox.width + xSpeed, hitbox.y + hitbox.height + 1, lvlData);
        // TODO: else
        // TODO: return IsSolid(hitbox.x + xSpeed, hitbox.y + hitbox.height + 1, lvlData);
        return false; // TODO: remove when done.

    }

    public static boolean CanCannonSeePlayer(int[][] lvlData, Rectangle2D.Float firstHitbox, Rectangle2D.Float secondHitbox, int yTile) {
        // TODO: create an int named firstXTile and set to (int) (firstHitbox.x / Game.TILES_SIZE)
        // TODO: repeat for secondXTile in appropriate fashion using the secondHitbox

        // TODO: if firstXTile is greater than secondXTile then
        // TODO: return IsAllTilesClear(secondXTile, firstXTile, yTile, lvlData)
        // TODO: else
        // TODO: return IsAllTilesClear(firstXTile, secondXTile, yTile, lvlData)
        return false; // TODO: remove when done.

    }

    public static boolean IsAllTilesClear(int xStart, int xEnd, int y, int[][] lvlData) {
        // TODO: for int i starting at 0 and ending before xEnd - xStart, adding 1 to i each iteration
        // TODO: check if IsTileSolid with xStart +i, y, and lvlData then
        // TODO: return false
        return true;
    }

    public static boolean IsAllTilesWalkable(int xStart, int xEnd, int y, int[][] lvlData) {
        if (IsAllTilesClear(xStart, xEnd, y, lvlData)) {
            // TODO: for int i starting at 0 ending before xEnd - xStart, incrementing by 1 each time then
            // TODO: return false
        }
        return true;
    }

    public static boolean IsSightClear(int[][] lvlData, Rectangle2D.Float firstHitbox, Rectangle2D.Float secondHitbox, int yTile) {
        // TODO: create an int named firstXTile and set to (int) (firstHitbox.x / Game.TILES_SIZE)
        // TODO: repeat for secondXTile in appropriate fashion using the secondHitbox

        // TODO: if firstXTile is greater than secondXTile then
        // TODO: return IsAllTilesWalkable(secondXTile, firstXTile, yTile, lvlData)
        // TODO: else
        // TODO: return IsAllTilesWalkable(firstXTile, secondXTile, yTile, lvlData)
        return false; // TODO: remove when done.

    }

    public static int[][] GetLevelData(BufferedImage img) {
        int[][] lvlData = new int[img.getHeight()][img.getWidth()];
        for (int j = 0; j < img.getHeight(); j++)
            for (int i = 0; i < img.getWidth(); i++) {
                Color color = new Color(img.getRGB(i, j));
                int value = color.getRed();
                if (value >= 48)
                    value = 0;
                lvlData[j][i] = value;
            }
        return lvlData;
    }

    public static ArrayList<Crabby> GetCrabs(BufferedImage img) {
        // TODO: create an ArrayList of Crabby named list and instantiate to a new ArrayList<>()
        // TODO: for int j starting at 0 ending before img.getHeight() adding 1 each time then
        // TODO: for int i starting at 0 ending before img.getWidth() adding 1 each time then
        // TODO: create a Color named color and get from new Color(img.getRGB(i, j));
        // TODO: create an int named value and get from color.getGreen();
        // TODO: if (value == CRABBY) then
        // TODO: call list.add passing in a new Crabby(i * Game.TILES_SIZE, j * Game.TILES_SIZE));
        // TODO: end of both for loops
        // TODO: return list;
        return null;
    }

    public static Point GetPlayerSpawn(BufferedImage img) {
        for (int j = 0; j < img.getHeight(); j++)
            for (int i = 0; i < img.getWidth(); i++) {
                Color color = new Color(img.getRGB(i, j));
                int value = color.getGreen();
                if (value == 100)
                    return new Point(i * Game.TILES_SIZE, j * Game.TILES_SIZE);
            }
        return new Point(1 * Game.TILES_SIZE, 1 * Game.TILES_SIZE);
    }

    public static ArrayList<Potion> GetPotions(BufferedImage img) {
        ArrayList<Potion> list = new ArrayList<>();
        for (int j = 0; j < img.getHeight(); j++)
            for (int i = 0; i < img.getWidth(); i++) {
                Color color = new Color(img.getRGB(i, j));
                int value = color.getBlue();
                if (value == RED_POTION || value == BLUE_POTION)
                    list.add(new Potion(i * Game.TILES_SIZE, j * Game.TILES_SIZE, value));
            }

        return list;
    }

    public static ArrayList<GameContainer> GetContainers(BufferedImage img) {
        ArrayList<GameContainer> list = new ArrayList<>();
        for (int j = 0; j < img.getHeight(); j++)
            for (int i = 0; i < img.getWidth(); i++) {
                Color color = new Color(img.getRGB(i, j));
                int value = color.getBlue();
                if (value == BOX || value == BARREL)
                    list.add(new GameContainer(i * Game.TILES_SIZE, j * Game.TILES_SIZE, value));
            }

        return list;
    }

    public static ArrayList<Spike> GetSpikes(BufferedImage img) {
        // TODO: create an ArrayList of Spike named list and instantiate to a new ArrayList<>()
        // TODO: for int j starting at 0 ending before img.getHeight() adding 1 each time then
        // TODO: for int i starting at 0 ending before img.getWidth() adding 1 each time then
        // TODO: create a Color named color and get from new Color(img.getRGB(i, j));
        // TODO: create an int named value and get from color.getBlue();
        // TODO: if (value == SPIKE) then
        // TODO: call list.add passing in a new Spike(i * Game.TILES_SIZE, j * Game.TILES_SIZE, SPIKE));
        // TODO: end of both for loops
        // TODO: return list;
        return null;
    }

    public static ArrayList<Cannon> GetCannons(BufferedImage img) {
        // TODO: create an ArrayList of Cannon named list and instantiate to a new ArrayList<>()
        // TODO: for int j starting at 0 ending before img.getHeight() adding 1 each time then
        // TODO: for int i starting at 0 ending before img.getWidth() adding 1 each time then
        // TODO: create a Color named color and get from new Color(img.getRGB(i, j));
        // TODO: create an int named value and get from color.getBlue();
        // TODO: if (value == CANNON_LEFT || value == CANNON_RIGHT) then
        // TODO: call list.add passing in a new Cannon(i * Game.TILES_SIZE, j * Game.TILES_SIZE, value));
        // TODO: end of both for loops
        // TODO: return list;
        return null;
    }

}
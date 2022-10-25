
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square grass;
    private Square sky;
    private Square wall;
    private Square wall2;
    private Square garage;
    private Square window;
    private Square window2;
    private Square window3;
    private Square window4;
    private Square door;
    private Square door2;
    private Square door3;
    private Circle doorknob;
    private Triangle roof;
    private Triangle roof2;
    private Circle sun;
    private Circle smile;
    private Circle smile2;
    private Circle eye;
    private Circle eye2;
    private Square trunk;
    private Triangle tree;
    private Triangle tree2;
    private Triangle tree3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        grass = new Square();
        grass.changeSize(600);
        grass.moveVertical(280);
        grass.moveHorizontal(-60);
        grass.changeColor("green");
        grass.makeVisible();
        
        sky = new Square();
        sky.changeSize(600);
        sky.moveVertical(-320);
        sky.moveHorizontal(-60);
        sky.changeColor("blue");
        sky.makeVisible();
        
        wall = new Square();
        wall.moveVertical(80);
        wall.moveHorizontal(20);
        wall.changeSize(200);
        wall.changeColor("white");
        wall.makeVisible();
        
        wall2 = new Square();
        wall2.moveVertical(150);
        wall2.moveHorizontal(220);
        wall2.changeSize(130);
        wall2.changeColor("white");
        wall2.makeVisible();
        
        garage = new Square();
        garage.moveVertical(185);
        garage.moveHorizontal(235);
        garage.changeSize(95);
        garage.changeColor("black");
        garage.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(50);
        window.moveVertical(100);
        window.changeSize(50);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(140);
        window2.moveVertical(100);
        window2.changeSize(50);
        window2.makeVisible();
        
        window3 = new Square();
        window3.changeColor("black");
        window3.moveHorizontal(140);
        window3.moveVertical(200);
        window3.changeSize(50);
        window3.makeVisible();
        
        window4 = new Square();
        window4.changeColor("black");
        window4.moveHorizontal(50);
        window4.moveVertical(200);
        window4.changeSize(50);
        window4.makeVisible();
        
        door = new Square();
        door.changeColor("black");
        door.changeSize(30);
        door.moveHorizontal(105);
        door.moveVertical(200);
        door.makeVisible();
        
        door2 = new Square();
        door2.changeColor("black");
        door2.changeSize(30);
        door2.moveHorizontal(105);
        door2.moveVertical(230);
        door2.makeVisible();
        
        door3 = new Square();
        door3.changeColor("black");
        door3.changeSize(30);
        door3.moveHorizontal(105);
        door3.moveVertical(250);
        door3.makeVisible();
        
        doorknob = new Circle();
        doorknob.changeColor("yellow");
        doorknob.changeSize(5);
        doorknob.moveHorizontal(165);
        doorknob.moveVertical(230);
        doorknob.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 280);
        roof.moveHorizontal(130);
        roof.moveVertical(70);
        roof.changeColor("white");
        roof.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeSize(40, 250);
        roof2.moveHorizontal(130);
        roof2.moveVertical(80);
        roof2.changeColor("black");
        roof2.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(400);
        sun.moveVertical(-10);
        sun.changeSize(100);
        sun.makeVisible();
        
        smile = new Circle();
        smile.changeColor("red");
        smile.moveHorizontal(412);
        smile.moveVertical(8);
        smile.changeSize(75);
        smile.makeVisible();
        
        smile2 = new Circle();
        smile2.changeColor("yellow");
        smile2.moveHorizontal(413);
        smile2.moveVertical(7);
        smile2.changeSize(73);
        smile2.makeVisible();
        
        eye = new Circle();
        eye.changeColor("red");
        eye.moveHorizontal(426);
        eye.moveVertical(15);
        eye.changeSize(20);
        eye.makeVisible();
        
        eye2 = new Circle();
        eye2.changeColor("red");
        eye2.moveHorizontal(455);
        eye2.moveVertical(15);
        eye2.changeSize(20);
        eye2.makeVisible();
        
        trunk = new Square();
        trunk.changeColor("black");
        trunk.moveHorizontal(420);
        trunk.moveVertical(260);
        trunk.changeSize(20);
        trunk.makeVisible();
        
        tree = new Triangle();
        tree.changeSize(40, 50);
        tree.moveHorizontal(440);
        tree.moveVertical(255);
        tree.changeColor("green");
        tree.makeVisible();
        
        tree2 = new Triangle();
        tree2.changeSize(40, 50);
        tree2.moveHorizontal(440);
        tree2.moveVertical(235);
        tree2.changeColor("green");
        tree2.makeVisible();
        
        tree3 = new Triangle();
        tree3.changeSize(40, 50);
        tree3.moveHorizontal(440);
        tree3.moveVertical(215);
        tree3.changeColor("green");
        tree3.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}

// Lab06Bst.java
// This is the student, starting version of Lab06B which is divided into 8 cells.
// The first cell -- "Draw Random Points" -- is provided as an example.
// Students need to complete the other 7 cells on their own.


import java.awt.*;
import java.applet.*;


public class Lab06Bst extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        Expo.drawLine(g,250,0,250,650);
        Expo.drawLine(g,500,0,500,650);
        Expo.drawLine(g,750,0,750,650);
        Expo.drawLine(g,0,325,1000,325);

        // Draw 10,000 Random Points
        for (int count = 1; count <= 10000; count++)
        {
            Expo.setRandomColor(g);
            int x = Expo.random(5,245);
            int y = Expo.random(5,320);
            Expo.drawPoint(g,x,y);
        }


        // Draw 1000 Random Lines
        for (int count = 1; count <= 1000; count++){
            Expo.setRandomColor(g);
            int x1 = Expo.random(255,495);
            int y1 = Expo.random(5,320);
            int x2 = Expo.random(255,495);
            int y2 = Expo.random(5,320);
            Expo.drawLine(g,x1,y1,x2,y2);
        }



        // Draw 1000 Random Rectangles
        for (int count = 1; count <= 1000; count++){
            Expo.setRandomColor(g);
            int x1 = Expo.random(505,745);
            int y1 = Expo.random(5,320);
            int x2 = Expo.random(505,745);
            int y2 = Expo.random(5,320);
            Expo.fillRectangle(g,x1,y1,x2,y2);
        }




        // Draw 500 Random Triangles
        for (int count = 1; count <= 500; count++){
            Expo.setRandomColor(g);
            int x1 = Expo.random(755,995);
            int y1 = Expo.random(5,320);
            int x2 = Expo.random(755,995);
            int y2 = Expo.random(5,320);
            int x3 = Expo.random(755,995);
            int y3 = Expo.random(5,320);
            Expo.fillPolygon(g,x1,y1,x2,y2,x3,y3);
        }





        // Draw 100 Random Initials
        for (int count = 1; count <= 100; count++){
            Expo.setRandomColor(g);
            int x = Expo.random(5,220);
            int y = Expo.random(350,645);
            int fontSize = Expo.random(12,36);
            
            Expo.setFont(g,"Algerian",Font.PLAIN,fontSize);
            Expo.drawString(g,"DI",x,y);
        }


        // Draw 500 Random Stars with a constant radius of 30 and a random # of points
        for (int count = 1; count <= 500; count++){
            Expo.setRandomColor(g);
            int x = Expo.random(285,465); 
            int y = Expo.random(360,615);
            int rad = 30;
            int point = Expo.random(5,10);
            Expo.fillStar(g,x,y,rad,point);
        }




        // Draw 1000 Random Circles with random radii
        for (int count = 1; count <= 1000; count++){
            Expo.setRandomColor(g);
            int x = Expo.random(580,670);
            int y = Expo.random(405,570);
            int rad = Expo.random(0,75);
            Expo.fillCircle(g,x,y,rad);
        }
            





        // Draw 250 Random Arcs with 2 random radii, random start and random finish
        for (int count = 1; count <= 1000; count++){
            Expo.setRandomColor(g);
            int x = Expo.random(830,920);
            int y = Expo.random(405,570);
            int hrad = Expo.random(0,75);
            int vrad = Expo.random(0,75);
            int degree1 = Expo.random(0,360);
            int degree2 = Expo.random(0,360);
            Expo.fillArc(g,x,y,hrad,vrad,degree1,degree2);
        }




        }

    }

//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW10 - Applet - Snowman)
//Class:                   CO SCI 290
//Date:                    04/26/2018
//Description:        Snowman
import javax.swing.JApplet;
import java.awt.Graphics;
public class Snowman extends JApplet {

   public static final int FACE_DIAMETER = 100;
   public static final int X_FACE = 100;
   public static final int Y_FACE = 75;
   public static final int EYE_WIDTH = 5;
   public static final int EYE_HEIGHT = 10;
   public static final int X_RIGHT_EYE = 127;
   public static final int Y_RIGHT_EYE = 97;
   public static final int X_LEFT_EYE = 165;
   public static final int Y_LEFT_EYE = Y_RIGHT_EYE;
   public static final int MOUTH_WIDTH = 50;
   public static final int MOUTH_HEIGHT = 25;
   public static final int X_MOUTH = 125;
   public static final int Y_MOUTH = 137;
   public static final int MOUTH_START_ANGLE = 180;
   public static final int MOUTH_EXTENT_ANGLE = 180;
   
   // middle body variables
   public static final int BODY_DIAMETER = 150;
   public static final int X_BODY = 75;
   public static final int Y_BODY = 175;
   // button variables
   public static final int BUTTONS_DIAMETER = 10;
   public static final int X_BUTTONS = 145;
   public static final int Y_BUTTONS1 = 195;
   public static final int Y_BUTTONS2 = 215;
   public static final int Y_BUTTONS3 = 235;
   // lower body variables
   public static final int LBODY_DIAMETER = 200;
   public static final int X_BODYL = 50;
   public static final int Y_BODYL = 325;
   // arm variables
   public static final int X_LARM = 10;
   public static final int Y_LARM = 140;
   public static final int X_RARM = 210;
   public static final int Y_RARM = 140;
   public static final int ARM_WIDTH = 80;
   public static final int ARM_HEIGHT = 100;
   public static final int LARM_START_ANGLE = 180;
   public static final int LARM_EXTENT_ANGLE = 160;
   public static final int RARM_START_ANGLE = 200;
   public static final int RARM_EXTENT_ANGLE = 160;
   // hat variables
   public static final int HAT_WIDTH = 150;
   public static final int HAT_HEIGHT = 25;
   public static final int X_HAT = 75;
   public static final int Y_HAT = 50;
   
   public static final int THAT_WIDTH = 50;
   public static final int THAT_HEIGHT = 75;
   public static final int X_THAT = 125;
   public static final int Y_THAT = 14;
   public static final int HAT_START_ANGLE = 0;
   public static final int HAT_EXTENT_ANGLE = 180;
   
   
   public void paint (Graphics canvas){
      // Draw face outline:
      canvas.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
      // Draw eyes:
      canvas.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_WIDTH);
      canvas.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_WIDTH);  
      // Draw mouth:
      canvas.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT, MOUTH_START_ANGLE, MOUTH_EXTENT_ANGLE); 
      // Draw middle body:
      canvas.drawOval(X_BODY, Y_BODY, BODY_DIAMETER, BODY_DIAMETER);
      // Buttons:
      canvas.drawOval(X_BUTTONS, Y_BUTTONS1, BUTTONS_DIAMETER, BUTTONS_DIAMETER);
      canvas.drawOval(X_BUTTONS, Y_BUTTONS2, BUTTONS_DIAMETER, BUTTONS_DIAMETER);
      canvas.drawOval(X_BUTTONS, Y_BUTTONS3, BUTTONS_DIAMETER, BUTTONS_DIAMETER);
      // Draw lower body:
      canvas.drawOval(X_BODYL, Y_BODYL, LBODY_DIAMETER, LBODY_DIAMETER);
      // Draw arms:
      canvas.drawArc(X_LARM, Y_LARM, ARM_WIDTH, ARM_HEIGHT, LARM_START_ANGLE, LARM_EXTENT_ANGLE); 
      canvas.drawArc(X_RARM, Y_RARM, ARM_WIDTH, ARM_HEIGHT, RARM_START_ANGLE, RARM_EXTENT_ANGLE); 
      // Draw hat:
      canvas.drawOval(X_HAT, Y_HAT, HAT_WIDTH, HAT_HEIGHT); 
      canvas.drawArc(X_THAT, Y_THAT, THAT_WIDTH, THAT_HEIGHT, HAT_START_ANGLE, HAT_EXTENT_ANGLE); 
   }
}
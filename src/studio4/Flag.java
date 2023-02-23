package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color background = new Color(255, 255, 204);
		StdDraw.setPenColor(background);
		StdDraw.filledRectangle(.5, .5, .5, .25);
		
		Color lineOne = new Color(204,204,255);
		StdDraw.setPenColor(lineOne);
		StdDraw.filledRectangle(.15, .5, .15, .01);
		StdDraw.filledRectangle(.85, .5, .15, .01);
		
		Color outline = new Color(0, 0, 0);
		StdDraw.setPenColor(outline);
		StdDraw.rectangle(.5, .5, .5, .25);
		
		Color heart = new Color(255, 153, 205);
		StdDraw.setPenColor(heart);
		StdDraw.filledCircle(.4, .55, .112);
		StdDraw.filledCircle(.6, .55, .112);
		double [] x = {.3, .5, .7};
		double [] y = {.5, .30, .5};
		StdDraw.filledPolygon(x, y);
	}
}
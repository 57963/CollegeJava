package thingy;

import processing.core.PApplet;

public class Thingy extends PApplet{
	
	float points[][] = new float[100][2];
	float avgx, avgy;
	int chosen[] = new int[10];

	public void settings(){
		size(displayWidth/2, displayHeight);
	}
	
	public void setup() {
	  for (int i = 0; i<points.length; i++) {
	    points[i][0] = random(width);
	    points[i][1] = random(height);
	  }
	  stroke(50, 50, 200);
	  noFill();
	  noCursor();
	}

	public void draw() {
	  background(0, 0, 50);
	  for (int i = 0; i<points.length; i++) {
	    for(int u = 0; u<chosen.length;u++){
	      if(chosen[u] == i){
	        stroke(200, 50, 50);
	        line(points[i][0]-15, points[i][1], points[i][0]+15, points[i][1]);
	        line(points[i][0], points[i][1]-15, points[i][0], points[i][1]+15);
	        arc(points[i][0], points[i][1], 15, 15, PI/2, (float) (PI*1.5));
	        arc(points[i][0], points[i][1], 20, 20, PI/2, (float) (PI*1.5));
	      }
	    }
	    arc(points[i][0], points[i][1], 10, 10, PI/2, (float) (PI*1.5));
	    text((int)points[i][0],points[i][0]+1, points[i][1]-1);
	    text((int)points[i][1],points[i][0]+1, points[i][1]+11);
	    if (i<points.length-1) {
	      line(points[i][0], points[i][1], points[i+1][0], points[i+1][1]);
	    } else {
	      line(points[i][0], points[i][1], points[0][0], points[0][1]);
	    }
	    stroke(50, 50, 200);
	  }
	  stroke(50, 50, 200);
	  line(0, avgy, width, avgy);
	  text(avgx,avgx+2,avgy+11);
	  line(avgx, 0, avgx, height);
	  text(avgy,avgx+2,avgy-1);
	  arc(avgx, avgy, 20, 20, PI/2, (float) (PI*1.5));
	  avgx = 0;
	  avgy = 0;
	  for (int i = 0; i<points.length; i++) {
	    if(points[i][0]<width/2 && points[i][1]<height/2){
	      points[i][0] += random(2);
	      points[i][1] += random(2)-2;
	    } else if(points[i][0]>width/2 && points[i][1]<height/2){
	      points[i][0] += random(2);
	      points[i][1] += random(2);
	    } else if(points[i][0]>width/2 && points[i][1]>height/2){
	      points[i][0] += random(2)-2;
	      points[i][1] += random(2);
	    } else {
	      points[i][0] += random(2)-2;
	      points[i][1] += random(2)-2;
	    }
	    points[i][0] = constrain(points[i][0], 0, width);
	    points[i][1] = constrain(points[i][1], 0, height);
	    avgx += points[i][0];
	    avgy += points[i][1];
	  }
	  avgx /= points.length;
	  avgy /= points.length;
	  for(int i = 0; i<chosen.length;i++){
	    if (random(1)<0.05) {
	      chosen[i] = (int) (random(points.length-1));
	    }
	  }
	}

	public static void main(String[] args) {
		PApplet.main(new String[] { thingy.Thingy.class.getName() });

	}

}

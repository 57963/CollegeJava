package processing;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PVector;


public class Processing extends PApplet {
	ArrayList <PVector> points = new ArrayList <PVector> ();
	PVector point;
	PVector vel;
	float rot;
	PVector off;
	int count, count2;
	PVector curr;
	int close;

	public void settings(){
		//size(displayWidth/2, displayHeight);
		fullScreen();
		sketchRenderer();
		smooth(8);
	}
	
	public void setup() {
		  strokeWeight((float) 0.5);
		  background(0);
		  stroke(0);
		  frameRate(99999);
		  point = new PVector(random(width), random(height));
		  rot = random(TWO_PI);
		  off = new PVector(random(10), random(10));
	}

	public void draw() {
		if (count<15) {
		    if (point.x<=0 || point.x>=width || point.y<=0||point.y >= height) {
		      count++;
		      point = new PVector(random(width), random(height));
		      rot = random(TWO_PI);
		      off = new PVector(random(10), random(10));
		    }
		    vel = PVector.fromAngle(noise(point.x/500+off.x, point.y/500+off.y)*10*TWO_PI+rot);
		    vel = PVector.mult(vel, 5);
		    point.add(vel);
		    point(point.x, point.y);
		    if (1>random(1)) {
		      points.add(new PVector(point.x, point.y));
		    }
		    for (PVector v : points) {
		      if (dist(point.x, point.y, v.x, v.y)<50) {
		        stroke(255-map(dist(point.x, point.y, v.x, v.y), 0, 50, 255/4, 0), 100);
		        line(point.x, point.y, v.x, v.y);
		      }
		    }
		  } else {
		    //noStroke();
		    if(count2 < points.size()){
		      curr = points.get(count2);
		      for(PVector v:points){
		        if(dist(v.x,v.y,curr.x,curr.y)<50){
		          close++;
		        }
		      }
		      for(PVector v:points){
		        if(dist(v.x,v.y,curr.x,curr.y)<50){
		          stroke(255-close*3,close,100,map(dist(v.x,v.y,curr.x,curr.y),0,50,255,0));
		          line(curr.x, curr.y, v.x, v.y);
		        }
		      }
		      stroke(random(50),255-random(50)*3,100,random(255));
		      strokeWeight(5);
		      if((float)random(1)<0.5){
		        point(curr.x+random(20)-10,curr.y+random(20)-10);
		      }
		      strokeWeight((float) 0.5);
		      //ellipse(curr.x,curr.y,close/5,close/5);
		      close = 0;
		      count2++;
		    } else {
		    	restart();
		    }
		  }
	}
	
	public void restart(){
		count = 0;
		count2 = 0;
		points.clear();
		background(0);
	}
	
	public static void main(String _args[]) {
		PApplet.main(new String[] { processing.Processing.class.getName() });
	}
}

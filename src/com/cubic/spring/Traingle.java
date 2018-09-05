package com.cubic.spring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanNameAware;

public class Traingle implements BeanNameAware{
	private String length;
	private Car c;
	public Car getC() {
		return c;
	}


	public void setC(Car c) {
		this.c = c;
	}


	private Point pointA;
	private Point pointB;
	private Point pointC;
	private String type;
	private List<Point> points;
	private List<String> strnames;
	private Map<String,String> mapValues;

	public Map<String, String> getMapValues() {
		return mapValues;
	}


	public void setMapValues(Map<String, String> mapValues) {
		this.mapValues = mapValues;
	}


	public List<String> getStrnames() {
		return strnames;
	}


	public void setStrnames(List<String> strnames) {
		this.strnames = strnames;
	}


	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}


	public String getType() {
		return type;
	}
	

	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public Traingle(String type) {
		super();
		this.type = type;
	}
	

	/*public void setType(String type) {
		this.type = type;
	}*/
	
	public void draw() {
		System.out.println("----------------------------");
		System.out.println(getType()+" Traingle Drawing");
		System.out.println("----------------------------");
		System.out.println("Point A=("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Point A=("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Point A=("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("----------------------------");
		System.out.println(getType()+" Traingle Drawing Using List Objects");
		System.out.println("----------------------------");
		for(Point p:points) {
		System.out.println("Points=("+p.getX()+","+p.getY()+")");
		}
		System.out.println("----------------------------");
		System.out.println(getType()+" Traingle Drawing Using List String");
		System.out.println("----------------------------");
		System.out.println(" " +getStrnames());
		System.out.println("----------------------------");
		System.out.println(getType()+" Traingle Drawing Using Map String");
		System.out.println("----------------------------");
		System.out.println(" " +getMapValues());
		System.out.println(getType()+" Traingle Drawing Using Autowriring");
		System.out.println("----------------------------");
		System.out.println(" " +getC().getCarName());
		System.out.println(" " +getC().getCarModel());
		System.out.println("Circle Length==Traingle Length"+getLength());
	}


	public String getLength() {
		return length;
	}


	public void setLength(String length) {
		this.length = length;
	}


	@Override
	public void setBeanName(String arg0) {
		System.out.println("Bean Name is:" +arg0);
	}
}

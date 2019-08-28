package com.example;

public class Line extends Model {
	private int startPoint;
	private int endPoint;
	
	public Line(int startPoint, int endPoint) {
		this.startPoint= startPoint;
		this.endPoint= endPoint;
	}
	
	public int getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	}
	public int getStartPoint() {
		return startPoint;
		
	}
	public void setStartPoint(int startPoint) {
		this.startPoint=startPoint;
	}
	
	public int CalculateLength() {
		return getEndPoint()-getStartPoint();
		
	}
	@Override
	public boolean isGreater(Object obj1, Object obj2) {
		Line l1= (Line)obj1;
		Line l2= (Line)obj2;
		
		return l1.CalculateLength()>l2.CalculateLength();
		
	}
	@Override
	public boolean isLess(Object obj1, Object obj2) {
		Line l1= (Line)obj1;
		Line l2= (Line)obj2;
		
		return l1.CalculateLength()<l2.CalculateLength();
		
	}
	@Override
	public boolean isEqual(Object obj1, Object obj2) {
		Line l1= (Line)obj1;
		Line l2= (Line)obj2;
		
		return l1.CalculateLength()==l2.CalculateLength();
		
	}
	public boolean isLarge(Object obj) {
		
		Line l1= (Line)obj;
		Line l2
	}

}

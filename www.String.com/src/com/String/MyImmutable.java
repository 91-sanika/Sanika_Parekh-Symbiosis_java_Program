package com.String;

public class MyImmutable {

	int x;
	MyImmutable(int x){
		this.x=x;
	}
	
	public MyImmutable change(int x) {
		if(this.x==x) {
			return this;
			
		}else {
				return new MyImmutable(x);
			}
		}
	
	public String toString() {
		return ""+x+"";
	}
	
	public static void main(String[] args) {
		MyImmutable obj = new MyImmutable(10);
	System.out.println("Before:"+obj );
	obj.change(20);
	System.out.println("After:"+ obj );
	
		}

	}


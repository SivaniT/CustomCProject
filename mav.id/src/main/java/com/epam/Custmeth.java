package com.epam;
import java.util.Arrays;
public class Custmeth<E> {
	     private Object data[];
	     private int size;
	    public Custmeth()
	    {
	    	this(10);
	    }
	    public Custmeth(int c) {
	    	if(c>0)
	    	{
	    		this.data=new Object[c];
	    	}
	    	else if(c==0)
	    	{
	    		this.data=new Object[10];
	    	}
	    	else
	    	{
	    		throw new IllegalArgumentException("Illegal capacity "+c);
	    	}
		}
		


	    @SuppressWarnings("unchecked")
		public E get(int index) {
	       if(index>=size)
	       {
	    	   throw new ArrayIndexOutOfBoundsException( index);
	       }
	    	   return (E) data[index];
	    
	    }
	    @SuppressWarnings("unused") void add( E e) {
	       
	        ensureCap();
	        data[size++]=e;
	       
	    }
	    @SuppressWarnings("unchecked")
		public E remove(int index)
	    {
	    	if(index>=size)
	    	{
	    		throw new ArrayIndexOutOfBoundsException( index);	
	    	}
	    	E ov=(E) data[index];
	    	int n=size-index-1;
	    	if(n>0)
	    	{
	    		System.arraycopy(data,index+1,data,index,n);
	    		data[--size]=null;
	    		
	    	}
	    	return ov;
	    }
 	
		private void ensureCap() {
			// TODO Auto-generated method stub
			int oc=data.length;
	    	int nc=(oc*3)/2 +1;
	    	data=Arrays.copyOf(data, nc);
		}
		@SuppressWarnings("unused") int size() {
			// TODO Auto-generated method stub
			return data.length;
		}
		
}

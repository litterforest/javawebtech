package com.cobee.javawebtech;

import java.util.Observable;
import java.util.Observer;

public class ObserverTester {

	public static void main(String[] args) {
		ObserverTester observerTester = new ObserverTester();
		SpecialRepoter repoter = observerTester.new SpecialRepoter();  
        GlobalTimes n1 = observerTester.new GlobalTimes(repoter);  
        PeopleDaily n2 = observerTester.new PeopleDaily(repoter);  
        XinhuaDaily n3 = observerTester.new XinhuaDaily(repoter);  
          
        repoter.getNewNews("new news!");  
        n2.remove();  
        repoter.getNewNews("another new news!"); 
		
	}

	class SpecialRepoter extends Observable {  
		
	    public void getNewNews(String msg){  
	        this.setChanged();  
	        this.notifyObservers(msg);  
	    }  
	    
	} 
	
	class NewspaperOffice {  
	}
	
	class PeopleDaily extends NewspaperOffice implements Observer {  
	    private Observable observable;  
	      
	    public PeopleDaily(SpecialRepoter repoter){  
	        this.observable = repoter;  
	        repoter.addObserver(this);  
	    }  
	  
	    public void update(Observable o, Object arg) {  
	        if(o instanceof SpecialRepoter){  
	            System.out.println("People's Daily brings you the latest news!");    
	        }  
	    }  
	      
	    public void remove(){  
	        observable.deleteObserver(this);  
	    }  
	}  
	
	class XinhuaDaily extends NewspaperOffice implements Observer{  
	    private Observable observable;  
	      
	    public XinhuaDaily(SpecialRepoter repoter){  
	        this.observable = repoter;  
	        repoter.addObserver(this);  
	    }  
	  
	    public void update(Observable o, Object arg) {  
	        if(o instanceof SpecialRepoter){  
	            System.out.println("Xinhua Daily brings you the latest news!");  
	        }  
	    }  
	}  
	
	class GlobalTimes extends NewspaperOffice implements Observer{  
	    private Observable observable;  
	      
	    public GlobalTimes(SpecialRepoter repoter){  
	        this.observable = repoter;  
	        repoter.addObserver(this);  
	    }  
	  
	    public void update(Observable o, Object arg) {  
	        if(o instanceof SpecialRepoter){  
	            System.out.println("Global Timse brings you the latest news!");   
	        }  
	    }  
	}  
	
}



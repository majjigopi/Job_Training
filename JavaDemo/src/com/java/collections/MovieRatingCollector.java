package com.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MovieRatingCollector {
    
	Map<String, Double> ratingsCollector = new HashMap<String, Double>();
	Map<String, Integer> ratingsCounter = new HashMap<String, Integer>();
	
        
        public void putNewRating(String movie, double rating) {
        	int rating_counter=0;
        	if(ratingsCollector.containsKey(movie)) {
        	double d=ratingsCollector.get(movie);
            double	average=d+rating;
        	ratingsCollector.put(movie, average);
        	Integer counter=ratingsCounter.get(movie);
        	counter++;
        	ratingsCounter.put(movie, counter);
        	
        	}
        	
        	else {
        		ratingsCollector.put(movie,rating);
        		ratingsCounter.put(movie, 1);
        	}
        }

              
        public double getAverageRating(String movie) {
            return ratingsCollector.get(movie)/ratingsCounter.get(movie);
        }

        
        public int getRatingCount(String movie) {
        	return ratingsCounter.get(movie);
        }
        
        public static void main(String args[]) {
        
        	
        	MovieRatingCollector mc=new MovieRatingCollector();
        	mc.putNewRating("I_am_legend", 22.22);
        	mc.putNewRating("I_am_legend", 44.44);
        	mc.putNewRating("I_am_legend", 66.66);
        	mc.putNewRating("A_Beutiful_Mind", 33.33);
        	mc.putNewRating("A_Beutiful_Mind", 55.55);
        System.out.println(mc.getAverageRating("I_am_legend"));
        System.out.println(mc.getAverageRating("A_Beutiful_Mind"));
        System.out.println(mc.getRatingCount("A_Beutiful_Mind"));
        System.out.println(mc.getRatingCount("I_am_legend"));

        	
        	/*ratingsCollector.put("I_am_legend",  22.22);
        	ratingsCollector.put("A_Beutiful_Mind", 22.22);*/
        	
            
        	
}
        
    }


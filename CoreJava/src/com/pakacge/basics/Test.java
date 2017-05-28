package com.pakacge.basics;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Test{
	
	    public static void main(String[] args) {
	        Randomizer random = new Randomizer();
	        Queue<Value> outputQueue = new Prime().primeCheck(random.randomGenerate());
	        System.out.println(outputQueue);
	    }

	    private static class Value implements Comparable<Value> {

	        int item;
	        boolean isPrime;

	        public Value(int item, boolean isPrime) {
	            this.item = item;
	            this.isPrime = isPrime;
	        }

	        @Override
	        public int compareTo(Value o) {
	            if (o == null) {
	                return 1;
	            }
	            return this.item - o.item;
	        }

	        @Override
	        public String toString() {
	            return "Value{" + "item=" + item + ", isPrime=" + isPrime + '}';
	        }
	    }

	    private static class Prime {

	        Queue<Value> primeQueue = new PriorityQueue<>();

	        public Queue<Value> primeCheck(Queue<Integer> q) {
	            boolean flag;
	            Iterator<Integer> itr = q.iterator();
	            while (itr.hasNext()) {
	                Value val;
	                int item = (int) itr.next();
	                int srt = (int) Math.sqrt((double) item);
	                if (item == 1) {
	                    flag = true;
	                } else {
	                    flag = true;
	                    for (int i = 2; i <= srt; i++) {

	                        if (item % i == 0) {
	                            flag = false;
	                        }
	                    }
	                }
	                val = new Value(item, flag);

	                primeQueue.add(val);

	            }
	            return primeQueue;
	        }
	    }

	    private static class Randomizer {

	        public Queue<Integer> randomGenerate() {
	            Queue<Integer> queue = new PriorityQueue<>();
	            int num;
	            Random rand = new Random();
	            for (int k = 0; k < 10; k++) {
	                num = rand.nextInt(Integer.MAX_VALUE);
	                queue.add(num);
	            }
	            return queue;
	        }
	    }
	}



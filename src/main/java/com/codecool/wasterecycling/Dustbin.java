package com.codecool.wasterecycling;
import java.util.Arrays;

public class Dustbin {

        private static String[] dustbinArr;
        private static int size;
        private static int capacity;
        private String color;

        public Dustbin(String color){
                dustbinArr = new String[10];
                size = 0;
                capacity = 10;
                this.color = color;
        }

        public String getColor() {
                return color;
        }

        public static void throwOutGarbage(Garbage[] garbage){
                if (size == capacity){
                        ensureCapacity(2);
                }
                for(int i = 0; i < garbage.length; i++){
                        dustbinArr[size + i + 1] = garbage[i].getName();
                }
                trimToSize();
        }



        public static void ensureCapacity(int minCapacity){
                String temp[] = new String[capacity * minCapacity];
                for (int i = 0; i < capacity; i++){
                        temp[i] = dustbinArr[i];
                }
                dustbinArr = temp;
                capacity = capacity * minCapacity;
        }

        public static void trimToSize(){
                System.out.println("Trimming the dustbin");
                String temp[] = new String[size];
                for (int i=0; i < size; i++){
                        temp[i] = dustbinArr[i];
                }
                dustbinArr = temp;
                capacity = dustbinArr.length;
        }



}

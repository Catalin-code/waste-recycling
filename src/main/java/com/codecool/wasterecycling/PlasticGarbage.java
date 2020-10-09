package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {

        private boolean cleaned;

        public PlasticGarbage(String name, boolean cleaned){
                super(name);
                this.cleaned = cleaned;
        }
}

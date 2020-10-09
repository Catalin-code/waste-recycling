package com.codecool.wasterecycling;

import javax.print.DocFlavor;

public class PaperGarbage extends Garbage {

        private boolean squeezed;

        public PaperGarbage(String name, boolean squeezed){
                super(name);
                this.squeezed = squeezed;
        }
}

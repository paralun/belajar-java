package com.paralun.innerclass;

public class OuterClass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class InnerClass {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOtherName() {
            return OuterClass.this.getName();
        }
    }
}

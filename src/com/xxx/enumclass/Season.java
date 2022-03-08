package com.xxx.enumclass;

public enum Season implements Info {
    SPEING{
        @Override
        public void info() {
            System.out.println("春天");
        }
    },
    SUMMER {
        @Override
        public void info() {
            System.out.println("夏天");
        }
    },
    AUTUMU {
        @Override
        public void info() {
            System.out.println("秋天");
        }
    },
    WINTER {
        @Override
        public void info() {
            System.out.println("冬天");
        }
    };


//    //私有构造
//    private Season() {
//
//    }
//
//    private Season(String name) {
//        this.name = name;
//    }

}

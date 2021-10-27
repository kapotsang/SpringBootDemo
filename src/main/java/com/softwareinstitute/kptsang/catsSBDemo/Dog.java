package com.softwareinstitute.kptsang.catsSBDemo;

public class Dog {

        private String name;
        private int age;
        private String friendliness;

        public Dog(String name, int age, String friendliness) {
            this.name = name;
            this.age = age;
            this.friendliness = friendliness;
        }

        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public int getAge(){
            return age;
        }
        public void setFriendliness(String friendliness){
            this.friendliness = friendliness;
        }
        public String getFriendliness(){
            return friendliness;
        }

        public String getJsonObjectOfDog(){
            return "{"+
                    "\"name\" : \" "+ name + "\"," +
                    "\"age\" : \" " +age + "\","+
                    "\"friendliness\" :\" "+friendliness +"\""+
                    "}";
        }

    }




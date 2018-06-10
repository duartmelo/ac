package org.academiadecodigo.bootcamp;


public class StringsEquals {

    String name1;
    String name2;

    public StringsEquals (String name1, String name2){
        this.name1 = name1;
        this.name2 = name2;
    }


    public String isEquals() {
        System.out.println("Variable " + this.name1 + " is equals to variable " + this.name2 + "?");
        boolean result = this.name1.equals(this.name2);
        String resultString = Boolean.toString(result);
        return resultString.toUpperCase() + "!";
    }


    public String diferentChar(){

        if (this.name1.equals(name2)){
            return this.name1 + " is equals a " + this.name2 + ".";
        }


        char [] character1 = this.name1.toCharArray();
        char [] character2 = this.name2.toCharArray();
        

        if( character1.length < character2.length){

            System.out.println("The letters that is out of bounds of " + name1 + " is:");

            for(int i = 0; i <= character1.length - 1; i++){

                if (character1[i] != character2[i]){
                    System.out.println(character1[i] + "is diferent of " + character2[i]);
                }

            }

            for (int k = character1.length; k < character2.length; k++){
                System.out.print(" ");
                System.out.print(character2[k]);

            }

            System.out.print(".");
            return this.name2 + " is bigger then " + this.name1 + ".";

        } else if (character1.length > character2.length){

            for (int i = 0; i <= character2.length - 1; i++){

                if (character1[i] != character2[i] && character2.length >= i){
                    System.out.println(character1[i] + "is diferent of " + character2[i]);
                }

            }

            System.out.println("The letters that is out of bounds of " + name2 + " is:");

            for (int k = character2.length; k < character1.length; k++){

                System.out.print(" ");
                System.out.print(character1[k]);

            }
            return  this.name1 + "is bigger then " + this.name2 + ".";

        }

        for (int i = 0; i < character1.length; i++){

            for (int j = 0; j < character2.length; i++){



                if (character1[i] != character2[j]){

                    System.out.println(character1[i] + " is different of " + character2[j] + ".");
                    i ++;
                }
            }
        }

        return this.name1 + " is diferent of " + this.name2 + ".";
    }



}

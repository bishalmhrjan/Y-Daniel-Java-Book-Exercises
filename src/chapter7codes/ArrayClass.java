package chapter7codes;

import java.util.Locale;
import java.util.Scanner;

public class ArrayClass {
    public static void main(String [] args){
    int [] decks = new int[52];


     String [] suits ={"Paan", "Cheeth","Ieet","Surat"};
     String [] ranks ={"Aka","2","3","4","5","6","7","8","9","10","J","Q","K"};

    //Initializing cards
     for(int i =0;i<52;i++){
     decks[i]=i;
     }
     int temp = 0;
     // Suffling the Cards
      for(int i =0;i<52;i++){
          int index = (int) (Math.random()*52);
          temp = decks[i];
          decks[i]= decks[index];
          decks[index]= temp;
      }


      for(int i =0;i<4;i++){

          String rank = suits[decks[i]/13];
          String suit= ranks[decks[i]%13];


          System.out.println("Card is "+decks[i]+" ,rank "+rank+", "+suit);
      }


    }
}

public class Card {

  private String card;
  private String seed;

  public Card(String newcard, String newseed) {
    this.card = newcard;
    this.seed = newseed;
  }
  public String getCard(){
        if(this.card.equals("A")){return "Ace";}
        else if (this.card.equals("J")){return "Jack";}
        else if (this.card.equals("Q")){return"Queen";}
        else if (this.card.equals("K")){return "King";}
        else if (this.card.equals("10")){return"Ten";}
        else if (this.card.equals("9")){return "Nine";}
        else if (this.card.equals("8")){return"Eight";}
        else if (this.card.equals("7")){return"Seven";}
        else if (this.card.equals("6")){return "Six";}
        else if (this.card.equals("5")){return"Five";}
        else if (this.card.equals("4")){return"Four";}
        else if (this.card.equals("3")){return"Three";}
        else if (this.card.equals("2")){return "Two";}
        else{return "ERROR";}
    }
    public String getSeed(){
        if(this.seed.equals("D")){return "Diamond";}
        else if (this.seed.equals("S")){return "Spades";}
        else if (this.seed.equals("H")){return"Hearts";}
        else if (this.seed.equals("C")){return "Clubs";}
        else {return "ERROR";}
    }
        
    
    
   public String getDescription() {
    return getCard()+"of"+getSeed(); }
}

    

class DeckApp {

    public static void main(String[] args){

        Deck deck = new Deck();
        deck.insertLeft(50);
        deck.insertLeft(60);
        deck.insertLeft(900);
        deck.insertRight(40);
        deck.insertRight(300);
        deck.insertRight(20);
        deck.display();

        System.out.println("sleva : " + deck.peekLeft());

        deck.removeLeft();
        System.out.println("sleva : " + deck.peekLeft());

        deck.removeLeft();
        deck.removeRight();
        deck.insertRight(77);
        deck.display();




    }

}

class Deck {

    private DoublyLinkedList theList;


    public Deck(){

        theList = new DoublyLinkedList();

    }

    public long peekLeft()
    { return theList.peekFirst().dData; }

    public long peekRight()
    { return theList.peekLast().dData; }

    public void insertLeft(long value)
    { theList.insertFirst(value);}


    public long removeLeft()
    { return theList.deleteFirst().dData;}

    public void insertRight(long value)
    { theList.insertLast(value); }

    public long removeRight()
    { return theList.deleteLast().dData; }

    public boolean isEmpty()
    { return theList.isEmpty(); }

    public void display()
    { theList.displayForward(); }

}

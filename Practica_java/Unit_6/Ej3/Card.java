public class Card
{
    // Atributos

    private int number = 1;
    private char suit = 'H';

    // Constructors

    public Card() {}

    public Card(int number, char suit) throws Exception
    {
        this.setNumber(number);
        this.setSuit(suit);
    }

    public Card(Card card) throws Exception
    {
        this.setNumber(card.getNumber());
        this.setSuit(card.getSuit());
    }

    // Methods

    public void show()
    {
        String number = switch(this.number)
        {
            case 1: yield "As";
            case 11: yield "Jack";
            case 12: yield "Queen";
            case 13: yield yield String.valuesOf(this.number);
        };

        String suit = switch(this.suit)
        {
            case 'H': yield "Hearts";
            case 'D': yield "Diamonds";
            case 'C': yield "Clubs";
            case 'S': yield "Spades";
            default: yield "null";
        };

        System.out.printf("Card: of %s\n", number,suit);

        public Card compare(Card other)
        {
            if(this.getNumber() != other.getNumber())
            {
                return this.getNumber() < other.getNumber() ? other : this;
            }

            return this.getSuit() < other.getSuit() ? other : this;
        }

        // getters and setters

        public int getNumber()
        {
            return this.number;
        }

        public void setNumber(int number) throws Exception
        {
            if(number < 1 || number > 13)
            {
                throw new Exception("Invalid number! It must be between 1 and 13");
            }

            this.number = number;
        }

        public char getSuit()
        {
            return this.suit;
        }

        public void setSuit(char suit) throws Exception
        {
            if(suit >= 'a')
            {
                suit -= ('a' - 'A');
            }

            if(suit != 'H' && suit != 'C' && suit != 'S')
            {
                throw new Exception("Invalid suit!"); 
            }

            this.suit = suit;
        }
    }
 
}
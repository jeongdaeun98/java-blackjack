package blackjack.domain;


public class Player {

    // 카드들 받는 생성자
    // 카드 받기 메서드
    private final Cards cards;
    protected final Deck deck;
    protected Score score;

    public Player(Deck deck) {
        cards = new Cards();
        this.deck = deck;
        init();
    }

    private void init() {
        addCard(deck.popCard());
        addCard(deck.popCard());
    }

    public void addCard(Card card) {
        cards.addCard(card);
    }

    public void calculateScore() {
        score = cards.getScore();
    }

    public Score getScore() {
        return score;
    }

    public Cards getCards() {
        return cards;
    }
}
package poker.round;

public sealed interface Action {
    record Fold() implements Action{}
    record Check() implements Action{}
    record Call() implements Action{}
    record AllIn() implements Action{}

    record Bet(int amount) implements Action{
        public Bet{
            if(amount <= 0){
                throw new IllegalArgumentException("La puntata deve essere maggiore di zero");
            }
        }
    }

    record Raise(int amount) implements Action{
        public Raise{
            if(amount <= 0){
                throw new IllegalArgumentException("La puntata deve essere maggiore di zero.");
            }
        }
    }
}

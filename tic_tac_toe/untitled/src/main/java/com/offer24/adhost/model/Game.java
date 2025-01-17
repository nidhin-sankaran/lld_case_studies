package com.offer24.adhost.model;

import java.util.List;

public class Game {
    List<Player> player;
    Board boad;
    List<Move> move;
    int nextPlayerIndex;
    Player winner;
    private Game(GameBuilder builder) {
        this.player = builder.player;
        this.boad = builder.boad;
        this.move = builder.move;
        this.nextPlayerIndex = builder.nextPlayerIndex;
        this.winner = builder.winner;
    }

    public static class GameBuilder {
        List<Player> player;
        Board boad;

        public List<Move> getMove() {
            return move;
        }
        public  static GameBuilder getBuilder() {
            return new GameBuilder();
        }

        public GameBuilder setMove(List<Move> move) {
            this.move = move;
            return this;

        }

        public Board getBoad() {
            return boad;
        }

        public GameBuilder setBoad(Board boad) {
            this.boad = boad;
            return this;
        }

        public List<Player> getPlayer() {
            return player;
        }

        public GameBuilder setPlayer(List<Player> player) {
            this.player = player;
            return this;
        }

        public Player getWinner() {
            return winner;
        }

        public GameBuilder setWinner(Player winner) {
            this.winner = winner;
            return this;
        }

        public int getNextPlayerIndex() {
            return nextPlayerIndex;
        }

        public GameBuilder setNextPlayerIndex(int nextPlayerIndex) {
            this.nextPlayerIndex = nextPlayerIndex;
            return this;
        }

        public Game build() {
            Game game = new Game(this);
        }

        List<Move> move;
        int nextPlayerIndex;
        Player winner;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

    public Board getBoad() {
        return boad;
    }

    public void setBoad(Board boad) {
        this.boad = boad;
    }

    public List<Move> getMove() {
        return move;
    }

    public void setMove(List<Move> move) {
        this.move = move;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
}

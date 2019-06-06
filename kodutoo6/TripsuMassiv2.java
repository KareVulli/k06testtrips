import java.util.ArrayList;
import java.util.Arrays;

public class TripsuMassiiv2 implements Tripsuliides {

    private char kelleKord;
    private char[] players = new char[2];
    private int turnCounter = 0;
    private char[] board = new char[9];

    public void alusta(char symbol) {
        System.out.println(Arrays.toString(board));
        if (symbol == 'X' || symbol == '0') {
            this.kelleKord = symbol;
            players[0] = kelleKord;
            if (players[0] == '0') {
                players [1] = 'X';
            }
            if (players[0] == 'X') {
                players[1] = '0';
                turnCounter++;
            }
        } else {
            throw new IllegalArgumentException("mängija saab olla kas X või 0");
        }
    }

    public char kelleKord() {
        if (turnCounter % 2 == 0) {
            kelleKord = players[1];
            return players[1];
        }
        else {
            kelleKord = players[0];
            return players[0];
        }
    }

    public void paiguta(char symbol, int rida, int veerg) {
        int setPosition = rida * veerg;
        board[setPosition-1] = kelleKord();
        turnCounter++;
    }

    public char kysi(int rida, int veerg) {

        return board[rida*veerg-1];
    }

    public void printBoard() {
        System.out.println(Arrays.toString(board));
    }
}

class Solution {
    public String losingPlayer(int x, int y) {
        boolean turn = false;
        while (x >= 1 && y >= 4) {
            x--;
            y = y - 4;
            turn = !turn;
        }
        if (!turn) {
            return "Bob";
        } else {
            return "Alice";
        }
    }
}

package hr.fer.oop.labosi.lab05.zad04;

class Match {
    private String whitePlayer;
    private String blackPlayer;
    private Result result;
    //  ... GETTERI I SETTERI

    public String getWhitePlayer() {
        return whitePlayer;
    }

    public void setWhitePlayer(String whitePlayer) {
        this.whitePlayer = whitePlayer;
    }

    public String getBlackPlayer() {
        return blackPlayer;
    }

    public void setBlackPlayer(String blackPlayer) {
        this.blackPlayer = blackPlayer;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Match{" +
                "whitePlayer='" + whitePlayer + '\'' +
                ", blackPlayer='" + blackPlayer + '\'' +
                ", result=" + result +
                '}';
    }

    public Match(String whitePlayer, String blackPlayer, Result result) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        this.result = result;
    } }
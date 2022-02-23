package sampleCode.Constructor.MarioKart;

public class MarioKartGame {
    private String track;
    private int numberOfLaps;
    private String computerDifficulty;
    private String[] characters;

    public MarioKartGame() {
        this.track = "Moo Moo Meadows";
        this.numberOfLaps = 3;
        this.computerDifficulty = "hard";
        setupCharacters();
    }

    public MarioKartGame(String track, int numberOfLaps, String computerDifficulty) {
        this.track = track;
        this.numberOfLaps = numberOfLaps;
        this.computerDifficulty = computerDifficulty;
        setupCharacters();
    }

    private void setupCharacters() {
        this.characters = new String[4];
        this.characters[0] = "Luigi";
        this.characters[1] = "Peach";
        this.characters[2] = "Baby Rosalina";
        this.characters[3] = "Yoshi";
    }

    public String getTrack() {
        return this.track;
    }
}

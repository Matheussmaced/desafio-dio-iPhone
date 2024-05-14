package functionalities;

import java.util.Scanner;

public class MusicPlayer {
  public void play() {
    System.out.println("Tocando música");
  }

  public void pause() {
    System.out.println("Pausar música");
  }

  public void selectMusic() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual musica você deseja selecionar?");

    String userMusic = scanner.nextLine();
    System.out.println("A musica que você escolheu é: " + userMusic);
  }
}

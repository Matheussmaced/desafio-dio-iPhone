import java.util.Scanner;

import functionalities.Browser;
import functionalities.MusicPlayer;
import functionalities.Telephone;

public class IPhone {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MusicPlayer musicPlayer = new MusicPlayer();
        Telephone telephone = new Telephone();
        Browser browser = new Browser();

        System.out.println("Se você que escutar musica, digite 1");
        System.out.println("Se você que usar o aparelho telefônico, digite 2");
        System.out.println("Se você quer usar o navegador de internet, digite 3");
        System.out.println("Se você deseja desligar o celular, digite 0");

        int user = scanner.nextInt();

        if (user == 1) {
            musicPlayer.selectMusic();
            System.out.println("Tocar musica digite 1");

            int userOne = scanner.nextInt();
            if (userOne == 1) {
                musicPlayer.play();
            }
            System.out.println("Pausar musica digite 1");
            int userTwo = scanner.nextInt();

            if (userTwo == 1) {
                musicPlayer.pause();
            } else {
                System.out.println("comando invalido");
            }

        } else if (user == 2) {
            System.out.println("Se deseja ligar, digite 1");
            System.out.println("se deseja iniciar um correio de voz, digite 2");

            int telephoneUser = scanner.nextInt();

            if (telephoneUser == 1) {
                telephone.toConnect();
            } else if (telephoneUser == 2) {
                telephone.startVoiceMail();
            } else {
                System.out.println("Comando invalido");
            }
        }

        if (user == 3) {
            browser.displayPage();
            System.out.println("Você deseja adicionar uma nova aba? se sim, digite 1");
            System.out.println("Se você deseja atualizar a pagina, digite 2");

            int browserUser = scanner.nextInt();

            if (browserUser == 1) {
                browser.addNewTab();
            } else if (browserUser == 2) {
                browser.updatePage();
            }
        }

        if (user == 0) {
            System.out.println("Você desligou o celular");
        }

        if (user != 1 || user != 2 || user != 3 || user != 0) {
            System.out.println("Comando invalido");
        }
    }

}

import java.util.Scanner;

public class jeuDevinette {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100 + 1); //Génération du nombre aléatoire (1-100)
        int maxTentatives = 10;
        int numberUser;

        //récupération de l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue au jeu de devinette!\n Vous devez devinez le nombre que je cache...Allez c'est parti!");

        for(int i = 0 ; i < maxTentatives ; i++){
            System.out.println("tentative " + (i+1));
            System.out.println("Entrez un nombre:");

            numberUser = scanner.nextInt();
            //Affichage du résultat en fonction du nombre saisi
            if(numberUser == randomNumber){
                System.out.println("Vous avez gagné!");
                break;

            } else if (numberUser > randomNumber) {
                System.out.println("Nombre proposé plus grand");
            }else{
                System.out.println("Nombre proposé plus petit");

            }
            if (i == (maxTentatives - 1)){
                System.out.println("nombre de tentative épuisée.Vous avez perdu!");
            }

    }
    }
}

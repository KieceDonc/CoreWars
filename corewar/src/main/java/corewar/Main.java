package corewar;

import corewar.ServerSide.Server;
import corewar.ClientSide.Client;
import corewar.Read.Read;

public class Main{

    public static boolean DEBUG_VALUE = true;
    
    public static void main(String[] args){
        printLogo();
        switch(serverOrClient()){
            case 1:{ 
                new Client();
                break;
            }
            case 2:{
                new Server();
            }
        };
    }

    public static int serverOrClient(){
        int choice = 0;
        do{
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("1 - Rejoindre en tant que joueur");
            System.out.println("2 - Créer un serveur");
            System.out.println("");
            System.out.print("Votre choix : ");
            choice = Read.i();
            System.out.println("");
            System.out.println("------------------------------------------------------------------------------------------");    
        }while(choice>2 || choice<1);
        return choice;
    }

    public static void DebugMessage(String str){
        if(DEBUG_VALUE){
            System.out.println("DEBUG : "+str);
        }
    }

    public static void printLogo(){
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@%@@@@@@@@@@@@@@@@@@@&@@&@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@@@@@@@@@@@@@");
        System.out.println("@@%@@@@&@@@@@@@@@&@@@@@#@@@@@@@@/@@@@@@@@@@@@@@@@@@@&&@@&%@@@@@@@@@@@&@@@@@@@@#@");
        System.out.println("@@@@@#@%@@@@@@&@@@@@@@@@%%@@@@@@@@&@@@@@@@@@@@@@@(/@@@@@@@@@@@@@%@@@@@@%@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@@&%@@@@@@@@@@@@@@@@@@@#%@@@@@@@@/@@@@@@@%@@@@@@&@@");
        System.out.println("@@@@@@@@@@@@@&#@@@@@&&@@@@@@@@@@@%(@@@%&@@&%@@@@@@@@@@@@@@@%&@@@(@@@@@@@@@@@@@&@");
        System.out.println("@@@@@@@@@@@@@@@&@@@@@@@@(%&&@@@@@@@@@@@@&&@@@(&@@@@@@@@@@@@@@@&@@@@@@@%@@@@@@@@@");
        System.out.println("@@@@@@&@&,         /@@@@@@#.         *@@@@.             .%@%                @@@@");
        System.out.println("@&@@&@  .&@@@@@@@@@#  (&  .@@@@@@@@@@%  .& *@@@@@@@@@@@@@    @@@@@@@@@@@@@% /@@&");
        System.out.println("@@@@%  @@@@@@/,(@@@@@*   @@@@@&*,(@@@@@&   *@@@@%   .@@@@@   @@@@@#         /@@@");
        System.out.println("@@@@. &@@@@, (@.        @@@@@  &@. #@@@@/  *@@@@&//(@@@@@@   @@@@@&%%%%%%%  @@@@");
        System.out.println("@@@@. @@@@@  &@&     .  @@@@@  @@( *@@@@#  *@@@@@@@@@@%.  *, @@@@@@@@@@@@@  @@@@");
        System.out.println("&@@@, /@@@@%     @@@@@  %@@@@#     @@@@@.  *@@@@%  &@@@@@  . @@@@@.         #@@@");
        System.out.println("@@@@@. .@@@@@@@@@@@@&    *@@@@@@@@@@@@@  * *@@@@%   *@@@@@.  @@@@@@@@@@@@@@ .@@@");
        System.out.println("@@@@@@@,   /%&@@%/   (@@@   .(&@@@%*   ,@& ,####( ((  ###%%* ############## .@@@");
        System.out.println("@@@@@@@@@@@%&@@@@@@@%#%%#%&%&#%##%#&/#%#@/@@@@%@@@@@@@@@*/@@@@@%%@%@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@( .,,,,    ,,,,,.   .,,,,  &&  ,,,,,,  (@@@  ,,,,,,,,,,.   *@&@@@@@@@@@");
        System.out.println("@@@&#@@@@&  @@@@&  ,@@@@@@   @@@@@  &  @@@@@@@@  (&@  @@@@@@@@@@@@@@  %@@@@@@%@@");
        System.out.println("@@@@@@@&@@, (@@@@. @@@@@@@@ *@@@@, (  @@@@@@@@@@  @@  @@@@@    (@@@@/ %@@@@@@*@@");
        System.out.println("@@@@@@@@@@@  @@@@&&@@@(&@@@(@@@@@    %@@@@  @@@@&  @  @@@@@@@@@@@@@/  @@&@@@@@@@");
        System.out.println("@@@@@@@@@@@* *@@@@@@@@  @@@@@@@@.   (@@@@/  ,@@@@%    @@@@@.#@@@@@  ,@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@  @@@@@@@   ,@@@@@@&   *@@@@@@@@@@@@@@#   @@@@@   @@@@@%  @@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@( ,@@@@@/ *. %@@@@@   .@@@@@      &@@@@/  @@@@@ .  #@@@@@  #@&@@@@@@");
        System.out.println("@@&@&@@%@@@@@.        @@        .        %@@@               (@/        (@@@&@@@@");
        System.out.println("@@@@@@#&@@@@@@@@&@@@@@@@@%@@@@@//@@@&#@@%%&#&@%&%@%&(&@@@@@@@@(@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@&(@@@%@@@@@@@@@@@@@%(/@@@@@@@@%@@@@@%%@@@@@@@@@@@@@(@@@@@@@@@@@@@@@");
        System.out.println("&@@@@@@@@@@@@@@##@@@@@@@&#@@@@@&%&%@#&%&%%&(&%@@&@@@@@@@@@@@@&#@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@&@@@@@@@@@@@@@@@@@@&&@@@@@@@@@@@@@@@%@&&&&@@@@@@@@@&@@@@@%@@@@@@@@%@@@@@@");
        System.out.println("@@@@@@@@%@@@@@@&@@@@%@@@@@@@@%@@@@@@@@@@@@@@@@@@@@@&&@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@%@@@@@@@@@@@@@@@@&@@@@@@@@(@@@@@@@@@@@@@@@@@@@(@&@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@#@@@@&@#@@@&@@#@@@@&@@@&@@&@@@&@@@@@@/@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("------------------------------------------------------------------------------------------");
    }

}
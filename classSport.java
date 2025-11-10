class Sport {
    String SportName;
    String location;

    void printinfo(){
        System.out.println("Sport Name : " + SportName);
        System.out.println("Location : " + location);
    }
}

//SubClass 1
class Player extends Sport{
        String playername;
        String team;

        void showPlayer(){
            printinfo();
            System.out.println("Player Name:" + playername);
            System.out.println("Team: "+ team);
        }
}

//SubClass 2
class Coach extends Sport{
    String coachName;
    int experience;

    void showCoach(){
        printinfo();
        System.out.println("Coach Name: "+coachName);
        System.out.println("Experience: "+experience);
    }
}

// Subclass 3 (turunan dari player)
class FootballPlayer extends Player {
    String position;
    int goals;

    void showFootballStats(){
        showPlayer();
        System.out.println("Position: "+ position);
        System.out.println("Goals: "+ goals);
    }
}
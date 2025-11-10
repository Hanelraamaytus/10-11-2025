//Main program
public class MainSport {
    public static void main(String[] args) {
        // Membuat objek FootballPlayer
        FootballPlayer fp = new FootballPlayer();
        fp.SportName = "Sepak bola";
        fp.location = "Stadion Nasional";
        fp.playername = "Rizky";
        fp.team = "Gadura Muda";
        fp.position = "Penyerang";
        fp.goals = 12;

        System.out.println("=== Data Pemain Sepak Bola ===");
        fp.showFootballStats();

        //Membuat objek Coach
        System.out.println("\n== Data Pelatih ===");
        Coach c = new Coach();
        c.SportName = "Sepak Bola";
        c.location = "Lapangan Utama";
        c.coachName = "Coach Andi";
        c.experience = 8;
        c.showCoach();
    }
}

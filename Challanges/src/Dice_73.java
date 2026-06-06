public class Dice_73 {

    int roll(){
        double random = Math.random() * 6;
        return  (int)Math.ceil(random);
    }

    public static void main(String[] args) {
        Dice_73 dice = new Dice_73();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(dice.roll());
        }

    }
}

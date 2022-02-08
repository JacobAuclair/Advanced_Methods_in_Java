
/**
 * Write a description of class Dungeon02 here.
 * 
 * @Jacob Auclair 
 * @4/6/2017
 */
import java.util.*;

public class Dungeon02 extends Dungeon
{

    /**
     * Constructor for objects of class Dungeon02
     */
    public Dungeon02()
    {
        super();
    }

    /**
     *  The hero explores this dungeon
     * 
     * @param  hero   the hero of the game
     */
    public void explore( Hero hero )
    {      
        int Key = 0;
        int stage = 0;
        System.out.println("Frodo awakens in a startle, jumping to his feet and instinctively reaching ");
        System.out.println("for his shortsword and realizes it shines blue, that means orcs are nearby. He remembers camping the night before with his friend Sam");
        System.out.println("but not much else, everything is still hazy from his peculiar dream. As he rubs his eyes to clear the blur he realizes that Sam is gone! He knows now he must find Sam, as he begins to search the camp for footprints he hears a tumble of rocks not a stones throw from the camp.");

        //------------------------------------
        //          STAGE 0
        //------------------------------------

        if (stage == 0){
            System.out.println("Do you continue searching the camp? (Y or N)");
            if (checkYes()){
                System.out.println("You recognize a set of bare footprints leading away from the camp.");
                System.out.println("Suddlenly there is a shuffling behind Frodo, and as he turns he");
                System.out.println("catches a glancing blow from a club.");

                Monster OrcSlaver = new Monster( "The Orc Slaver", 4, 4 );        
                System.out.println( "\n" + hero.toString() + "\t" + OrcSlaver.toString() );       
                pause();

                OrcSlaver.strike(hero);

                System.out.println("An Orc Slaver stands over you, club in one hand and shackles in the other.");
                System.out.println("The Orc taunts \" YOUR GOING TO MAKE A GREAT MEAL FOR THE OTHER SLAVES!\"");

                // The hero and the wombat fight to the death
                while ( hero.getHitpoints()>0 && OrcSlaver.getHitpoints()>0 )
                {
                    hero.strike( OrcSlaver );
                    pause();

                    if ( hero.getHitpoints()>0 && OrcSlaver.getHitpoints()>0 )
                    {
                        OrcSlaver.strike( hero );
                    }

                    System.out.println( "\n" + hero.toString() + "\t" + OrcSlaver.toString() );
                    pause();
                }
                if ( hero.getHitpoints()>0 )
                {
                    System.out.println("Through agile strikes and determination Frodo brings the Orc to its knees");
                    System.out.println("and with one final hit, kills it.");
                    System.out.println("Searching the orc yeilds some gold and a key!");
                    System.out.println("Do you take the items from the orc? (Y or N)");
                    stage = 1;
                    if ( checkYes() )
                    {
                        System.out.println("You pocket 50 gold and a rusty old skeleton key");
                        hero.incGold( 50 );
                        Key++;
                    }
                    else
                    {
                        System.out.println("You decide to travel light and avoid the gold, but gain 3 hit points");
                        hero.increaseHitPoints( 2 );
                    }

                }
                else{
                    System.out.println("Frodo simply cannot overcome the hulking Orc Slaver and is killed in");
                    System.out.println("combat, and brought back to the slaver tower to be cooked into a");
                    System.out.println("hobbit stew. Mmmmmmm, yummy.");
                }
            }
        }

        if (stage == 0){
            System.out.println("Do you investigate the rockslide? (Y or N)");
            if (checkYes()){
                System.out.println("Frodo stealthily moves towards the edge of the camp in the direction of the");
                System.out.println("rockslide when he spots an Orc slipping out from behind the ridge.");

                System.out.println("An Orc Slaver runs towards you, club in one hand and shackles in the other.");
                System.out.println("The Orc taunts \" YOUR GOING TO MAKE A GREAT MEAL FOR THE OTHER SLAVES!\"");

                Monster OrcSlaver = new Monster( "The Orc Slaver", 4, 4 );        
                System.out.println( "\n" + hero.toString() + "\t" + OrcSlaver.toString() );       
                pause();

                // The hero and the wombat fight to the death
                while ( hero.getHitpoints()>0 && OrcSlaver.getHitpoints()>0 )
                {
                    hero.strike( OrcSlaver );
                    pause();

                    if ( hero.getHitpoints()>0 && OrcSlaver.getHitpoints()>0 )
                    {
                        OrcSlaver.strike( hero );
                    }

                    System.out.println( "\n" + hero.toString() + "\t" + OrcSlaver.toString() );
                    pause();
                }
            }
            if ( hero.getHitpoints()>0 )
            {
                System.out.println("Through agile strikes and determination Frodo brings the Orc to its knees");
                System.out.println("and with one final hit, kills it.");
                System.out.println("Searching the orc yeilds some gold and a key!");
                System.out.println("Do you take the items from the orc? (Y or N)");
                stage = stage+1;
                if ( checkYes() )
                {
                    System.out.println("You pocket 50 gold and a rusty old skeleton key");
                    hero.incGold( 50 );
                    Key++;
                }
                else
                {
                    System.out.println("You decide to travel light and avoid the gold, but gain 3 hit points");
                    hero.increaseHitPoints( 2 );
                }

            }
            else{
                System.out.println("Frodo simply cannot overcome the hulking Orc Slaver and is killed in");
                System.out.println("combat, and brought back to the slaver tower to be cooked into a");
                System.out.println("hobbit stew. Mmmmmmm, yummy.");
            }
        }

        if (stage == 0){
            System.out.println("Do you give up, quit your adventure, doom all of middle earth, and");
            System.out.println("decide sleep is more important??? (Y or N)");
            if (checkYes()){
                System.out.println("Frodo foolishly disregards all warning signs and training and becomes");
                System.out.println("a total bum. As Frodo falls back asleep he is clubbed multiple times");
                System.out.println("by an orc slaver, and dragged off to be eaten. Middle earth is doomed,");
                System.out.println("Congragulations... I guess...");

                Monster OrcKiller = new Monster( "The Orc Killer", 4000, 4 );     

                OrcKiller.strike( hero );

                System.out.println( "\n" + hero.toString());
            }
        }

        //------------------------------------
        //          STAGE 1
        //------------------------------------

        System.out.println("After a gruiling fight, Frodo returns to the task at hand, finding Sam.");

        if (stage == 1){
            System.out.println("Do you follow the footprints away from the camp? (Y or N)");
            if (checkYes()){
                System.out.println("Frodo follows the footprints south of the camp and down a steep slope");
                System.out.println("being careful not to cut himself on the razor sharp rocks, as he nears");
                System.out.println("the bottom of the slope he finds himself facing a large black metal tower");
                System.out.println("with a bridge leading towards it. Two orcs are guarding the entrance to the");
                System.out.println("tower. Although there may be another way in as well...");
                stage = 2;
            }
        }
        if (stage == 1){
            System.out.println("Do you check your surroundings in sign of any clue that may lead to Sam? (Y or N)");
            if (checkYes()){
                System.out.println("Frodo searches high and low around every rock and crevase before heading");
                System.out.println("further from camp. As he nears the cliff edge he spots a path down the slope");
                System.out.println("that looks heavily traveled. At the bottom of the slope he spots a large black");
                System.out.println("metal tower with a bridge leading towards it. Two orcs are guarding the entrance ");
                System.out.println("to the tower. Although there may be another way in as well...");
                stage = 2;
            }
        }
        //-----------------------------------

        if (stage == 2){
            System.out.println("Do you approach the front gate? (Y or N)");
            if (checkYes()){
                System.out.println("Frodo with the courage of 1000 giant eagles with lazer beams for eyes");
                System.out.println("charges head long into the two Orc guards. His pace soon slows because");
                System.out.println("that bridge was way longer than it looked and those orcs are much bigger");
                System.out.println("up close... and they have sheilds...");

                System.out.println("Do you run away scared for your life??? (Y or N)");
                if (checkYes()){
                    System.out.println("Frodo leaps from the bridge ");
                    int result =  rand.nextInt( 1 ) ;
                    if (result == 0)
                    {
                        System.out.print("and suffers a large gash as he lands.");
                        Monster SharpRock = new Monster("The Sharp Rock", 3, 4 ); 
                        SharpRock.strike( hero );
                        System.out.println( "\n" + hero.toString());
                    }
                    else if (result == 1)
                    {
                        System.out.print("and lands saftely below it.\n");
                    }
                    stage = 3;
                }
                System.out.println("Do you continue your foolhearted charge? (Y or N)");
                if (checkYes()){
                    Monster OrcSheildbearer = new Monster( "The OrcSheildbearer", 16, 40 );        
                    System.out.println( "\n" + hero.toString() + "\t" + OrcSheildbearer.toString() );       
                    pause();
                    Monster OrcDoorguard = new Monster( "The OrcDoorguard", 16, 40 );        
                    System.out.println( "\n" + hero.toString() + "\t" + OrcDoorguard.toString() );       
                    pause();

                    while ( hero.getHitpoints()>0 && OrcSheildbearer.getHitpoints()>0 || hero.getHitpoints()>0 && OrcDoorguard.getHitpoints()>0)
                    {
                        System.out.println("Do you attack the Sheildbearer? (Y or N)");
                        if (checkYes()){
                            hero.strike( OrcSheildbearer );
                        }
                        else{
                            hero.strike( OrcDoorguard );
                        }
                        pause();
                        if ( hero.getHitpoints()>0 && OrcSheildbearer.getHitpoints()>0)
                        {
                            OrcSheildbearer.strike( hero );
                        }
                        if (hero.getHitpoints()>0 && OrcDoorguard.getHitpoints()>0)
                        {
                            OrcDoorguard.strike( hero );
                        }

                        System.out.println( "\n" + hero.toString() + "\t" + OrcSheildbearer.toString() + "\t" + OrcDoorguard.toString());
                        pause();
                    }
                    if ( hero.getHitpoints()>0 )
                    {
                        System.out.println("The two orcs lay bloodied and dead at your feat... Seriously, you");
                        System.out.println("survived that! You have gotta be the strongest hobbit ever. Hats off");
                        System.out.println("to you. like for real. Here, have like... alot of stuff...");
                        System.out.println("You search the boddies and find lots of gold and health.");
                        System.out.println("You pocket 300 gold coins");
                        hero.incGold( 300);
                        System.out.println("You feel invigorated through your victory and gain 56 hit points and strngth");
                        hero.increaseHitPoints( 56 );
                        System.out.println("In a maddened bloodthurst and rage for more orcs dead, Frodo has a complete");
                        System.out.println("mental breakdown from completing the impossible and forgets who he is or what");
                        System.out.println("he is doing and goes on a orc killing rampage that will only lead to his eventual");
                        System.out.println("death.. yayyyy. you completed the game... didnt win. but you finished...");
                    }
                    stage = 4;
                }
            }
        }

        if (stage == 2){
            System.out.println("Do you head underneath the bridge? (Y or N)");
            if (checkYes()){
                stage = 3;

                System.out.println("Frodo sneaks below the long bridge to a sewer grate with a lock on it.");
                System.out.println("he tries to peer inside but fails to see or hear anything of intrest.");

                if ( Key == 1){
                    System.out.println("Frodo remembers that the key he had previously looted may fit this lock.");

                    System.out.println("Do you try the lock with the key? (Y or N)");

                    if (checkYes()){
                        System.out.println("The key slides into the lock, a perfect fit. As the key is turned the");
                        System.out.println("tumblers make a loud *Thunk  Thunk Thunk* that echos throughout the tunnel");
                        System.out.println("beyond. Before Frodo is even able to open the barred gate he hears");
                        System.out.println("Splashing running toward him at an alarming speed from the other side!");
                        System.out.println("ITS SAMMMM!!! YAHHHHHH YOU WIN. good job.");
                    }else{
                        System.out.println("Frodo looks at the key and thinks it is dumb and throws it. You loose your key...");
                        Key = 0;
                    }
                }

                if (Key == 0){
                    System.out.println("Without a key, you will have to pick the rusty old lock");
                    int result =  rand.nextInt( 1 ) ;
                    if (result == 0){
                        System.out.println("You suffer a broken nail... Take like... no damage. who cares. its a nail.");

                    }
                    else if (result == 1){
                        System.out.print("Frodo contracts tetenus from the rusty lock. There is no cure. Take 4 damage");
                        Monster Tetenus = new Monster("Tetenus", 3, 4 ); 
                        Tetenus.strike( hero );
                        System.out.println( "\n" + hero.toString());
                    }
                    System.out.println("The key slides into the lock, a perfect fit. As the key is turned the");
                    System.out.println("tumblers make a loud *Thunk  Thunk Thunk* that echos throughout the tunnel");
                    System.out.println("beyond. Before Frodo is even able to open the barred gate he hears");
                    System.out.println("Splashing running toward him at an alarming speed from the other side!");
                    System.out.println("ITS SAMMMM!!! YAHHHHHH YOU WIN. good job.");
                }
            }
        }

    }
}

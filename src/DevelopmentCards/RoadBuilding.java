package DevelopmentCards;

import GameFlow.Game;

public class RoadBuilding extends Card {
    // Properties

    // Constructor
    public RoadBuilding()
    {
        setName("Road Building");
        setInformation("This special card allows you to build 2 roads freely.");
    }

    // Methods
    /**
     * This function plays the DevelopmentCards.RoadBuilding card, which allows player to build 2 roads freely.
     */
    @Override
    public void play() {

        Game.getInstance().addMust(0);
        Game.getInstance().addMust(0);
    }
}

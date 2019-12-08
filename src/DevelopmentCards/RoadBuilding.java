package DevelopmentCards;

import GameFlow.FlowManager;
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
        FlowManager flowManager = new FlowManager();

        flowManager.addMust(0);
        flowManager.addMust(0);
    }
}

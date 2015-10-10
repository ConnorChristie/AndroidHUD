package edu.msoe.androidhud;

/**
 * Created by longatoj on 10/3/2015.
 *
 * This class is responsible for distributing all responsibility to the correct class/activity.
 * For example, if data from the mphCalculator comes in then that class should contact this class
 * to tell the UI to update its MPH label. No sever calculations should be done in this class.
 * It is also a singleton therefore if any other class needs to acesess it, that class should
 * call Brain.getInstance
 */
public class Brain {
    /**
     * Creates a single such that only one instance of this class will ever be in existance
     * at the time of running this app.
     */
    private static Brain ourInstance = new Brain();
    /**
     * Call this method to get the singleton of this class.
     * @return The singleton of the class
     */
    public static Brain getInstance() {
        return ourInstance;
    }

    private Brain() {

    }
}

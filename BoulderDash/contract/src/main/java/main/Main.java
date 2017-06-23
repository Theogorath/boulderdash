package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import controller.IController;
import model.ModelFacade;
import view.ViewFacade;

public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
    	
    	
        IController controller;
        controller= new ControllerFacade(new IView(), new IModel());

        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }

}

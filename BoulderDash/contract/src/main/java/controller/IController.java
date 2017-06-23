package controller;

import model.IModel;
import view.IView;

/**
 * <h1>The Interface IController.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IController {
	
	public void ControllerFacadeConstructor(final IView view, final IModel model);
	
}

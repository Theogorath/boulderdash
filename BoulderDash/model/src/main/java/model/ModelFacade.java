package model;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ModelFacade implements IModel {
	
    /**
     * Instantiates a new model facade.
     */
	Map map;
    public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public ModelFacade() {
        super();
        map = new Map();
    }



}

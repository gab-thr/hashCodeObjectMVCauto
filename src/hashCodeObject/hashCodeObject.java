package hashCodeObject;

import Controller.Controller;
import Model.Model;
import View.View;

public class hashCodeObject {
	private static final String PATH = "C://Users/gabriell.thurnher/Desktop/Stage/Jour 4/hashCode/";
	
	public static void main(String[] args) {
		
		Model originalTab = new Model(PATH +"logo.in");
		Model modifiedTab = new Model(PATH + "logo.in");
		Model candidate = new Model(14,80);
		View view = new View();
		Controller controller = new Controller(originalTab, view);
		view.setController(controller);
		view.setModel(originalTab);	
		view.setModel(candidate);
		view.printTab(originalTab.getTab());
		
//		Controller.findSolutionColumn(modifiedTab.getTab(),Model.getCommande());
//		Controller.eraseColumn(modifiedTab.getTab(), Model.getCommande());
//		Controller.findSolutionLine(modifiedTab.getTab(),Model.getCommande());
		Controller.findFinalSolution(modifiedTab.getTab(), Model.getCommande());
		
		Controller.paintTab(candidate.getTab(), Model.getCommande());
		view.printTab(candidate.getTab());		
//		view.displayTab(candidate.getTab());
		
		view.nbCoups();
		view.compareTabs(originalTab, candidate);
		
	}
	
}

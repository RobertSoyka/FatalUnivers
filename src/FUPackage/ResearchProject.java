package FUPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.JSlider;

public class ResearchProject implements IGeneralData{

	public Technology technology;
	public double researchInvested = 0;

public ResearchProject(Technology technology_) {
	this.technology = technology_;
}


}
package org.nidhal;

/**
 * 
 * @author Nidhal Messaoudi
 * @date 12/7/2021
 * @copyright © 2021. All rights are reserved.
 * 
 */
public class CalcLettreScore extends CalcScore {
	private final double ARAB_MARK;
	private final double PHYLO_MARK;
	
	// History and Geography
	private final double HG_MARK;

	public CalcLettreScore(double bAC_MARK,
						   double fRENCH_MARK,
						   double eNGLISH_MARK,
						   double aRAB_MARK,
						   double pHYLO_MARK,
						   double hG_MARK)
	{
		super(bAC_MARK, fRENCH_MARK, eNGLISH_MARK);
		ARAB_MARK = aRAB_MARK;
		PHYLO_MARK = pHYLO_MARK;
		HG_MARK = hG_MARK;
		super.score = calculate();
	}
	
	@Override
	protected double calculate() {
		return (4 * BAC_MARK) + (1.5 * ARAB_MARK) +
				(1.5 * PHYLO_MARK) + HG_MARK + FRENCH_MARK + ENGLISH_MARK;
	}
}

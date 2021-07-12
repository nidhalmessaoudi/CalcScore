package org.nidhal;

/**
 * 
 * @author Nidhal Messaoudi
 * @date 12/7/2021
 * @copyright © 2021. All rights are reserved.
 * 
 */
public class CalcSportScore extends CalcMathScore {
	// Sports specialty
	private final double S_SP_MARK;
	private final double SPORT_MARK;
	private final double PHYLO_MARK;

	public CalcSportScore(double bAC_MARK,
						  double mATH_MARK,
						  double pHYSICS_MARK,
						  double sIENCE_MARK,
						  double s_SP_MARK,
						  double sPORT_MARK,
						  double pHYLO_MARK,
						  double fRENCH_MARK,
						  double eNGLISH_MARK) 
	{
		super(bAC_MARK,
			  mATH_MARK,
			  pHYSICS_MARK,
			  sIENCE_MARK,
			  fRENCH_MARK,
			  eNGLISH_MARK);
		S_SP_MARK = s_SP_MARK;
		SPORT_MARK = sPORT_MARK;
		PHYLO_MARK = pHYLO_MARK;
		super.score = calculate();
	}

	@Override
	protected double calculate() {
		return (4 * BAC_MARK) + (1.5 * SIENCE_MARK) + (0.5 * PHYSICS_MARK) +
				(0.5 * SPORT_MARK) + (0.5 * PHYLO_MARK) + S_SP_MARK +
				FRENCH_MARK + ENGLISH_MARK;
	}
}

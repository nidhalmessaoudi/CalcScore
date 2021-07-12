package org.nidhal;

/**
 * 
 * @author Nidhal Messaoudi
 * @date 12/7/2021
 * @copyright © 2021. All rights are reserved.
 * 
 */
public class CalcTechScore extends CalcMathScore {
	private final double TECH_MARK;

	public CalcTechScore(double bAC_MARK,
						 double mATH_MARK,
						 double pHYSICS_MARK,
						 double fRENCH_MARK,
						 double eNGLISH_MARK,
						 double tECH_MARK)
	{
		super(bAC_MARK, mATH_MARK, pHYSICS_MARK, 0.0, fRENCH_MARK, eNGLISH_MARK);
		TECH_MARK = tECH_MARK;
		super.score = calculate();
	}
	
	@Override
	protected double calculate() {
		return (4 * BAC_MARK) + (1.5 * TECH_MARK) +
				(1.5 * MATH_MARK) + PHYSICS_MARK + FRENCH_MARK + ENGLISH_MARK;
	}
}

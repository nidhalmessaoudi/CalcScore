package org.nidhal;

/**
 * 
 * @author Nidhal Messaoudi
 * @date 12/7/2021
 * @copyright © 2021. All rights are reserved.
 * 
 */
public class CalcSienceScore extends CalcMathScore {

	public CalcSienceScore(double bAC_MARK,
						   double mATH_MARK,
						   double pHYSICS_MARK,
						   double sIENCE_MARK,
						   double fRENCH_MARK,
						   double eNGLISH_MARK)
	{
		super(bAC_MARK,
			  mATH_MARK,
			  pHYSICS_MARK,
			  sIENCE_MARK,
			  fRENCH_MARK,
			  eNGLISH_MARK);
		super.score = calculate();
	}
	
	@Override
	protected double calculate() {
		return (4 * BAC_MARK) + (1.5 * PHYSICS_MARK) +
				(1.5 * SIENCE_MARK) + MATH_MARK + FRENCH_MARK + ENGLISH_MARK;
	}
}

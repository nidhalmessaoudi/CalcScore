package org.nidhal;

/**
 * 
 * @author Nidhal Messaoudi
 * @date 12/7/2021
 * @copyright © 2021. All rights are reserved.
 * 
 */
public class CalcMathScore extends CalcScore {
	protected final double MATH_MARK;
	protected final double PHYSICS_MARK;
	protected final double SIENCE_MARK;
	
	
	public CalcMathScore(double bAC_MARK,
						 double mATH_MARK,
						 double pHYSICS_MARK,
						 double sIENCE_MARK,
						 double fRENCH_MARK,
						 double eNGLISH_MARK
						 )
	{
		super(bAC_MARK, fRENCH_MARK, eNGLISH_MARK);
		MATH_MARK = mATH_MARK;
		PHYSICS_MARK = pHYSICS_MARK;
		SIENCE_MARK = sIENCE_MARK;
		super.score = calculate();
	}


	protected double calculate() {
		return (4 * BAC_MARK) + (2 * MATH_MARK) + (1.5 * PHYSICS_MARK) +
				(0.5 * SIENCE_MARK) + FRENCH_MARK + ENGLISH_MARK;
	}
}

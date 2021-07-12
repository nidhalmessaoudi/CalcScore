package org.nidhal;

/**
 * 
 * @author Nidhal Messaoudi
 * @date 12/7/2021
 * @copyright © 2021. All rights are reserved.
 * 
 */
public class CalcInfoScore extends CalcMathScore {
	private final double ALGO_MARK;
	
	// Information and communication technology
	private final double TIC_MARK;
	
	// Databases
	private final double DB_MARK;

	public CalcInfoScore(double bAC_MARK,
						 double mATH_MARK,
						 double pHYSICS_MARK,
						 double fRENCH_MARK,
						 double eNGLISH_MARK,
						 double aLGO_MARK,
						 double tIC_MARK,
						 double dB_MARK)
	{
		super(bAC_MARK, mATH_MARK, pHYSICS_MARK, 0.0, fRENCH_MARK, eNGLISH_MARK);
		ALGO_MARK = aLGO_MARK;
		TIC_MARK = tIC_MARK;
		DB_MARK = dB_MARK;
		super.score = calculate();
	}
	
	@Override
	protected double calculate() {
		return (4 * BAC_MARK) + (1.5 * ALGO_MARK) +
				(1.5 * MATH_MARK) + (0.5 * PHYSICS_MARK) +
				(0.25 * (TIC_MARK + DB_MARK)) + FRENCH_MARK + ENGLISH_MARK;
	}
}

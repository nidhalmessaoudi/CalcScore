package org.nidhal;

/**
 * 
 * @author Nidhal Messaoudi
 * @date 12/7/2021
 * @copyright © 2021. All rights are reserved.
 * 
 */
public class CalcEcoScore extends CalcScore {
	private final double ECO_MARK;
	private final double GES_MARK;
	private final double HG_MARK;
	private final double MATH_MARK;

	public CalcEcoScore(double bAC_MARK,
						double fRENCH_MARK,
						double eNGLISH_MARK,
						double eCO_MARK,
						double gES_MARK,
						double hG_MARK,
						double mATH_MARK)
	{
		super(bAC_MARK, fRENCH_MARK, eNGLISH_MARK);
		ECO_MARK = eCO_MARK;
		GES_MARK = gES_MARK;
		HG_MARK = hG_MARK;
		MATH_MARK = mATH_MARK;
		super.score = calculate();
	}
	
	@Override
	protected double calculate() {
		return (4 * BAC_MARK) + (1.5 * ECO_MARK) +
				(1.5 * GES_MARK) + (0.5 * MATH_MARK) + (0.5 * HG_MARK) +
				FRENCH_MARK + ENGLISH_MARK;
	}
}

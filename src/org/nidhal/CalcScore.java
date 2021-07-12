package org.nidhal;

/**
 * 
 * @author Nidhal Messaoudi
 * @date 12/7/2021
 * @copyright © 2021. All rights are reserved.
 * 
 */
public abstract class CalcScore {
	protected double score;
	protected final double BAC_MARK;
	protected final double FRENCH_MARK;
	protected final double ENGLISH_MARK;
	
	
	
	public CalcScore(double bAC_MARK, double fRENCH_MARK, double eNGLISH_MARK) {
		BAC_MARK = bAC_MARK;
		FRENCH_MARK = fRENCH_MARK;
		ENGLISH_MARK = eNGLISH_MARK;
	}

	public double getScore() {
		return this.score;
	}
	
	abstract double calculate();
}

package com.ryoichi0102.ambitious.checkstyle.sample;

/**
 * <h3>
 * To ignore CheckStyle.
 * </h3>
 *
 * @author ryoichi-obara
 * @since 2015/01/14
 */
public class SampleClassForIgnoringCheckStyle {

	private static final SampleClassForIgnoringCheckStyle instance = new SampleClassForIgnoringCheckStyle(); // Checkstyle警告スキップ。理由⇒ 

	/**
	 * Constructor.
	 */
	private SampleClassForIgnoringCheckStyle() {
	}

	public static SampleClassForIgnoringCheckStyle getInstance() {
		return instance;
	}
}

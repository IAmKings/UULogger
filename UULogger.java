package com.kings.testuulogger;
import android.util.Log;

/**
 * 用于调试的封装Log类 
 *
 * @author Kings
 *
 */

public class UULogger {

	private static final String TAG = "UULog Debuger";
	public static boolean DEBUG = true;

	/**
	 * 工具类的构造方法私有化~
	 */
	private UULogger() {
	}

	/**
	 * 
	 * 显示Log信息（带行号）,默认Log等级为Info，即是Log.i()
	 * 
	 * @param tag
	 *            设置的Tag值，null则为调用UULogger类的默认TAG
	 * @param info
	 *            显示的log信息
	 * 
	 */
	public static void log(String tag, String info) {
		if (tag == null) {
			log(info);
		} else if (info == null) {
			Log.i(tag, "Info is null!");
		} else {
			showLogWithLineNum(3, tag, info, getAutoJumpLogInfos());
		}
	}

	/**
	 * 
	 * 显示Log信息（带行号）,默认Log等级为Info，即是Log.i() 缺省tag
	 * 
	 * @param info
	 */
	public static void log(String info) {
		if (info == null) {
			Log.i(TAG, "Info is null!");
		} else {
			showLogWithLineNum(3, TAG, info, getAutoJumpLogInfos());
		}
	}

	/**
	 * 
	 * 显示Log信息（带行号）,默认Log等级为Info，即是Log.v()
	 * 
	 * @param tag
	 *            设置的Tag值，null则为调用UULogger的默认TAG
	 * @param info
	 *            显示的log信息
	 * 
	 */
	public static void v(String tag, String info) {
		if (tag == null) {
			v(info);
		} else if (info == null) {
			Log.v(tag, "Info is null!");
		} else {
			showLogWithLineNum(1, tag, info, getAutoJumpLogInfos());
		}
	}

	/**
	 * 
	 * 显示Log信息（带行号）,默认Log等级为Info，即是Log.v() 缺省tag
	 * 
	 * @param info
	 */
	public static void v(String info) {
		if (info == null) {
			Log.v(TAG, "Info is null!");
		} else {
			showLogWithLineNum(1, TAG, info, getAutoJumpLogInfos());
		}
	}

	/**
	 * 
	 * 显示Log信息（带行号）,默认Log等级为Info，即是Log.d()
	 * 
	 * @param tag
	 *            设置的Tag值，null则为调用UULogger的默认TAG
	 * @param info
	 *            显示的log信息
	 * 
	 */
	public static void d(String tag, String info) {
		if (tag == null) {
			d(info);
		} else if (info == null) {
			Log.d(TAG, "Info is null!");
		} else {
			showLogWithLineNum(2, tag, info, getAutoJumpLogInfos());
		}
	}

	/**
	 * 
	 * 显示Log信息（带行号）,默认Log等级为Info，即是Log.d() 缺省tag
	 * 
	 * @param info
	 */
	public static void d(String info) {
		if (info == null) {
			Log.d(TAG, "Info is null!");
		} else {
			Log.e("-", "vvv");
			showLogWithLineNum(2, TAG, info, getAutoJumpLogInfos());
		}
	}

	/**
	 * 
	 * 显示Log信息（带行号）,默认Log等级为Info，即是Log.i()
	 * 
	 * @param tag
	 *            设置的Tag值，null则为调用UULogger的默认TAG
	 * @param info
	 *            显示的log信息
	 * 
	 */
	public static void i(String tag, String info) {
		if (tag == null) {
			i(info);
		} else if (info == null) {
			Log.i(TAG, "Info is null!");
		} else {
			showLogWithLineNum(3, tag, info, getAutoJumpLogInfos());
		}
	}

	/**
	 * 
	 * 显示Log信息（带行号）,默认Log等级为Info，即是Log.i() 缺省tag
	 * 
	 * @param info
	 */
	public static void i(String info) {
		if (info == null) {
			Log.i(TAG, "Info is null!");
		} else {
			showLogWithLineNum(3, TAG, info, getAutoJumpLogInfos());
		}
	}

	/**
	 * 
	 * 显示Log信息（带行号）,默认Log等级为Info，即是Log.w()
	 * 
	 * @param tag
	 *            设置的Tag值，null则为调用UULogger的默认TAG
	 * @param info
	 *            显示的log信息
	 * 
	 */
	public static void w(String tag, String info) {
		if (tag == null) {
			w(info);
		} else if (info == null) {
			Log.w(tag, "Info is null!");
		} else {
			showLogWithLineNum(4, tag, info, getAutoJumpLogInfos());
		}
	}

	/**
	 * 
	 * 显示Log信息（带行号）,默认Log等级为Info，即是Log.w() 缺省tag
	 * 
	 * @param info
	 */
	public static void w(String info) {
		if (info == null) {
			Log.w(TAG, "Info is null!");
		} else {
			showLogWithLineNum(4, TAG, info, getAutoJumpLogInfos());
		}
	}

	/**
	 * 
	 * 显示Log信息（带行号）,默认Log等级为Info，即是Log.e()
	 * 
	 * @param tag
	 *            设置的Tag值，null则为调用UULogger的默认TAG
	 * @param info
	 *            显示的log信息
	 * 
	 */
	public static void e(String tag, String info) {
		if (tag == null) {
			e(info);
		} else if (info == null) {
			Log.e(tag, "Info is null!");
		} else {
			showLogWithLineNum(5, tag, info, getAutoJumpLogInfos());
		}
	}

	/**
	 * 
	 * 显示Log信息（带行号）,默认Log等级为Info，即是Log.e() 缺省tag
	 * 
	 * @param info
	 */
	public static void e(String info) {
		if (info == null) {
			Log.e(TAG, "Info is null!");
		} else {
			showLogWithLineNum(5, TAG, info, getAutoJumpLogInfos());
		}
	}

	/**
	 * 
	 * 显示Log信息（带行号）
	 * 
	 * @param logLevel
	 *            1 v ; 2 d ; 3 i ; 4 w ; 5 e .
	 * @param tag
	 *            设置的Tag值，null则为调用MyLogger的默认TAG
	 * @param info
	 *            显示的log信息
	 * 
	 */
	public static void showLogWithLineNum(int logLevel, String tag,
			String info, String[] infos) {
		if (tag != null) {
			infos[0] = tag;
		}

		if (logLevel < 1 || logLevel > 5) {
			throw new AssertionError();
		}

		if (DEBUG) {
			switch (logLevel) {
			case 1:
				Log.v(infos[0], info + " : " + infos[1] + infos[2]);
				break;
			case 2:
				Log.d(infos[0], info + " : " + infos[1] + infos[2]);
				break;
			case 3:
				Log.i(infos[0], info + " : " + infos[1] + infos[2]);
				break;
			case 4:
				Log.w(infos[0], info + " : " + infos[1] + infos[2]);
				break;
			case 5:
				Log.e(infos[0], info + " : " + infos[1] + infos[2]);
				break;
			}
		}
	}

	/**
	 * 获取打印信息所在方法名，行号等信息
	 * 
	 * @return
	 */
	private static String[] getAutoJumpLogInfos() {
		String[] infos = new String[] { "", "", "" };
		StackTraceElement[] elements = Thread.currentThread().getStackTrace();
		if (null == elements) {
			Log.e(TAG, "Stack is null");
			return infos;
		} else if (elements.length < 5) {
			Log.e(TAG, "Stack is too shallow!!!");
			return infos;
		} else {
			infos[0] = elements[4].getClassName().substring(
					elements[4].getClassName().lastIndexOf(".") + 1);
			infos[1] = elements[4].getMethodName() + "()";
			infos[2] = " at (" + elements[4].getClassName() + ".java:"
					+ elements[4].getLineNumber() + ")";
			return infos;
		}
	}
}
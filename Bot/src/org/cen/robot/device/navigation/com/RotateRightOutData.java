package org.cen.robot.device.navigation.com;

import org.cen.com.ComDataUtils;
import org.cen.com.documentation.DeviceDataSignature;
import org.cen.com.documentation.DeviceMethodSignature;
import org.cen.com.documentation.DeviceMethodType;
import org.cen.com.documentation.DeviceParameter;
import org.cen.com.documentation.DeviceParameterType;
import org.cen.com.out.OutData;
import org.cen.math.MathUtils;
import org.cen.robot.device.navigation.NavigationDevice;

/**
 * Corresponds to the data which is sent to the COM stream to rotate the robot.
 */
@DeviceDataSignature(deviceName = NavigationDevice.NAME, methods = { @DeviceMethodSignature(
		header = RotateRightOutData.HEADER,
		type = DeviceMethodType.INPUT,
		parameters = { @DeviceParameter(
				name = "right",
				length = 4,
				type = DeviceParameterType.SIGNED,
				unit = "angle in deciDeg"), }) })
public class RotateRightOutData extends OutData {

	public static final String HEADER = "r";

	/**
	 * The angle for rotation.
	 */
	protected double angleRad;

	/**
	 * Constructor with all arguments.
	 */
	public RotateRightOutData(double angleRad) {
		this.angleRad = angleRad;
	}

	@Override
	public String getArguments() {
		int deciDegree = (int) MathUtils.radToDeciDegree(angleRad);
		String argumentString = ComDataUtils.format(deciDegree, 4);

		return argumentString;
	}

	@Override
	public String getDebugString() {
		return "{angle=" + MathUtils.radToDeciDegree(angleRad) + "°}";
	}

	@Override
	public String getHeader() {
		return HEADER;
	}
}

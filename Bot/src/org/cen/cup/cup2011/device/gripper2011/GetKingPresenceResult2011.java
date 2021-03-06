package org.cen.cup.cup2011.device.gripper2011;

import org.cen.robot.device.RobotDeviceRequest;

public class GetKingPresenceResult2011 extends Gripper2011Result {
	private boolean pawnPresent;

	public GetKingPresenceResult2011(RobotDeviceRequest request, boolean pawnPresent) {
		super(request);
		this.pawnPresent = pawnPresent;
	}

	public boolean isPawnPresent() {
		return pawnPresent;
	}
}

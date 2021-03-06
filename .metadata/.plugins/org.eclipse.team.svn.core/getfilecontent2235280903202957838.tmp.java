package org.cen.robot.match.strategy;

import java.util.List;

import org.cen.navigation.Location;
import org.cen.util.Holder;

public interface INextGameStrategyItemComputer {
	public ITargetAction getNextTarget(double elapsedMatchTime, Location currentLocation, Holder<List<Location>> path);
}

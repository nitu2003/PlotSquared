/*
 *       _____  _       _    _____                                _
 *      |  __ \| |     | |  / ____|                              | |
 *      | |__) | | ___ | |_| (___   __ _ _   _  __ _ _ __ ___  __| |
 *      |  ___/| |/ _ \| __|\___ \ / _` | | | |/ _` | '__/ _ \/ _` |
 *      | |    | | (_) | |_ ____) | (_| | |_| | (_| | | |  __/ (_| |
 *      |_|    |_|\___/ \__|_____/ \__, |\__,_|\__,_|_|  \___|\__,_|
 *                                    | |
 *                                    |_|
 *            PlotSquared plot management system for Minecraft
 *               Copyright (C) 2014 - 2022 IntellectualSites
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.plotsquared.core.events;

import com.plotsquared.core.plot.Plot;
import com.plotsquared.core.plot.flag.PlotFlag;

/**
 * Called when a Flag is added to a plot.
 */
public class PlotFlagAddEvent extends PlotFlagEvent implements CancellablePlotEvent {

    private Result eventResult;

    /**
     * PlotFlagAddEvent: Called when a Flag is added to a plot.
     *
     * @param flag Flag that was added
     * @param plot Plot to which the flag was added
     */
    public PlotFlagAddEvent(PlotFlag<?, ?> flag, Plot plot) {
        super(plot, flag);
    }

    @Override
    public Result getEventResult() {
        return eventResult;
    }

    @Override
    public void setEventResult(Result e) {
        this.eventResult = e;
    }

}

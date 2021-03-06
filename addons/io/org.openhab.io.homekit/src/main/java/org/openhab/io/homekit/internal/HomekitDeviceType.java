/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.io.homekit.internal;

import java.util.HashMap;
import java.util.Map;

/**
 * Enum of the possible device types. The defined tag string can be used
 * as a homekit:{tag} tag on an item to enable it for Homekit.
 *
 * @author Andy Lintner
 */
public enum HomekitDeviceType {

    DIMMABLE_LIGHTBULB("DimmableLightbulb"),
    HUMIDITY_SENSOR("HumiditySensor"),
    LIGHTBULB("Lightbulb"),
    SWITCH("Switch"),
    TEMPERATURE_SENSOR("TemperatureSensor"),
    THERMOSTAT("Thermostat");

    private static final Map<String, HomekitDeviceType> tagMap = new HashMap<>();

    static {
        for (HomekitDeviceType type : HomekitDeviceType.values()) {
            tagMap.put(type.tag, type);
        }
    }

    private final String tag;

    private HomekitDeviceType(String tag) {
        this.tag = tag;
    }

    public static HomekitDeviceType valueOfTag(String tag) {
        return tagMap.get(tag);
    }
}

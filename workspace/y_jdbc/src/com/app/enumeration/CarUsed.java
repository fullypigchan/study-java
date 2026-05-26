package com.app.enumeration;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum CarUsed {
	NEW_CAR("새차"), OLD_CAR("중고");

	private final String value;
	private static final Map<String, CarUsed> CarUsed_MAP = Stream.of(CarUsed.values())
			.collect(Collectors.toMap(CarUsed::getValue, Function.identity()));

	private CarUsed(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return value;
	}

	public static CarUsed getEnum(String value) {
		return CarUsed_MAP.get(value);
	}
}

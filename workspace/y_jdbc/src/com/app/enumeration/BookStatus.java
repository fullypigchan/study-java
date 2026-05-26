package com.app.enumeration;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum BookStatus {

	AVAILABLE("판매중"), SOLDOUT("품절");


	private final String value;
	private static final Map<String, BookStatus> BookStatus_MAP = Stream.of(BookStatus.values())
			.collect(Collectors.toMap(BookStatus::getValue, Function.identity()));

	private BookStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static BookStatus getEnum(String value) {
		return BookStatus_MAP.get(value);
	}
}

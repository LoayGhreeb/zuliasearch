package io.zulia.testing.js.dto;

import java.util.List;

public class StatFacetValueObject {
	public String label;
	public long docCount;
	public long allDocCount;
	public long valueCount;
	public double sum;
	public double max;
	public double min;
	public List<PercentileValueObject> percentiles;
}
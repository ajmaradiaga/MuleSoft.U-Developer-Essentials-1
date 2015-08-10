package com.mulesoft.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class FlightSortTransformer extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		if (src instanceof ArrayList<?>){
			List<Flight> flightList = (ArrayList<Flight>) src;
			Collections.sort(flightList);
			return flightList;
		}
		else{
			return src;
		}

	}

}

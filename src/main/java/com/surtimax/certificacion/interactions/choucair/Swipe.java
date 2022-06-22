package com.surtimax.certificacion.interactions.choucair;

import com.surtimax.certificacion.interactions.builders.SwipeBuilderFrom;
import net.serenitybdd.screenplay.Actor;

public class Swipe {
	
	public static SwipeBuilderFrom as (Actor actor) {
		return new SwipeBuilderFrom(actor);
	}
}
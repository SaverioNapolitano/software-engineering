package com.saverionapolitano.designPatterns.factory.vehicle;

public interface PartsFactory {
	Body createBody();
	Engine createEngine();
	Interior createInterior();
}

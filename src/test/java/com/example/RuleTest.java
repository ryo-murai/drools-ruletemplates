package com.example;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RuleTest {
	private KieServices ks = KieServices.Factory.get();
	private KieContainer kContainer = ks.newKieClasspathContainer();

	@Test
	public void numRulesTest() {
		KieSession session = kContainer.newKieSession("ruletemplates");

		assertThat(session.getKieBase().getKiePackage("ruletemplates").getRules().size(), is(10000));
	}
}

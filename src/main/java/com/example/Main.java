package com.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {
	public static void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.newKieClasspathContainer();
		KieSession session = kContainer.newKieSession("ruletemplates");

		int numRules = session.getKieBase().getKiePackage("ruletemplates").getRules().size();
		System.out.println("num of rules:" + numRules);
	}

}

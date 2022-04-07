package bpmnchor;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import bpmnchor.infer.ConsoleMessage;
import bpmnchor.infer.InferDeploymentRequirements;
import bpmnchor.util.BpmnchorResourceFactoryImpl;

public class MainClass {

	public static void main(String[] args) {

		if (args.length < 2) {
			displaySyntax();
		} else {
			InferDeploymentRequirements infer = new InferDeploymentRequirements();

			// Create a resource set to hold the resources.
			//
			ResourceSet resourceSet = new ResourceSetImpl();

			// Register the appropriate resource factory to handle all file
			// extensions.
			//
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new BpmnchorResourceFactoryImpl());

			// Register the package to ensure it is available during loading.
			//
			resourceSet.getPackageRegistry().put(BpmnchorPackage.eNS_URI, BpmnchorPackage.eINSTANCE);

			Resource resource = resourceSet.getResource(URI.createURI(args[0]), true);

			List<ConsoleMessage> list = null;

			if (args[1].equals("trustful")) {
				list = infer.inferTrustful(resource);
			} else if (args[1].equals("trustless")) {
				list = infer.inferTrustless(resource);
			} else {
				displaySyntax();
			}

			if (list != null) {

				for (ConsoleMessage cm : list) {
					System.out.println(cm.toString());
				}
			}
		}
	}

	public static void displaySyntax() {
		System.out.println("Usage: java -jar xxx.jar URI {trustless|trustful}");
	}

}

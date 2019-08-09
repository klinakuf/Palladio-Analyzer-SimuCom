package de.uka.ipd.sdq.simucomframework.events;

import org.palladiosimulator.probeframework.measurement.RequestContext;

import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;


/**
 * @author Floriment Klinaku, Martina Rapp
 *
 * This class serves as a workaround in order to make event based simulation available 
 * to clients like SimuLizar. It currently reuses the concepts of SimuComSimProcess but disables the
 * blocking behavior of the original SimuComSimProcess. Therefore it only serves as a data container 
 * that is passed around without influencing the simulation itself. It was introduced to guarantee a backward
 * compatibility of process-based simulation. 
 */
public class EventBasedSimProcess extends SimuComSimProcess {

	public EventBasedSimProcess(final SimuComModel model, final RequestContext parentRequestContext, String name) {
		super(model, name, parentRequestContext, true);
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.simucomframework.SimuComSimProcess#internalLifeCycle()
	 * 
	 * 
	 */
	@Override
	protected void internalLifeCycle() {
		// Intentionally left blank. Event-based processes do not have an internal lifecycle method.
	}

}

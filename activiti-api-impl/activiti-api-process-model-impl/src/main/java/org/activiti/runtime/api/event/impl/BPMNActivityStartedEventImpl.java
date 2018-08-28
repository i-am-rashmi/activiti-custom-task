package org.activiti.runtime.api.event.impl;

import org.activiti.api.process.model.BPMNActivity;
import org.activiti.api.process.model.events.BPMNActivityEvent;
import org.activiti.api.process.model.events.BPMNActivityStartedEvent;

public class BPMNActivityStartedEventImpl extends BPMNActivityEventImpl implements BPMNActivityStartedEvent {

    public BPMNActivityStartedEventImpl() {
    }

    public BPMNActivityStartedEventImpl(BPMNActivity entity) {
        super(entity);
    }

    @Override
    public BPMNActivityEvent.ActivityEvents getEventType() {
        return BPMNActivityEvent.ActivityEvents.ACTIVITY_STARTED;
    }
}

package com.valtech.springframework.ocpp.client;

import eu.chargetime.ocpp.feature.profile.ClientRemoteTriggerHandler;
import eu.chargetime.ocpp.model.remotetrigger.TriggerMessageConfirmation;
import eu.chargetime.ocpp.model.remotetrigger.TriggerMessageRequest;

public interface ClientRemoteTriggerEventHandlerAdapter extends ClientRemoteTriggerHandler {

    /**
     * Handle a {@link TriggerMessageRequest}
     *
     * @param triggerMessageRequest {@link TriggerMessageRequest}, the received request
     * @return {@link TriggerMessageConfirmation}, defaults to null (unsupported operation)
     */
    default TriggerMessageConfirmation handleTriggerMessageRequest(TriggerMessageRequest triggerMessageRequest) {
        return null;
    }
}
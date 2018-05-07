package net.aikaka.javaboilerplates.microwebsocket.api;

import net.aikaka.javaboilerplates.core.entity.SampleEntity;
import net.aikaka.javaboilerplates.core.interactor.GetSamplesInteractor;
import net.aikaka.javaboilerplates.microwebsocket.dao.SampleMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GetSamplesApi {

    private final GetSamplesInteractor getSamplesInteractor;

    public GetSamplesApi(GetSamplesInteractor getSamplesInteractor) {
        this.getSamplesInteractor = getSamplesInteractor;
    }

    @MessageMapping("/api/v1/message/samples/all")
    @SendTo("/api/v1/to/samples/all")
    public List<SampleEntity> all() throws Exception{
        return getSamplesInteractor.all();
    }

    @MessageMapping("/api/v1/message/samples/name")
    @SendTo("/api/v1/to/samples/name")
    public List<SampleEntity> allByName(SampleMessage sampleMessage) throws Exception{
        return getSamplesInteractor.allByName(sampleMessage.getKeyword());
    }
}

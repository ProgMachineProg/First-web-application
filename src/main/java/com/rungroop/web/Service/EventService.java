package com.rungroop.web.Service;

import com.rungroop.web.dto.EventDto;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);
}

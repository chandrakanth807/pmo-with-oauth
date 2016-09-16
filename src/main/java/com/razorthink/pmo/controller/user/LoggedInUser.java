package com.razorthink.pmo.controller.user;

import com.razorthink.pmo.commons.exceptions.WebappException;
import com.razorthink.pmo.controller.AbstractWebappController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LoggedInUser extends AbstractWebappController{

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity getAggregateProjectReport() {
        try {
            String userName = getCurrentUser();
            return buildResponse( userName);
        } catch (WebappException e) {
            return buildErrorResponse(e);
        }
    }
}

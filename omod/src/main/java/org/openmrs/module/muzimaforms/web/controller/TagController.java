package org.openmrs.module.muzimaforms.web.controller;

import org.openmrs.api.context.Context;
import org.openmrs.module.muzimaforms.MuzimaFormTag;
import org.openmrs.module.muzimaforms.api.MuzimaTagService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping(value = "module/muzimaforms/tags.form")

public class TagController {
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<MuzimaFormTag> tags() {

        MuzimaTagService service = Context.getService(MuzimaTagService.class);
        return service.getAll();
    }

}

/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.muzimaforms.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "module/muzimaforms/manageforms.form")
public class ManageFormsController {

    /**
     * Logger for this class and subclasses
     */
    protected final Log log = LogFactory.getLog(getClass());

    /**
     * Success form view name
     */
    private final String SUCCESS_FORM_VIEW = "/module/muzimaforms/manageForms";

    /**
     * Initially called after the formBackingObject method to get the landing form name
     *
     * @return String form view name
     */
    @RequestMapping(method = RequestMethod.GET)
    public String showForm() {
        return SUCCESS_FORM_VIEW;
    }

}

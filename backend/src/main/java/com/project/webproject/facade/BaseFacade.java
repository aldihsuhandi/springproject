package com.project.webproject.facade;

import com.project.webproject.executor.ProcessorExecutor;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseFacade {
    @Autowired
    protected ProcessorExecutor processorExecutor;
}

package io.github.jhipster.gateway.cucumber.stepdefs;

import io.github.jhipster.gateway.JhipsterSampleGatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterSampleGatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

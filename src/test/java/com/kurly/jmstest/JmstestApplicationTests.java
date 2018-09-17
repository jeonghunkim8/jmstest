package com.kurly.jmstest;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JmstestApplicationTests {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Autowired
    private Producer producer;

    @Test
    public void sendSimpleMessage() throws InterruptedException {

        //given
        KurlyMessage msg = new KurlyMessage();
        msg.setId("1");
        msg.setName("a message from JH");

        //when
        producer.send(msg);


        //then
        Thread.sleep(1000L);
        assertThat(outputCapture.toString().contains("1, a message from JH")).isTrue();
    }

}

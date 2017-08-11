/**
 * 
 */
package com.nttdata.techpro.template;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

/**
 * @author 100351
 *
 */
public class VelocityTemplate extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:///D:/MyFolder/Tech-Pro/Jboss Fuse/Dev/InvalidFiles?noop=true&charset=UTF-8")
			.setHeader("firstName", constant("Ganesh"))
			.setHeader("from", constant("apache.camel@abc.com"))
			.setHeader("to", constant("ganesh.nikat@abc.com"))
			.setHeader("subject", constant("[Camel]:Camel Excercise solution"))
			.setHeader("contentType", constant("text/plain;charset=UTF-8"))
			.process(new Processor() {
			    public void process(Exchange exchange) throws Exception {
			        String payload = exchange.getIn().getBody(String.class);
			        exchange.getIn().setBody(payload.concat("Please use FakeSMTP Server to configure mail locally"));
			   }
			})
			.log("Message sent to template: ${body}")
			.to("velocity:ResponseTemplate.vm?contentCache=true")
			.to("smtp://localhost:25");
	}
}

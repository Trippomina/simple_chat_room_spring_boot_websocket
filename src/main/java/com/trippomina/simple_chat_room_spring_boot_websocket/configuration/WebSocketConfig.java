package com.trippomina.simple_chat_room_spring_boot_websocket.configuration;

import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{
		@Override
		public void configureMessageBroker(MessageBrokerRegistry registry) {
			registry.enableSimpleBroker("/topic");
			registry.setApplicationDestinationPrefixes("ws");
		}
		
		@Override
		public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/our-websocket");
		}
}


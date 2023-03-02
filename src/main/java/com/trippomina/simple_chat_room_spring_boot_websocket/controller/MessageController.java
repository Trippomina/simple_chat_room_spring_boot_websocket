package com.trippomina.simple_chat_room_spring_boot_websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.trippomina.simple_chat_room_spring_boot_websocket.model.Message;
import com.trippomina.simple_chat_room_spring_boot_websocket.model.ResponseMessage;

@Controller
public class MessageController {
	
	@MessageMapping("message")//ws/message
	@SendTo("topic/messages")//topic/messages
	public ResponseMessage getMessage(final Message message) {
		return new ResponseMessage(message.getMessageContent());
	}
}

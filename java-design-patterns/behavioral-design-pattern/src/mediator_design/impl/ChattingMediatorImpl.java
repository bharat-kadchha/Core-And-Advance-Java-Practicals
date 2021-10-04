package mediator_design.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mediator_design.mediator.ChattingMediator;
import mediator_design.mediator.User;


//concrete implementation of mediator.
public class ChattingMediatorImpl implements ChattingMediator {

	private List<User> userList;
	
	
	public ChattingMediatorImpl() {
		this.userList = new ArrayList<User>();
	}

	@Override
	public void sendMessage(String message, User user) {
		List<User> currentUser = userList.stream().filter(x->!x.getUserName().equalsIgnoreCase(user.getUserName())).collect(Collectors.toList());
		for(User reciver : currentUser) {
			reciver.receiveMessage(message);
		}
	}

	@Override
	public void addUser(User user) {
		userList.add(user);
	}

}

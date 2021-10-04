package mediator_design;

import mediator_design.impl.ChattingMediatorImpl;
import mediator_design.impl.UserImpl;
import mediator_design.mediator.ChattingMediator;
import mediator_design.mediator.User;

public class ClientClass {
	public static void main(String[] args) {

		ChattingMediator chattingMediator = new ChattingMediatorImpl();
		User user1 = new UserImpl(chattingMediator, "A");
		User user2 = new UserImpl(chattingMediator, "B");
		User user3 = new UserImpl(chattingMediator, "C");
		User user4 = new UserImpl(chattingMediator, "D");

		chattingMediator.addUser(user1);
		chattingMediator.addUser(user2);
		chattingMediator.addUser(user3);
		chattingMediator.addUser(user4);

		user2.sendMessage("Hi,All");

	}
}

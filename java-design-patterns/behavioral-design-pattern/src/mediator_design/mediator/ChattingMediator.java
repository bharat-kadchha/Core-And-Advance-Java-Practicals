package mediator_design.mediator;

public interface ChattingMediator {

	void sendMessage(String message, User user);

	void addUser(User user);

}

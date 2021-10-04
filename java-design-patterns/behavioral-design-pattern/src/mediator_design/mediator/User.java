package mediator_design.mediator;

public abstract class User {

	private ChattingMediator chattingMediator;
	private String userName;

	public User(ChattingMediator chattingMediator, String userName) {
		this.chattingMediator = chattingMediator;
		this.userName = userName;
	}

	public ChattingMediator getChattingMediator() {
		return chattingMediator;
	}

	public String getUserName() {
		return userName;
	}

	public abstract void sendMessage(String message);

	public abstract void receiveMessage(String message);

}

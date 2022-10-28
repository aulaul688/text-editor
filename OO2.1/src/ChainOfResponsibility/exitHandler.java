package ChainOfResponsibility;

import javax.swing.JTextArea;

import Form.GUIfacade;


public class exitHandler extends fileHandler{
	public exitHandler(fileHandler next) {
		super(next);
	}

	@Override
	public void run(String state,JTextArea t,GUIfacade j) {
		if(state=="done"||state== "yes") {
			System.exit(0);

		}

	}
}

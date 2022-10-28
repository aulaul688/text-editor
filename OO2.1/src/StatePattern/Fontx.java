package StatePattern;

import java.awt.event.ActionEvent;

public class Fontx {

    // These are all the status that font might need.
    private State ArialState;
    private State ImpactState;
    private State CaveatState;

    // We need to set the initial state, just like a default.
    private State mState = ArialState;
    private String fontname = "Impact";
    private String fontname2 = "Caveat";

    public Fontx(String TypeOfFont)
    {
        // Create all the state's entities
        ArialState = new ArialState(this);
        ImpactState = new ImpactState(this);
        CaveatState = new CaveatState(this);            
        fontname = TypeOfFont;

        if(fontname != fontname2)
        {
            mState = ImpactState;
        }
        else{
            mState = CaveatState;
        }
    }

    public void arialActionPerformed(ActionEvent e){
        mState.arialActionPerformed(e);
    }

    public void impactActionPerformed(ActionEvent e){
        mState.impactActionPerformed(e);
    }

    public void caveatActionPerformed(ActionEvent e){
        mState.caveatActionPerformed(e);
    }

    public void setState(State state){
        mState = state;
    }

    public State getState(){
		return mState;
	}
    
}
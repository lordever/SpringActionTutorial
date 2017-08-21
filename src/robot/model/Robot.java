package robot.model;

import robot.interfaces.Body;
import robot.interfaces.Hand;
import robot.interfaces.Voice;

public class Robot {
    private Hand hand;
    private Body body;
    private Voice voice;

    public Robot(Hand hand, Body body, Voice voice) {
        this.hand = hand;
        this.body = body;
        this.voice = voice;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Voice getVoice() {
        return voice;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "hand=" + hand +
                ", body=" + body +
                ", voice=" + voice +
                '}';
    }
}

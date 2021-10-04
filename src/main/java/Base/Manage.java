package Base;

import Actions.Click;
import Actions.Update;
import Actions.Verify;
import Actions.Wait;

public class Manage extends BaseFunctions{

    public Wait wait;
    public Update update;
    public Click click;
    public Verify verify;

    public Manage() {
        this.wait = new Wait();
        this.update = new Update();
        this.click = new Click();
        this.verify = new Verify();
    }
}
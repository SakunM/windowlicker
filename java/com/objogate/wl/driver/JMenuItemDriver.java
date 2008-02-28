package com.objogate.wl.driver;

import javax.swing.JMenuItem;
import java.awt.Component;
import org.hamcrest.Matcher;
import static com.objogate.wl.gesture.Gestures.BUTTON1;
import static com.objogate.wl.gesture.Gestures.clickMouseButton;
import com.objogate.wl.gesture.HorizontalThenVerticalMouseMoveGesture;

public class JMenuItemDriver extends AbstractButtonDriver<JMenuItem>{
    public JMenuItemDriver(ComponentDriver<? extends Component> parentOrOwner, Matcher<? super JMenuItem> matcher) {
        super(parentOrOwner, JMenuItem.class, matcher);
    }

     public void leftClickOnComponent() {
        isShowingOnScreen();
        performGesture(new HorizontalThenVerticalMouseMoveGesture(centerOfComponent()), clickMouseButton(BUTTON1));
    }
}
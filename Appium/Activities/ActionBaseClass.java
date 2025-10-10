package activities;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.PointerInput.MouseButton;

import io.appium.java_client.AppiumDriver;

public class ActionBaseClass {

    private final static PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

    public static void doSwipe(AppiumDriver driver, Point start, Point end, int durationMillis) {
        Sequence swipe = new Sequence(finger, 1)
            .addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), start.getX(), start.getY()))
            .addAction(finger.createPointerDown(MouseButton.LEFT.asArg()))
            .addAction(finger.createPointerMove(Duration.ofMillis(durationMillis), Origin.viewport(), end.getX(), end.getY()))
            .addAction(finger.createPointerUp(MouseButton.LEFT.asArg()));

        driver.perform(Arrays.asList(swipe));
    }
}

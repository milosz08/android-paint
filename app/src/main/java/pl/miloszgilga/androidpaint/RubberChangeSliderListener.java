package pl.miloszgilga.androidpaint;

import android.widget.TextView;
import java.util.function.Function;
import com.google.android.material.slider.Slider;

class RubberChangeSliderListener extends AbstractSliderChangeListener implements Slider.OnChangeListener {

    public static final int DEF_RUBBER_SIZE = 10;
    public static final int MAX_RUBBER_SIZE = 200;

    private final Function<Integer, String> rubberLabelText = v ->
            String.format("Wielkość gumki: %d z %d", v, MAX_RUBBER_SIZE);

    RubberChangeSliderListener(TextView textView, CanvasSettingsDto settingsDto) {
        super(textView, settingsDto);
        textView.setText(rubberLabelText.apply(settingsDto.getRubberSize()));
    }

    @Override
    public void onValueChange(Slider slider, float value, boolean fromUser) {
        textView.setText(rubberLabelText.apply((int)value));
        settingsDto.setRubberSize((int)value);
    }
}

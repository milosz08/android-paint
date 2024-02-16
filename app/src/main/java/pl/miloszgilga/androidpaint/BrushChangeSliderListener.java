package pl.miloszgilga.androidpaint;

import android.widget.TextView;

import com.google.android.material.slider.Slider;

import java.util.function.Function;

class BrushChangeSliderListener extends AbstractSliderChangeListener implements Slider.OnChangeListener {

    static final float DEF_BRUSH_WIDTH = 10f;
    static final float MAX_BRUSH_WIDTH = 50f;

    final Function<Float, String> brushLabelText = v ->
            String.format("Szerokość pędzla: %.1f z %.1f", v, MAX_BRUSH_WIDTH);

    BrushChangeSliderListener(TextView textView, CanvasSettingsDto settingsDto) {
        super(textView, settingsDto);
        textView.setText(brushLabelText.apply(settingsDto.getBrushSize()));
    }

    @Override
    public void onValueChange(Slider slider, float value, boolean fromUser) {
        textView.setText(brushLabelText.apply(value));
        settingsDto.setBrushSize(value);
    }
}

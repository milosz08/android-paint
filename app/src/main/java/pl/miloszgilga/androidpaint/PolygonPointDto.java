package pl.miloszgilga.androidpaint;

import android.graphics.Path;
import android.graphics.Paint;

class PolygonPointDto {
    private final Path path;
    private final Paint paint;

    PolygonPointDto(Path path, Paint paint) {
        this.path = path;
        this.paint = paint;
    }

    Path getPath() {
        return path;
    }

    Paint getPaint() {
        return paint;
    }
}

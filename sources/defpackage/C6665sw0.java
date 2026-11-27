package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: sw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6665sw0 extends Property<ImageView, Matrix> {
    public final Matrix a;

    public C6665sw0() {
        super(Matrix.class, "imageMatrixProperty");
        this.a = new Matrix();
    }

    @Override // android.util.Property
    @NonNull
    public final Matrix get(@NonNull ImageView imageView) {
        Matrix matrix = this.a;
        matrix.set(imageView.getImageMatrix());
        return matrix;
    }

    @Override // android.util.Property
    public final void set(@NonNull ImageView imageView, @NonNull Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}

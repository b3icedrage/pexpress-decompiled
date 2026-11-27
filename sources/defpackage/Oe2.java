package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class Oe2 extends C3057c {
    public static boolean k = true;
    public static boolean l = true;
    public static boolean m = true;

    @SuppressLint({"NewApi"})
    public void s(@NonNull View view, int i, int i2, int i3, int i4) {
        if (m) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void t(@NonNull View view, @NonNull Matrix matrix) {
        if (k) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void u(@NonNull View view, @NonNull Matrix matrix) {
        if (l) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }
}

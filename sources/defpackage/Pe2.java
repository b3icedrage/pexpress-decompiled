package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class Pe2 extends Oe2 {
    public static boolean n = true;

    @Override // defpackage.C3057c
    @SuppressLint({"NewApi"})
    public void q(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.q(view, i);
        } else if (n) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                n = false;
            }
        }
    }
}

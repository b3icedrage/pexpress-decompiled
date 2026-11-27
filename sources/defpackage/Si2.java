package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class Si2 {

    public static class a {
        public static void a(@NonNull Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static void a(@NonNull Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}

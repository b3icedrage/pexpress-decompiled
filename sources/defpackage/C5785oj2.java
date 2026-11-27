package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: oj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5785oj2 extends C6561sS {
    public final WindowInsetsController b;
    public final Window c;

    public C5785oj2(@NonNull Window window) {
        WindowInsetsController insetsController = window.getInsetsController();
        new C2703aM1();
        this.b = insetsController;
        this.c = window;
    }

    @Override // defpackage.C6561sS
    public final boolean j() {
        this.b.setSystemBarsAppearance(0, 0);
        return (this.b.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.C6561sS
    public final void q(boolean z) {
        Window window = this.c;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.b.setSystemBarsAppearance(0, 16);
    }

    @Override // defpackage.C6561sS
    public final void r(boolean z) {
        Window window = this.c;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.b.setSystemBarsAppearance(0, 8);
    }
}

package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: mj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5365mj2 extends C5152lj2 {
    @Override // defpackage.C6561sS
    public final boolean j() {
        return (this.b.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // defpackage.C6561sS
    public final void r(boolean z) {
        Window window = this.b;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}

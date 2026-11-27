package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: nj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5575nj2 extends C5365mj2 {
    @Override // defpackage.C6561sS
    public final void q(boolean z) {
        Window window = this.b;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}

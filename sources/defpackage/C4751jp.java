package defpackage;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4751jp {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public C4751jp(@NotNull BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        C3817fd c3817fd = C3817fd.a;
        float fD = c3817fd.d(backEvent);
        float fE = c3817fd.e(backEvent);
        float fB = c3817fd.b(backEvent);
        int iC = c3817fd.c(backEvent);
        this.a = fD;
        this.b = fE;
        this.c = fB;
        this.d = iC;
    }

    @NotNull
    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}

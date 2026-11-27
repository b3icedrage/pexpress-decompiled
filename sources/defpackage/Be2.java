package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class Be2 implements Interpolator {
    public final /* synthetic */ C3079c50 a;

    public Be2(C3079c50 c3079c50) {
        this.a = c3079c50;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.a.a(f);
    }
}

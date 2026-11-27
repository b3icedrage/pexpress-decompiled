package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1739Pb extends Animatable2.AnimationCallback {
    public final /* synthetic */ InterfaceC1817Qb.a a;

    public C1739Pb(InterfaceC1817Qb.a aVar) {
        this.a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.a.b(drawable);
    }
}

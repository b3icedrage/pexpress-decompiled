package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.b;

/* JADX INFO: renamed from: of0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC5767of0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ b d;

    public ViewTreeObserverOnPreDrawListenerC5767of0(b bVar) {
        this.d = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        b bVar = this.d;
        float rotation = bVar.v.getRotation();
        if (bVar.o == rotation) {
            return true;
        }
        bVar.o = rotation;
        bVar.p();
        return true;
    }
}

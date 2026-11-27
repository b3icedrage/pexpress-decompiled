package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: renamed from: Zl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2580Zl0 implements InterfaceC1088Gs1<Drawable> {
    public final /* synthetic */ Handler d;
    public final /* synthetic */ C4195hQ e;

    public C2580Zl0(Handler handler, C4195hQ c4195hQ) {
        this.d = handler;
        this.e = c4195hQ;
    }

    @Override // defpackage.InterfaceC1088Gs1
    public final /* bridge */ /* synthetic */ boolean c(Object obj, InterfaceC5529nX1 interfaceC5529nX1) {
        return false;
    }

    @Override // defpackage.InterfaceC1088Gs1
    public final boolean g(C2160Ul0 c2160Ul0, InterfaceC5529nX1 interfaceC5529nX1) {
        this.d.post(new RunnableC2502Yl0());
        return true;
    }
}

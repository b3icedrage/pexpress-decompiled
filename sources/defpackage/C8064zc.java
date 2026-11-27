package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.Unit;

/* JADX INFO: renamed from: zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8064zc extends InterfaceC1817Qb.a {
    public final /* synthetic */ InterfaceC1817Qb b;
    public final /* synthetic */ C6251qy c;

    public C8064zc(InterfaceC1817Qb interfaceC1817Qb, C6251qy c6251qy) {
        this.b = interfaceC1817Qb;
        this.c = c6251qy;
    }

    @Override // defpackage.InterfaceC1817Qb.a
    public final void a(Drawable drawable) {
        this.b.a();
        C6251qy c6251qy = this.c;
        Unit unit = Unit.a;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            c6251qy.resumeWith(unit);
        } catch (IllegalStateException unused) {
        }
    }
}

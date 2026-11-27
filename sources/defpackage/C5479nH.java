package defpackage;

import android.os.Trace;
import io.sentry.android.core.internal.gestures.e;

/* JADX INFO: renamed from: nH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5479nH implements InterfaceC5056lH, KD1.c {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C5479nH(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    @Override // KD1.c
    public void a(InterfaceC4302hv0 interfaceC4302hv0) {
        if (interfaceC4302hv0 == ((e) this.d).i) {
            ((InterfaceC1015Fu0) this.e).u();
        }
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        String str = (String) this.d;
        UG ug = (UG) this.e;
        try {
            Trace.beginSection(str);
            return ug.f.c(c1480Lt1);
        } finally {
            Trace.endSection();
        }
    }
}

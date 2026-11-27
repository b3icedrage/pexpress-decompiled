package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6768tR extends WP0 {
    @Override // defpackage.FA
    public final void b() {
        if (this.i == null) {
            return;
        }
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        Iterator it = l().iterator();
        while (it.hasNext()) {
            c((InterfaceC3876ft0) it.next());
        }
        float f = this.a;
        this.e = f;
        float f2 = this.b;
        this.f = f2;
        this.g = f;
        this.h = f2;
    }

    @Override // defpackage.FA
    public final void d(float f, float f2) {
        Iterator it = l().iterator();
        while (it.hasNext()) {
            ((InterfaceC3876ft0) it.next()).J(f, f2);
        }
        b();
    }

    public final ArrayList l() {
        ArrayList mDataSets = this.i;
        Intrinsics.checkNotNullExpressionValue(mDataSets, "mDataSets");
        ArrayList arrayList = new ArrayList();
        for (Object obj : mDataSets) {
            if (!Intrinsics.a(((InterfaceC3876ft0) obj).a(), "END")) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            mDataSets = arrayList;
        }
        Intrinsics.checkNotNullExpressionValue(mDataSets, "ifEmpty(...)");
        return mDataSets;
    }
}

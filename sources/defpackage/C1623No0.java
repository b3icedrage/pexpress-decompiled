package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: No0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1623No0 extends ML0 implements Function1<C2013So0, C2013So0> {
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ C1465Lo0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1623No0(long j, String str, C1465Lo0 c1465Lo0) {
        super(1);
        this.d = j;
        this.e = str;
        this.g = c1465Lo0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2013So0 invoke(C2013So0 c2013So0) {
        C2013So0 state = c2013So0;
        Intrinsics.checkNotNullParameter(state, "state");
        List<C0997Fo0> list = state.a;
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        for (C0997Fo0 c0997Fo0A : list) {
            long j = c0997Fo0A.f;
            long j2 = this.d;
            C1465Lo0 c1465Lo0 = this.g;
            if (j == j2) {
                c0997Fo0A = C0997Fo0.a(c0997Fo0A, this.e, null, null, TZ0.a.a, 14);
                c1465Lo0.h.put(Long.valueOf(c0997Fo0A.f), c0997Fo0A);
            } else {
                if (Intrinsics.a(c0997Fo0A.e, TZ0.d.a) && c0997Fo0A.f <= j2) {
                    c0997Fo0A = C0997Fo0.a(c0997Fo0A, null, null, null, TZ0.a.a, 15);
                    c1465Lo0.h.put(Long.valueOf(c0997Fo0A.f), c0997Fo0A);
                }
            }
            arrayList.add(c0997Fo0A);
        }
        return C2013So0.a(state, arrayList, false, 0L, 6);
    }
}

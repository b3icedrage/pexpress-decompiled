package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements InterfaceC2699aL0.c {
    public final /* synthetic */ J<Object, J.a<Object>> a;
    public final /* synthetic */ ArrayList<Object> b;

    public K(J<Object, J.a<Object>> j, ArrayList<Object> arrayList) {
        this.a = j;
        this.b = arrayList;
    }

    @Override // defpackage.InterfaceC2699aL0.c
    public final InterfaceC2699aL0.a b(QC classId, C4285hp1 source) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(source, "source");
        return this.a.q(classId, source, this.b);
    }

    @Override // defpackage.InterfaceC2699aL0.c
    public final void a() {
    }
}

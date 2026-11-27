package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6113qI0 extends C2943bS.a<FC, C5693oI0.a> {
    public final /* synthetic */ String a;
    public final /* synthetic */ C3027bp1<C5693oI0.a> b;

    public C6113qI0(String str, C3027bp1<C5693oI0.a> c3027bp1) {
        this.a = str;
        this.b = c3027bp1;
    }

    @Override // defpackage.C2943bS.c
    public final Object a() {
        C5693oI0.a aVar = this.b.d;
        return aVar == null ? C5693oI0.a.h : aVar;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [T, oI0$a] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, oI0$a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, oI0$a] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, oI0$a] */
    @Override // defpackage.C2943bS.c
    public final boolean c(Object obj) {
        FC javaClassDescriptor = (FC) obj;
        Intrinsics.checkNotNullParameter(javaClassDescriptor, "javaClassDescriptor");
        String strH = Nm2.h(javaClassDescriptor, this.a);
        boolean zContains = C6742tI0.b.contains(strH);
        C3027bp1<C5693oI0.a> c3027bp1 = this.b;
        if (zContains) {
            c3027bp1.d = C5693oI0.a.d;
        } else if (C6742tI0.d.contains(strH)) {
            c3027bp1.d = C5693oI0.a.e;
        } else if (C6742tI0.c.contains(strH)) {
            c3027bp1.d = C5693oI0.a.g;
        } else if (C6742tI0.a.contains(strH)) {
            c3027bp1.d = C5693oI0.a.i;
        }
        return c3027bp1.d == null;
    }
}

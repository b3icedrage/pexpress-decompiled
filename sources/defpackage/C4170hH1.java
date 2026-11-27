package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4170hH1 implements Function2 {
    public final /* synthetic */ long d;
    public final /* synthetic */ C2590Zo1 e;

    public /* synthetic */ C4170hH1(long j, C2590Zo1 c2590Zo1) {
        this.d = j;
        this.e = c2590Zo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6530sH1.a aVar = (C6530sH1.a) obj2;
        Intrinsics.checkNotNullParameter((String) obj, "<unused var>");
        long j = this.d;
        if (aVar != null) {
            long j2 = aVar.a;
            if (j - j2 < 5000) {
                return new C6530sH1.a(aVar.b + 1, j2);
            }
        }
        this.e.d = aVar != null ? aVar.b : 0;
        return new C6530sH1.a(0, j);
    }
}

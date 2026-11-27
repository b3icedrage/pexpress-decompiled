package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8014zM implements Function0 {
    public final LO0 d;
    public final InterfaceC2396Xc e;

    public C8014zM(LO0 lo0, InterfaceC2396Xc interfaceC2396Xc) {
        this.d = lo0;
        this.e = interfaceC2396Xc;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LO0 lo0 = this.d;
        Intrinsics.checkNotNullParameter(lo0, "<this>");
        InterfaceC2396Xc additionalAnnotations = this.e;
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        KE0 ke0 = lo0.a;
        return ke0.q.b((C3114cF0) lo0.d.getValue(), additionalAnnotations);
    }
}

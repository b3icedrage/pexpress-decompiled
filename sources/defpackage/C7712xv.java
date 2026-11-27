package defpackage;

import java.io.InputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7712xv extends C2574Zj0 implements Function1<String, InputStream> {
    @Override // defpackage.AbstractC1568Mx, defpackage.JI0
    public final String getName() {
        return "loadResource";
    }

    @Override // kotlin.jvm.functions.Function1
    public final InputStream invoke(String str) {
        String p0 = str;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((C0783Cv) this.e).getClass();
        return C0783Cv.a(p0);
    }

    @Override // defpackage.AbstractC1568Mx
    public final InterfaceC5486nJ0 j() {
        return C2017Sp1.a.b(C0783Cv.class);
    }

    @Override // defpackage.AbstractC1568Mx
    public final String o() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }
}

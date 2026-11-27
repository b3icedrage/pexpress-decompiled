package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class K72 implements RJ0<G72> {

    @NotNull
    public static final K72 a = new K72();

    @NotNull
    public static final C6508sA0 b;

    static {
        Intrinsics.checkNotNullParameter(C0786Cw.a, "<this>");
        b = C0957Fb.b(C1176Hw.a, "kotlin.UByte");
    }

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        byte b2 = ((G72) obj).d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.m(b).k(b2);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new G72(decoder.q(b).z());
    }
}

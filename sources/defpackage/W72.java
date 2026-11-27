package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class W72 implements RJ0<S72> {

    @NotNull
    public static final W72 a = new W72();

    @NotNull
    public static final C6508sA0 b;

    static {
        Intrinsics.checkNotNullParameter(CT0.a, "<this>");
        b = C0957Fb.b(GT0.a, "kotlin.ULong");
    }

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        long j = ((S72) obj).d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.m(b).z(j);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new S72(decoder.q(b).v());
    }
}

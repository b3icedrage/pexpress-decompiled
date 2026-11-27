package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Q72 implements RJ0<M72> {

    @NotNull
    public static final Q72 a = new Q72();

    @NotNull
    public static final C6508sA0 b;

    static {
        Intrinsics.checkNotNullParameter(BB0.a, "<this>");
        b = C0957Fb.b(EB0.a, "kotlin.UInt");
    }

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        int i = ((M72) obj).d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.m(b).y(i);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new M72(decoder.q(b).o());
    }
}

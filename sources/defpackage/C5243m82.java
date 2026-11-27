package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: m82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5243m82 implements RJ0<C4352i82> {

    @NotNull
    public static final C5243m82 a = new C5243m82();

    @NotNull
    public static final C6508sA0 b;

    static {
        Intrinsics.checkNotNullParameter(OK1.a, "<this>");
        b = C0957Fb.b(PK1.a, "kotlin.UShort");
    }

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        short s = ((C4352i82) obj).d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.m(b).h(s);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new C4352i82(decoder.q(b).A());
    }
}

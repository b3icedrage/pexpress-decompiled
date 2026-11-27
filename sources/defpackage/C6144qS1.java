package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6144qS1 implements RJ0<String> {

    @NotNull
    public static final C6144qS1 a = new C6144qS1();

    @NotNull
    public static final C5986ph1 b = new C5986ph1("kotlin.String", AbstractC5356mh1.i.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        String value = (String) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.B(value);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.t();
    }
}

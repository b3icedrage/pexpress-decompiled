package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0933Et implements RJ0<Boolean> {

    @NotNull
    public static final C0933Et a = new C0933Et();

    @NotNull
    public static final C5986ph1 b = new C5986ph1("kotlin.Boolean", AbstractC5356mh1.a.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.l(zBooleanValue);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.f());
    }
}

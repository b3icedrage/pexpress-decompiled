package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class J82 implements RJ0<Unit> {

    @NotNull
    public static final J82 b = new J82();
    public final /* synthetic */ T71<Unit> a = new T71<>(Unit.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        Unit value = (Unit) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.a(encoder, value);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return this.a.c();
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.a.d(decoder);
        return Unit.a;
    }
}

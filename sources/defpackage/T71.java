package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class T71<T> implements RJ0<T> {

    @NotNull
    public final Unit a;

    @NotNull
    public final C5653o60 b;

    @NotNull
    public final Object c;

    public T71(@NotNull Unit objectInstance) {
        Intrinsics.checkNotNullParameter("kotlin.Unit", "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.a = objectInstance;
        this.b = C5653o60.d;
        this.c = XO0.a(EnumC4403iP0.d, new S71(this));
    }

    @Override // defpackage.RJ0
    public final void a(@NotNull C3783fS1 encoder, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.c(c()).b(c());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return (MH1) this.c.getValue();
    }

    @Override // defpackage.RJ0
    @NotNull
    public final T d(@NotNull InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        MH1 mh1C = c();
        EH ehC = decoder.c(mh1C);
        int iH = ehC.h(c());
        if (iH != -1) {
            throw new ZH1(EK.e(iH, "Unexpected index "));
        }
        Unit unit = Unit.a;
        ehC.b(mh1C);
        return (T) this.a;
    }
}

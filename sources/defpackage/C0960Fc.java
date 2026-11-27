package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0960Fc extends B<InterfaceC1583Nc> implements InterfaceC0882Ec<InterfaceC1583Nc, CK<?>> {

    @NotNull
    public final C1820Qc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0960Fc(@NotNull S01 module, @NotNull G51 notFoundClasses, @NotNull C6661sv protocol) {
        super(protocol);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.b = new C1820Qc(module, notFoundClasses);
    }

    @Override // defpackage.InterfaceC0882Ec
    public final CK<?> a(AbstractC6208qk1 container, C3637ek1 proto, AbstractC4649jL0 expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return null;
    }

    @Override // defpackage.InterfaceC0882Ec
    public final CK<?> d(AbstractC6208qk1 container, C3637ek1 proto, AbstractC4649jL0 expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        C1999Sj1.b.c cVar = (C1999Sj1.b.c) C5998pk1.a(proto, this.a.i);
        if (cVar == null) {
            return null;
        }
        return this.b.c(expectedType, cVar, container.a);
    }

    public final C1664Oc l(C1999Sj1 proto, InterfaceC5848p21 nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        return this.b.a(proto, nameResolver);
    }
}

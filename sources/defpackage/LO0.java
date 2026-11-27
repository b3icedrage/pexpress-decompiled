package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class LO0 {

    @NotNull
    public final KE0 a;

    @NotNull
    public final L62 b;

    @NotNull
    public final Object c;

    @NotNull
    public final Object d;

    @NotNull
    public final C3533eF0 e;

    public LO0(@NotNull KE0 components, @NotNull L62 typeParameterResolver, @NotNull InterfaceC3770fO0<C3114cF0> delegateForDefaultTypeQualifiers) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.a = components;
        this.b = typeParameterResolver;
        this.c = delegateForDefaultTypeQualifiers;
        this.d = delegateForDefaultTypeQualifiers;
        this.e = new C3533eF0(this, typeParameterResolver);
    }
}

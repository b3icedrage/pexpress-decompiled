package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I<A, C> extends J<A, C2474Yc<? extends A, ? extends C>> implements InterfaceC0882Ec<A, C> {

    @NotNull
    public final UY0<InterfaceC2699aL0, C2474Yc<A, C>> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(@NotNull C2720aS0 storageManager, @NotNull C1705Op1 kotlinClassFinder) {
        super(kotlinClassFinder);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.b = storageManager.e(new E(this, 0));
    }

    @Override // defpackage.InterfaceC0882Ec
    @Nullable
    public final C a(@NotNull AbstractC6208qk1 container, @NotNull C3637ek1 proto, @NotNull AbstractC4649jL0 expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return s(container, proto, EnumC0804Dc.g, expectedType, F.d);
    }

    @Override // defpackage.InterfaceC0882Ec
    @Nullable
    public final C d(@NotNull AbstractC6208qk1 container, @NotNull C3637ek1 proto, @NotNull AbstractC4649jL0 expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return s(container, proto, EnumC0804Dc.e, expectedType, G.d);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    public final C s(AbstractC6208qk1 container, C3637ek1 c3637ek1, EnumC0804Dc enumC0804Dc, AbstractC4649jL0 abstractC4649jL0, Function2<? super C2474Yc<? extends A, ? extends C>, ? super TY0, ? extends C> function2) {
        C constant;
        InterfaceC2699aL0 interfaceC2699aL0A = J.b.a(container, true, true, C2061Te0.B.c(c3637ek1.h), GI0.d(c3637ek1), this.a, ((C4760js) this).f);
        Intrinsics.checkNotNullParameter(container, "container");
        if (interfaceC2699aL0A == null) {
            if (container instanceof AbstractC6208qk1.a) {
                VN1 vn1 = ((AbstractC6208qk1.a) container).c;
                C3132cL0 c3132cL0 = vn1 instanceof C3132cL0 ? (C3132cL0) vn1 : null;
                if (c3132cL0 != null) {
                    interfaceC2699aL0A = c3132cL0.b;
                } else {
                    interfaceC2699aL0A = null;
                }
            } else {
                interfaceC2699aL0A = null;
            }
        }
        if (interfaceC2699aL0A != null) {
            C7793yI0 c7793yI0 = interfaceC2699aL0A.a().b;
            C7793yI0 version = PZ.e;
            Intrinsics.checkNotNullParameter(version, "version");
            TY0 ty0N = J.n(c3637ek1, container.a, container.b, enumC0804Dc, c7793yI0.a(version.b, version.c, version.d));
            if (ty0N != null && (constant = function2.invoke((Object) ((C2720aS0.k) this.b).invoke(interfaceC2699aL0A), ty0N)) != null) {
                if (C7977z92.a(abstractC4649jL0)) {
                    constant = (C) ((CK) constant);
                    Intrinsics.checkNotNullParameter(constant, "constant");
                    if (constant instanceof C1880Qw) {
                        return (C) new L72(((Number) ((C1880Qw) constant).a).byteValue());
                    }
                    if (constant instanceof QK1) {
                        return (C) new C5453n82(((Number) ((QK1) constant).a).shortValue());
                    }
                    if (constant instanceof FB0) {
                        return (C) new R72(((Number) ((FB0) constant).a).intValue());
                    }
                    if (constant instanceof IT0) {
                        return (C) new X72(((Number) ((IT0) constant).a).longValue());
                    }
                }
                return (C) constant;
            }
        }
        return null;
    }
}

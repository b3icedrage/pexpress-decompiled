package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CJ0<D, E, V> extends NJ0<D, E, V> implements InterfaceC7586xJ0 {

    @NotNull
    public final Object r;

    public static final class a<D, E, V> extends OJ0.c<V> implements InterfaceC1060Gj0 {

        @NotNull
        public final CJ0<D, E, V> l;

        public a(@NotNull CJ0<D, E, V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.l = property;
        }

        @Override // IJ0.a
        public final IJ0 e() {
            return this.l;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [fO0, java.lang.Object] */
        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(Object obj, Object obj2, Object obj3) {
            ((a) this.l.r.getValue()).a(obj, obj2, obj3);
            return Unit.a;
        }

        @Override // OJ0.a
        public final OJ0 v() {
            return this.l;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJ0(@NotNull AbstractC5906pJ0 container, @NotNull C0749Cj1 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.r = XO0.a(EnumC4403iP0.d, new U(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.InterfaceC7586xJ0
    public final InterfaceC7586xJ0.a g() {
        return (a) this.r.getValue();
    }
}

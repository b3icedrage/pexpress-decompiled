package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class NJ0<D, E, V> extends OJ0<V> implements Function2 {

    @NotNull
    public final Object p;

    @NotNull
    public final Object q;

    public static final class a<D, E, V> extends OJ0.b<V> implements Function2 {

        @NotNull
        public final NJ0<D, E, V> l;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull NJ0<D, E, ? extends V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.l = property;
        }

        @Override // IJ0.a
        public final IJ0 e() {
            return this.l;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [fO0, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final V invoke(D d, E e) {
            return ((a) this.l.p.getValue()).a(d, e);
        }

        @Override // OJ0.a
        public final OJ0 v() {
            return this.l;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NJ0(@NotNull AbstractC5906pJ0 container, @NotNull C0749Cj1 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.d;
        this.p = XO0.a(enumC4403iP0, new C5842p1(this, 4));
        this.q = XO0.a(enumC4403iP0, new C7843yZ(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.IJ0
    public final IJ0.b f() {
        return (a) this.p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final V invoke(D d, E e) {
        return ((a) this.p.getValue()).a(d, e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.OJ0
    public final OJ0.b w() {
        return (a) this.p.getValue();
    }
}

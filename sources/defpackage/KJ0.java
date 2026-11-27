package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class KJ0<V> extends OJ0<V> implements JJ0<V> {

    @NotNull
    public final Object p;

    @NotNull
    public final Object q;

    public static final class a<R> extends OJ0.b<R> implements JJ0.a<R> {

        @NotNull
        public final KJ0<R> l;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull KJ0<? extends R> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.l = property;
        }

        @Override // IJ0.a
        public final IJ0 e() {
            return this.l;
        }

        @Override // kotlin.jvm.functions.Function0
        public final R invoke() {
            return this.l.get();
        }

        @Override // OJ0.a
        public final OJ0 v() {
            return this.l;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KJ0(@NotNull AbstractC5906pJ0 container, @NotNull C0749Cj1 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.d;
        int i = 2;
        this.p = XO0.a(enumC4403iP0, new C4640jI0(this, i));
        this.q = XO0.a(enumC4403iP0, new C4850kI0(this, i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.IJ0
    public final IJ0.b f() {
        return (a) this.p.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.JJ0
    public final V get() {
        return (V) ((a) this.p.getValue()).a(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function0
    public final V invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.OJ0
    public final OJ0.b w() {
        return (a) this.p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.IJ0
    public final JJ0.a f() {
        return (a) this.p.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KJ0(@NotNull AbstractC5906pJ0 container, @NotNull String name, @NotNull String signature, @Nullable Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.d;
        int i = 2;
        this.p = XO0.a(enumC4403iP0, new C4640jI0(this, i));
        this.q = XO0.a(enumC4403iP0, new C4850kI0(this, i));
    }
}

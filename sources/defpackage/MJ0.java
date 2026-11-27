package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class MJ0<T, V> extends OJ0<V> implements LJ0<T, V> {

    @NotNull
    public final Object p;

    @NotNull
    public final Object q;

    public static final class a<T, V> extends OJ0.b<V> implements LJ0.a<T, V> {

        @NotNull
        public final MJ0<T, V> l;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull MJ0<T, ? extends V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.l = property;
        }

        @Override // IJ0.a
        public final IJ0 e() {
            return this.l;
        }

        @Override // kotlin.jvm.functions.Function1
        public final V invoke(T t) {
            return this.l.get(t);
        }

        @Override // OJ0.a
        public final OJ0 v() {
            return this.l;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MJ0(@NotNull AbstractC5906pJ0 container, @NotNull String name, @NotNull String signature, @Nullable Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.d;
        this.p = XO0.a(enumC4403iP0, new C2232Vj0(this, 1));
        this.q = XO0.a(enumC4403iP0, new C7633xZ(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.IJ0
    public final IJ0.b f() {
        return (a) this.p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.LJ0
    public final V get(T t) {
        return ((a) this.p.getValue()).a(t);
    }

    @Override // kotlin.jvm.functions.Function1
    public final V invoke(T t) {
        return get(t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.OJ0
    public final OJ0.b w() {
        return (a) this.p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.IJ0
    public final LJ0.a f() {
        return (a) this.p.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MJ0(@NotNull AbstractC5906pJ0 container, @NotNull C0749Cj1 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.d;
        this.p = XO0.a(enumC4403iP0, new C2232Vj0(this, 1));
        this.q = XO0.a(enumC4403iP0, new C7633xZ(this, 2));
    }
}

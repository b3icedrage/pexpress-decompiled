package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class BJ0<T, V> extends MJ0<T, V> implements AJ0<T, V> {

    @NotNull
    public final Object r;

    public static final class a<T, V> extends OJ0.c<V> implements AJ0.a<T, V> {

        @NotNull
        public final BJ0<T, V> l;

        public a(@NotNull BJ0<T, V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.l = property;
        }

        @Override // IJ0.a
        public final IJ0 e() {
            return this.l;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Object obj, Object obj2) {
            this.l.p(obj, obj2);
            return Unit.a;
        }

        @Override // OJ0.a
        public final OJ0 v() {
            return this.l;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BJ0(@NotNull AbstractC5906pJ0 container, @NotNull String name, @NotNull String signature, @Nullable Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.r = XO0.a(EnumC4403iP0.d, new T(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.InterfaceC7586xJ0
    public final InterfaceC7586xJ0.a g() {
        return (a) this.r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.AJ0
    public final void p(T t, V v) {
        ((a) this.r.getValue()).a(t, v);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.AJ0, defpackage.InterfaceC7586xJ0
    public final AJ0.a g() {
        return (a) this.r.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BJ0(@NotNull AbstractC5906pJ0 container, @NotNull C0749Cj1 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.r = XO0.a(EnumC4403iP0.d, new T(this, 2));
    }
}

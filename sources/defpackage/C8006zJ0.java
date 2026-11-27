package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8006zJ0<V> extends KJ0<V> implements InterfaceC7796yJ0<V> {

    @NotNull
    public final Object r;

    /* JADX INFO: renamed from: zJ0$a */
    public static final class a<R> extends OJ0.c<R> implements InterfaceC7796yJ0.a<R> {

        @NotNull
        public final C8006zJ0<R> l;

        public a(@NotNull C8006zJ0<R> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.l = property;
        }

        @Override // IJ0.a
        public final IJ0 e() {
            return this.l;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [fO0, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            ((a) this.l.r.getValue()).a(obj);
            return Unit.a;
        }

        @Override // OJ0.a
        public final OJ0 v() {
            return this.l;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8006zJ0(@NotNull AbstractC5906pJ0 container, @NotNull C0749Cj1 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.r = XO0.a(EnumC4403iP0.d, new S(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.InterfaceC7586xJ0
    public final InterfaceC7586xJ0.a g() {
        return (a) this.r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.InterfaceC7796yJ0, defpackage.InterfaceC7586xJ0
    public final InterfaceC7796yJ0.a g() {
        return (a) this.r.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8006zJ0(@NotNull AbstractC5906pJ0 container, @NotNull String name, @NotNull String signature, @Nullable Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.r = XO0.a(EnumC4403iP0.d, new S(this, 2));
    }
}

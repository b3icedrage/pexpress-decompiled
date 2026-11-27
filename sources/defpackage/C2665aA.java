package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2665aA implements XF0 {

    @NotNull
    public final C2936bP1 d;

    @NotNull
    public final C2836aw e;

    public C2665aA(@NotNull C2936bP1 delegate, @NotNull C2836aw channel) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.d = delegate;
        this.e = channel;
    }

    @Override // defpackage.XF0
    @NotNull
    public final A20 A(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.d.A(z, z2, handler);
    }

    @Override // defpackage.XF0
    @NotNull
    public final CancellationException C() {
        return this.d.C();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext L(@NotNull CoroutineContext.a<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return CoroutineContext.Element.a.b(this.d, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R R0(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return (R) this.d.R0(r, operation);
    }

    @Override // defpackage.XF0
    public final boolean S0() {
        return this.d.S0();
    }

    @Override // defpackage.XF0
    @NotNull
    public final A20 W(@NotNull Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.d.W(handler);
    }

    @Override // defpackage.XF0
    @Nullable
    public final Object b1(@NotNull JM<? super Unit> jm) {
        return this.d.b1(jm);
    }

    @Override // defpackage.XF0
    @NotNull
    public final Sequence<XF0> c() {
        return this.d.c();
    }

    @Override // defpackage.XF0
    public final boolean g() {
        return this.d.g();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.a<?> getKey() {
        return XF0.a.d;
    }

    @Override // defpackage.XF0
    @Nullable
    public final XF0 getParent() {
        return this.d.getParent();
    }

    @Override // defpackage.XF0
    public final boolean isCancelled() {
        return this.d.isCancelled();
    }

    @Override // defpackage.XF0, defpackage.InterfaceC0764Co1
    public final void l(@Nullable CancellationException cancellationException) {
        this.d.l(cancellationException);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public final <E extends CoroutineContext.Element> E p(@NotNull CoroutineContext.a<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (E) CoroutineContext.Element.a.a(this.d, key);
    }

    @Override // defpackage.XF0
    public final boolean start() {
        return this.d.start();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext t(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return CoroutineContext.Element.a.c(this.d, context);
    }

    @NotNull
    public final String toString() {
        return "ChannelJob[" + this.d + ']';
    }

    @Override // defpackage.XF0
    @NotNull
    public final WB v(@NotNull C3956gG0 child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return this.d.v(child);
    }
}

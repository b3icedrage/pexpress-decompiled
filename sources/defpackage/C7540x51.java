package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7540x51 extends a implements XF0 {

    @NotNull
    public static final C7540x51 e = new C7540x51(XF0.a.d);

    @Override // defpackage.XF0
    @NotNull
    public final A20 A(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1) {
        return C7960z51.d;
    }

    @Override // defpackage.XF0
    @NotNull
    public final CancellationException C() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.XF0
    public final boolean S0() {
        return false;
    }

    @Override // defpackage.XF0
    @NotNull
    public final A20 W(@NotNull Function1<? super Throwable, Unit> function1) {
        return C7960z51.d;
    }

    @Override // defpackage.XF0
    @Nullable
    public final Object b1(@NotNull JM<? super Unit> jm) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.XF0
    @NotNull
    public final Sequence<XF0> c() {
        return C6492s60.a;
    }

    @Override // defpackage.XF0
    public final boolean g() {
        return true;
    }

    @Override // defpackage.XF0
    @Nullable
    public final XF0 getParent() {
        return null;
    }

    @Override // defpackage.XF0
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.XF0
    public final boolean start() {
        return false;
    }

    @NotNull
    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.XF0
    @NotNull
    public final WB v(@NotNull C3956gG0 c3956gG0) {
        return C7960z51.d;
    }

    @Override // defpackage.XF0, defpackage.InterfaceC0764Co1
    public final void l(@Nullable CancellationException cancellationException) {
    }
}

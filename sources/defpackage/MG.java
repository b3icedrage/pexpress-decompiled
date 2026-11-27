package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class MG {

    @Nullable
    public final Object a;

    @Nullable
    public final InterfaceC4778jy b;

    @Nullable
    public final Function1<Throwable, Unit> c;

    @Nullable
    public final Object d;

    @Nullable
    public final Throwable e;

    /* JADX WARN: Multi-variable type inference failed */
    public MG(@Nullable Object obj, @Nullable InterfaceC4778jy interfaceC4778jy, @Nullable Function1<? super Throwable, Unit> function1, @Nullable Object obj2, @Nullable Throwable th) {
        this.a = obj;
        this.b = interfaceC4778jy;
        this.c = function1;
        this.d = obj2;
        this.e = th;
    }

    public static MG a(MG mg, InterfaceC4778jy interfaceC4778jy, CancellationException cancellationException, int i) {
        Object obj = mg.a;
        if ((i & 2) != 0) {
            interfaceC4778jy = mg.b;
        }
        InterfaceC4778jy interfaceC4778jy2 = interfaceC4778jy;
        Function1<Throwable, Unit> function1 = mg.c;
        Object obj2 = mg.d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = mg.e;
        }
        mg.getClass();
        return new MG(obj, interfaceC4778jy2, function1, obj2, th);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MG)) {
            return false;
        }
        MG mg = (MG) obj;
        return Intrinsics.a(this.a, mg.a) && Intrinsics.a(this.b, mg.b) && Intrinsics.a(this.c, mg.c) && Intrinsics.a(this.d, mg.d) && Intrinsics.a(this.e, mg.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC4778jy interfaceC4778jy = this.b;
        int iHashCode2 = (iHashCode + (interfaceC4778jy == null ? 0 : interfaceC4778jy.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.c;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ MG(Object obj, InterfaceC4778jy interfaceC4778jy, Function1 function1, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC4778jy, (Function1<? super Throwable, Unit>) ((i & 4) != 0 ? null : function1), (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}

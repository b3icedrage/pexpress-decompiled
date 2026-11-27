package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class YF0 extends CancellationException implements InterfaceC3347dN<YF0> {

    @NotNull
    public final transient C3956gG0 d;

    public YF0(@NotNull String str, @Nullable Throwable th, @NotNull C3956gG0 c3956gG0) {
        super(str);
        this.d = c3956gG0;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.InterfaceC3347dN
    public final /* bridge */ /* synthetic */ Throwable a() {
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof YF0)) {
            return false;
        }
        YF0 yf0 = (YF0) obj;
        return Intrinsics.a(yf0.getMessage(), getMessage()) && Intrinsics.a(yf0.d, this.d) && Intrinsics.a(yf0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int iHashCode = (this.d.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String toString() {
        return super.toString() + "; job=" + this.d;
    }
}

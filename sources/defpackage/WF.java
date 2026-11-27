package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class WF {

    @NotNull
    public final String a;

    public WF(@NotNull String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.a = result;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WF) && Intrinsics.a(this.a, ((WF) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("CommonForgotPasswordResponse(result="), this.a, ")");
    }
}

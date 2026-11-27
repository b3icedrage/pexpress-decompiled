package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DR0 {

    @NotNull
    public final C7416wW1 a;

    public DR0(@NotNull C7416wW1 suspendStore) {
        Intrinsics.checkNotNullParameter(suspendStore, "suspendStore");
        this.a = suspendStore;
    }

    @Nullable
    public final Object a(@NotNull String str, @NotNull String str2, @NotNull EnumC2758ad2 enumC2758ad2, @NotNull LM lm) {
        Object objA = this.a.a.a(new C1130Hg1(new C7205vW1(Z0.c(enumC2758ad2.d, str), str2, null), null), lm);
        MN mn = MN.d;
        if (objA != mn) {
            objA = Unit.a;
        }
        return objA == mn ? objA : Unit.a;
    }
}

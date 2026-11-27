package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class BV0 {

    @NotNull
    public final ActivityC6781tV0 a;

    @NotNull
    public final C0738Cg b;

    public BV0(@NotNull ActivityC6781tV0 activity, @NotNull C0738Cg menuViewProvider) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(menuViewProvider, "menuViewProvider");
        this.a = activity;
        this.b = menuViewProvider;
    }
}

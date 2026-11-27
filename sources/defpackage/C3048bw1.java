package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3048bw1 {

    @NotNull
    public final InterfaceC2188Uu1 a;

    @NotNull
    public final InterfaceC6034pv1 b;

    public C3048bw1(@NotNull InterfaceC2188Uu1 alertDialogs, @NotNull InterfaceC6034pv1 bottomSheetDialogs) {
        Intrinsics.checkNotNullParameter(alertDialogs, "alertDialogs");
        Intrinsics.checkNotNullParameter(bottomSheetDialogs, "bottomSheetDialogs");
        this.a = alertDialogs;
        this.b = bottomSheetDialogs;
    }
}

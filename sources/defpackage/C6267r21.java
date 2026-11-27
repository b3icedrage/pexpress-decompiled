package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: r21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6267r21 {
    @NotNull
    public static final QC a(@NotNull InterfaceC5848p21 interfaceC5848p21, int i) {
        Intrinsics.checkNotNullParameter(interfaceC5848p21, "<this>");
        return QC.a.a(interfaceC5848p21.a(i), interfaceC5848p21.b(i));
    }

    @NotNull
    public static final C5638o21 b(@NotNull InterfaceC5848p21 interfaceC5848p21, int i) {
        Intrinsics.checkNotNullParameter(interfaceC5848p21, "<this>");
        C5638o21 c5638o21I = C5638o21.i(interfaceC5848p21.getString(i));
        Intrinsics.checkNotNullExpressionValue(c5638o21I, "guessByFirstCharacter(...)");
        return c5638o21I;
    }
}

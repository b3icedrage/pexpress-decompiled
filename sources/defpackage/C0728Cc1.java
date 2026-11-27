package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Cc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0728Cc1 implements Oc2 {
    @Override // defpackage.Oc2
    @NotNull
    public final Integer a() {
        return 6;
    }

    @Override // defpackage.Oc2
    public final boolean b(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return text.length() >= 6;
    }
}

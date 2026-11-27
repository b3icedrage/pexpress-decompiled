package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class L41 implements Oc2 {
    @Override // defpackage.Oc2
    @Nullable
    public final Integer a() {
        return null;
    }

    @Override // defpackage.Oc2
    public final boolean b(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        return 3 <= length && length < 16 && !StringsKt.C(text, " ", false);
    }
}

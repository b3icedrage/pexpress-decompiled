package defpackage;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Lv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1484Lv {

    @NotNull
    public static final C1484Lv a = new C1484Lv();

    private C1484Lv() {
    }

    public static final void a(@NotNull Bundle bundle, @NotNull String str, @Nullable Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(@NotNull Bundle bundle, @NotNull String str, @Nullable SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}

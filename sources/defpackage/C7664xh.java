package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7664xh {

    @NotNull
    public final Intent a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    public C7664xh(@NotNull Intent intent, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.a = intent;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}

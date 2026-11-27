package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6666sw1 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final Context b;

    public C6666sw1(@NotNull C4923kf appData, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = appData;
        this.b = context;
    }
}

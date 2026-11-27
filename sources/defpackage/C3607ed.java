package defpackage;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3607ed {

    @NotNull
    public static final C3607ed a = new C3607ed();

    @NotNull
    public final String a() {
        String processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
        return processName;
    }
}

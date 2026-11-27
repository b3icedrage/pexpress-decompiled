package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6731tE1 {

    @NotNull
    public final C6102qE1 a;

    public C6731tE1(@NotNull Context appContext, @NotNull String widgetId) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        this.a = new C6102qE1(appContext, widgetId);
    }
}

package io.sentry.android.replay;

import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class z {
    /* JADX WARN: Type inference failed for: r0v4, types: [fO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [fO0, java.lang.Object] */
    @Nullable
    public static final Window a(@NotNull View view) throws IllegalAccessException {
        Field field;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object obj = y.a;
        View maybeDecorView = view.getRootView();
        Intrinsics.checkNotNullExpressionValue(maybeDecorView, "getRootView(...)");
        Intrinsics.checkNotNullParameter(maybeDecorView, "maybeDecorView");
        Class cls = (Class) y.a.getValue();
        if (cls == null || !cls.isInstance(maybeDecorView) || (field = (Field) y.b.getValue()) == null) {
            return null;
        }
        Object obj2 = field.get(maybeDecorView);
        Intrinsics.c(obj2, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj2;
    }
}

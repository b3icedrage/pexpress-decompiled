package io.sentry.android.replay.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextLayoutResult;
import defpackage.QX0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class b implements l {

    @NotNull
    public final TextLayoutResult a;
    public final boolean b;

    static {
        int i = TextLayoutResult.$stable;
    }

    public b(@NotNull TextLayoutResult layout, boolean z) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.a = layout;
        this.b = z;
    }

    @Override // io.sentry.android.replay.util.l
    public final int a(int i) {
        return QX0.b(this.a.getLineTop(i));
    }

    @Override // io.sentry.android.replay.util.l
    public final float b(int i, int i2) {
        float horizontalPosition = this.a.getHorizontalPosition(i2, true);
        return (this.b || e() != 1) ? horizontalPosition : horizontalPosition - this.a.getLineLeft(i);
    }

    @Override // io.sentry.android.replay.util.l
    public final int c(int i) {
        return QX0.b(this.a.getLineBottom(i));
    }

    @Override // io.sentry.android.replay.util.l
    public final int d(int i) {
        return this.a.getLineStart(i);
    }

    @Override // io.sentry.android.replay.util.l
    public final int e() {
        return this.a.getLineCount();
    }

    @Override // io.sentry.android.replay.util.l
    @Nullable
    public final Integer f() {
        return null;
    }

    @Override // io.sentry.android.replay.util.l
    public final int g(int i) {
        return this.a.getLineEnd(i, true);
    }

    @Override // io.sentry.android.replay.util.l
    public final int h(int i) {
        return this.a.isLineEllipsized(i) ? 1 : 0;
    }
}

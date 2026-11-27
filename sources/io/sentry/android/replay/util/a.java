package io.sentry.android.replay.util;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class a implements l {

    @NotNull
    public final Layout a;

    public a(@NotNull Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.a = layout;
    }

    @Override // io.sentry.android.replay.util.l
    public final int a(int i) {
        return this.a.getLineTop(i);
    }

    @Override // io.sentry.android.replay.util.l
    public final float b(int i, int i2) {
        return this.a.getPrimaryHorizontal(i2);
    }

    @Override // io.sentry.android.replay.util.l
    public final int c(int i) {
        return this.a.getLineBottom(i);
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
        int i;
        Layout layout = this.a;
        if (!(layout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = layout.getText();
        Intrinsics.c(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, layout.getText().length(), ForegroundColorSpan.class);
        Intrinsics.checkNotNull(foregroundColorSpanArr);
        int i2 = Integer.MIN_VALUE;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            CharSequence text2 = layout.getText();
            Intrinsics.c(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = layout.getText();
            Intrinsics.c(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i = spanEnd - spanStart) > i2) {
                numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i2 = i;
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(numValueOf.intValue() | (-16777216));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.l
    public final int g(int i) {
        return this.a.getLineVisibleEnd(i);
    }

    @Override // io.sentry.android.replay.util.l
    public final int h(int i) {
        return this.a.getEllipsisCount(i);
    }
}

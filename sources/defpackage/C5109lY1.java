package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5109lY1 {

    /* JADX INFO: renamed from: lY1$a */
    public static final class a extends ClickableSpan {
        public final /* synthetic */ C0685Bo0 d;
        public final /* synthetic */ Context e;

        public a(C0685Bo0 c0685Bo0, Context context) {
            this.d = c0685Bo0;
            this.e = context;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            if (textView.isPressed()) {
                this.d.e.invoke(textView);
            }
            textView.postInvalidate();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            super.updateDrawState(ds);
            C0685Bo0 c0685Bo0 = this.d;
            ds.setColor(C6333rM.getColor(this.e, c0685Bo0.b));
            ds.setUnderlineText(c0685Bo0.c);
            Integer num = c0685Bo0.d;
            if (num != null) {
                ds.setTypeface(Typeface.create((Typeface) null, num.intValue()));
            }
        }
    }

    @NotNull
    public static final SpannableString a(@NotNull CharSequence text, @NotNull List<C0685Bo0> highlightParams, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(highlightParams, "highlightParams");
        Intrinsics.checkNotNullParameter(context, "context");
        SpannableString spannableString = new SpannableString(text);
        for (C0685Bo0 c0685Bo0 : highlightParams) {
            Matcher matcher = Pattern.compile(c0685Bo0.a).matcher(spannableString);
            a aVar = new a(c0685Bo0, context);
            while (matcher.find()) {
                spannableString.setSpan(aVar, matcher.start(), matcher.end(), 33);
            }
        }
        return spannableString;
    }

    public static final void b(@NotNull TextView textView, @NotNull LifecycleCoroutineScopeImpl coroutineScope, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        C5189lv.k(coroutineScope, C6266r20.c, new C5322mY1(num, num2, textView, null), 2);
    }

    public static /* synthetic */ void c(TextView textView, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, Integer num, Integer num2, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        b(textView, lifecycleCoroutineScopeImpl, num, num2);
    }
}

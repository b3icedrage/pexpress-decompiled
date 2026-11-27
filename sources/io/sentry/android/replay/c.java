package io.sentry.android.replay;

import defpackage.KS1;
import defpackage.ML0;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends ML0 implements Function1<MatchResult, CharSequence> {
    public static final c d = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(MatchResult matchResult) {
        MatchResult it = matchResult;
        Intrinsics.checkNotNullParameter(it, "it");
        String upperCase = String.valueOf(KS1.A(it.getValue())).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}

package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import defpackage.ML0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class v {

    @NotNull
    public static final SemanticsPropertyKey<String> a = new SemanticsPropertyKey<>("SentryPrivacy", a.d);

    public static final class a extends ML0 implements Function2<String, String, String> {
        public static final a d = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            String str3 = str;
            Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            return str3;
        }
    }

    static {
        int i = SemanticsPropertyKey.$stable;
    }
}

package io.sentry.okhttp;

import defpackage.ML0;
import java.net.Proxy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends ML0 implements Function1<Proxy, CharSequence> {
    public static final e d = new e(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Proxy proxy) {
        Proxy proxy2 = proxy;
        Intrinsics.checkNotNullParameter(proxy2, "proxy");
        String string = proxy2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

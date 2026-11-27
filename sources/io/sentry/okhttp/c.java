package io.sentry.okhttp;

import defpackage.ML0;
import java.net.InetAddress;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends ML0 implements Function1<InetAddress, CharSequence> {
    public static final c d = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(InetAddress inetAddress) {
        InetAddress address = inetAddress;
        Intrinsics.checkNotNullParameter(address, "address");
        String string = address.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

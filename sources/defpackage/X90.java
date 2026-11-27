package defpackage;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class X90 extends DN implements Closeable {
    static {
        DN.a baseKey = DN.e;
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        W90 safeCast = W90.d;
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        if (baseKey != null) {
            CoroutineContext.a<?> aVar = baseKey.e;
        }
    }
}

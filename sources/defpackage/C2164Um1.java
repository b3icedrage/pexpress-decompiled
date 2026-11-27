package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Um1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2164Um1 implements Function1 {
    public static final C2164Um1 d = new C2164Um1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return "(raw) " + it;
    }
}

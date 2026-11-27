package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: g82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3932g82 extends ML0 implements Function1<Pair<? extends String, ? extends String>, CharSequence> {
    public static final C3932g82 d = new C3932g82(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Pair<? extends String, ? extends String> pair) {
        Pair<? extends String, ? extends String> it = pair;
        Intrinsics.checkNotNullParameter(it, "it");
        String str = (String) it.d;
        Object obj = it.e;
        if (obj == null) {
            return str;
        }
        return str + '=' + String.valueOf(obj);
    }
}

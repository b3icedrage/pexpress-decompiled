package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3763fM extends ML0 implements Function1<C2701aM.a.C0214a, CharSequence> {
    public static final C3763fM d = new C3763fM(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(C2701aM.a.C0214a c0214a) {
        C2701aM.a.C0214a it = c0214a;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.a.toString();
    }
}

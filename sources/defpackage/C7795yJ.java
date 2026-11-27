package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7795yJ extends ML0 implements Function1<AbstractC2882b80.a.C0249a<?>, Boolean> {
    public static final C7795yJ d = new C7795yJ(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AbstractC2882b80.a.C0249a<?> c0249a) {
        AbstractC2882b80.a.C0249a<?> receiver = c0249a;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return Boolean.valueOf(receiver.a instanceof InterfaceC7394wP0.a.c);
    }
}

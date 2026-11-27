package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2346Wu extends C2784ak0 implements Function2<Long, C3727fA<Object>, C3727fA<Object>> {
    public static final C2346Wu m = new C2346Wu(2, C2450Xu.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final C3727fA<Object> invoke(Long l, C3727fA<Object> c3727fA) {
        long jLongValue = l.longValue();
        C3727fA<Object> c3727fA2 = c3727fA;
        C3727fA<Object> c3727fA3 = C2450Xu.a;
        C2030Su<Object> c2030Su = c3727fA2.i;
        Intrinsics.checkNotNull(c2030Su);
        return new C3727fA<>(jLongValue, c3727fA2, c2030Su, 0);
    }
}

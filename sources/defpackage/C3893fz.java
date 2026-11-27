package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3893fz extends ML0 implements Function1<Map.Entry<C4991kz, Object>, Map.Entry<String, Object>> {
    public static final C3893fz d = new C3893fz(1);

    @Override // kotlin.jvm.functions.Function1
    public final Map.Entry<String, Object> invoke(Map.Entry<C4991kz, Object> entry) {
        Map.Entry<C4991kz, Object> $receiver = entry;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        return new C3716f70($receiver.getKey().a, $receiver.getValue());
    }
}

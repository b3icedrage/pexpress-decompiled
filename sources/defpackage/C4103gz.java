package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4103gz extends ML0 implements Function1<Map.Entry<String, Object>, Map.Entry<C4991kz, Object>> {
    public static final C4103gz d = new C4103gz(1);

    @Override // kotlin.jvm.functions.Function1
    public final Map.Entry<C4991kz, Object> invoke(Map.Entry<String, Object> entry) {
        Map.Entry<String, Object> $receiver = entry;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        return new C3716f70(QO.f($receiver.getKey()), $receiver.getValue());
    }
}

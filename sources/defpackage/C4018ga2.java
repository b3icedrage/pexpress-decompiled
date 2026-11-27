package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ga2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4018ga2 extends ML0 implements Function1<C3179ca2, C3179ca2> {
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4018ga2(String str) {
        super(1);
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C3179ca2 invoke(C3179ca2 c3179ca2) {
        C3179ca2 state = c3179ca2;
        Intrinsics.checkNotNullParameter(state, "state");
        HashMap files = new HashMap();
        Map<String, C2980bd0> map = state.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C2980bd0> entry : map.entrySet()) {
            if (!Intrinsics.a(entry.getValue().d, this.d)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Intrinsics.checkNotNullParameter(files, "files");
        return new C3179ca2(files);
    }
}

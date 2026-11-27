package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class D72 extends ML0 implements Function1<F72, F72> {
    public final /* synthetic */ B72 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D72(B72 b72, long j) {
        super(1);
        this.d = b72;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final F72 invoke(F72 f72) {
        F72 state = f72;
        Intrinsics.checkNotNullParameter(state, "state");
        B72 b72 = this.d;
        HashMap map = b72.f;
        long j = this.e;
        C7549x72 c7549x72 = (C7549x72) map.get(Long.valueOf(j));
        HashMap map2 = b72.f;
        if (c7549x72 != null && System.currentTimeMillis() - c7549x72.b > 4900) {
            map2.remove(Long.valueOf(j));
        }
        Set setEntrySet = map2.entrySet();
        ArrayList agents = new ArrayList(XE.m(setEntrySet, 10));
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            agents.add((C7549x72) ((Map.Entry) it.next()).getValue());
        }
        state.getClass();
        Intrinsics.checkNotNullParameter(agents, "agents");
        return new F72(agents);
    }
}

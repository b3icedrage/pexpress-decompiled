package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class C72 extends ML0 implements Function1<F72, F72> {
    public final /* synthetic */ B72 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72(B72 b72, long j) {
        super(1);
        this.d = b72;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final F72 invoke(F72 f72) {
        F72 state = f72;
        Intrinsics.checkNotNullParameter(state, "state");
        B72 b72 = this.d;
        b72.f.remove(Long.valueOf(this.e));
        Set setEntrySet = b72.f.entrySet();
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

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2661a9 extends ML0 implements Function1<C3513e9, C3513e9> {
    public final /* synthetic */ S8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2661a9(S8 s8) {
        super(1);
        this.d = s8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C3513e9 invoke(C3513e9 c3513e9) {
        S8 s8;
        C3513e9 state = c3513e9;
        Intrinsics.checkNotNullParameter(state, "state");
        ArrayList agents = new ArrayList();
        List<C7129v8> list = state.b;
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C7129v8.a((C7129v8) it.next(), null, null, null, null, false, 31));
        }
        agents.addAll(arrayList);
        Iterator it2 = agents.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            s8 = this.d;
            if (!zHasNext) {
                break;
            }
            S8.R(s8, (C7129v8) it2.next());
        }
        Iterator it3 = s8.h.entrySet().iterator();
        while (it3.hasNext()) {
            S8.R(s8, C7129v8.a((C7129v8) ((Map.Entry) it3.next()).getValue(), AbstractC3723f9.a.a, null, null, null, false, 61));
        }
        Intrinsics.checkNotNullParameter(agents, "agents");
        return new C3513e9(true, agents);
    }
}

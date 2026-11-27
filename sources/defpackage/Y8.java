package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Y8 extends ML0 implements Function1<C3513e9, C3513e9> {
    public final /* synthetic */ S8 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ AbstractC3723f9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y8(S8 s8, String str, AbstractC3723f9 abstractC3723f9) {
        super(1);
        this.d = s8;
        this.e = str;
        this.g = abstractC3723f9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C3513e9 invoke(C3513e9 c3513e9) {
        C7129v8 c7129v8;
        C3513e9 state = c3513e9;
        Intrinsics.checkNotNullParameter(state, "state");
        S8 s8 = this.d;
        C7129v8 c7129v9 = (C7129v8) s8.h.get(this.e);
        if (c7129v9 != null) {
            c7129v8 = C7129v8.a(c7129v9, this.g, null, null, null, state.a, 29);
        } else {
            c7129v8 = new C7129v8(this.e, this.g, null, null, null, state.a, 28);
        }
        S8.R(s8, c7129v8);
        s8.f.c().execute(new O8(0, s8, c7129v8));
        Set setEntrySet = s8.h.entrySet();
        ArrayList arrayList = new ArrayList(XE.m(setEntrySet, 10));
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            arrayList.add((C7129v8) ((Map.Entry) it.next()).getValue());
        }
        return C3513e9.a(state, arrayList, 1);
    }
}

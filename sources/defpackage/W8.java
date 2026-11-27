package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class W8 extends ML0 implements Function1<C3513e9, C3513e9> {
    public final /* synthetic */ S8 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W8(S8 s8, String str, String str2) {
        super(1);
        this.d = s8;
        this.e = str;
        this.g = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C3513e9 invoke(C3513e9 c3513e9) {
        C3513e9 state = c3513e9;
        Intrinsics.checkNotNullParameter(state, "state");
        S8 s8 = this.d;
        C7129v8 c7129v8 = (C7129v8) s8.h.get(this.e);
        String str = this.g;
        C7129v8 c7129v8A = c7129v8 != null ? C7129v8.a(c7129v8, null, null, null, str, false, 47) : new C7129v8(this.e, null, null, null, str, false, 46);
        S8.R(s8, c7129v8A);
        s8.f.c().execute(new P8(0, s8, c7129v8A));
        Set setEntrySet = s8.h.entrySet();
        ArrayList arrayList = new ArrayList(XE.m(setEntrySet, 10));
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            arrayList.add((C7129v8) ((Map.Entry) it.next()).getValue());
        }
        return C3513e9.a(state, arrayList, 1);
    }
}

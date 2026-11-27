package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: a72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2656a72 {

    @NotNull
    public final List<C4267hk1> a;

    public C2656a72(@NotNull C4945kk1 typeTable) {
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<C4267hk1> list = typeTable.g;
        if ((typeTable.e & 1) == 1) {
            int i = typeTable.h;
            Intrinsics.checkNotNullExpressionValue(list, "getTypeList(...)");
            ArrayList arrayList = new ArrayList(XE.m(list, 10));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    WE.l();
                    throw null;
                }
                C4267hk1 c4267hk1M = (C4267hk1) obj;
                if (i2 >= i) {
                    c4267hk1M.getClass();
                    C4267hk1.c cVarQ = C4267hk1.q(c4267hk1M);
                    cVarQ.h |= 2;
                    cVarQ.j = true;
                    c4267hk1M = cVarQ.m();
                    if (!c4267hk1M.d()) {
                        throw new C82();
                    }
                }
                arrayList.add(c4267hk1M);
                i2 = i3;
            }
            list = arrayList;
        }
        Intrinsics.checkNotNullExpressionValue(list, "run(...)");
        this.a = list;
    }

    @NotNull
    public final C4267hk1 a(int i) {
        return this.a.get(i);
    }
}

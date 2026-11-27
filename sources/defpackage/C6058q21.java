package defpackage;

import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: q21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6058q21 implements InterfaceC5848p21 {

    @NotNull
    public final C4057gk1 a;

    @NotNull
    public final C3847fk1 b;

    public C6058q21(@NotNull C4057gk1 strings, @NotNull C3847fk1 qualifiedNames) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(qualifiedNames, "qualifiedNames");
        this.a = strings;
        this.b = qualifiedNames;
    }

    @Override // defpackage.InterfaceC5848p21
    @NotNull
    public final String a(int i) {
        C5651o52<List<String>, List<String>, Boolean> c5651o52C = c(i);
        List<String> list = c5651o52C.d;
        String strJ = CollectionsKt.J(c5651o52C.e, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strJ;
        }
        return CollectionsKt.J(list, "/", null, null, null, 62) + '/' + strJ;
    }

    @Override // defpackage.InterfaceC5848p21
    public final boolean b(int i) {
        return c(i).g.booleanValue();
    }

    public final C5651o52<List<String>, List<String>, Boolean> c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            C3847fk1.c cVar = this.b.e.get(i);
            String str = (String) this.a.e.get(cVar.h);
            C3847fk1.c.EnumC0352c enumC0352c = cVar.i;
            Intrinsics.checkNotNull(enumC0352c);
            int iOrdinal = enumC0352c.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (iOrdinal != 2) {
                    throw new C6489s51();
                }
                linkedList2.addFirst(str);
                z = true;
            }
            i = cVar.g;
        }
        return new C5651o52<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // defpackage.InterfaceC5848p21
    @NotNull
    public final String getString(int i) {
        String str = (String) this.a.e.get(i);
        Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        return str;
    }
}

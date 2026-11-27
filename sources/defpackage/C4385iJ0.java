package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: iJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4385iJ0 extends AbstractC1295Jj1 {
    public static final C4385iJ0 l = new C4385iJ0();

    @Override // defpackage.LJ0
    public final Object get(Object obj) {
        RI0 ri0 = (RI0) obj;
        Intrinsics.checkNotNullParameter(ri0, "<this>");
        List<SJ0> listA = ri0.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            InterfaceC4853kJ0 interfaceC4853kJ0G = ((SJ0) it.next()).g();
            RI0 ri1 = interfaceC4853kJ0G instanceof RI0 ? (RI0) interfaceC4853kJ0G : null;
            if (ri1 != null) {
                arrayList.add(ri1);
            }
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC1568Mx, defpackage.JI0
    public final String getName() {
        return "superclasses";
    }

    @Override // defpackage.AbstractC1568Mx
    public final InterfaceC5486nJ0 j() {
        return C2017Sp1.a.c(C4643jJ0.class, "kotlin-reflection");
    }

    @Override // defpackage.AbstractC1568Mx
    public final String o() {
        return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
    }
}

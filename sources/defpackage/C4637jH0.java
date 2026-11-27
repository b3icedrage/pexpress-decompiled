package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4637jH0 extends ML0 implements Function0<Map<String, ? extends Integer>> {
    public final /* synthetic */ MH1 d;
    public final /* synthetic */ AbstractC5267mG0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4637jH0(AbstractC5267mG0 abstractC5267mG0, MH1 mh1) {
        super(0);
        this.d = mh1;
        this.e = abstractC5267mG0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends Integer> invoke() {
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC5267mG0 abstractC5267mG0 = this.e;
        C7577xG0 c7577xG0 = abstractC5267mG0.a;
        MH1 mh1 = this.d;
        C4847kH0.c(abstractC5267mG0, mh1);
        int iE = mh1.e();
        for (int i = 0; i < iE; i++) {
            List<Annotation> listG = mh1.g(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                if (obj instanceof InterfaceC4379iH0) {
                    arrayList.add(obj);
                }
            }
            InterfaceC4379iH0 interfaceC4379iH0 = (InterfaceC4379iH0) CollectionsKt.W(arrayList);
            if (interfaceC4379iH0 != null && (strArrNames = interfaceC4379iH0.names()) != null) {
                for (String str : strArrNames) {
                    String str2 = Intrinsics.a(mh1.h(), VH1.b.a) ? "enum value" : "property";
                    if (linkedHashMap.containsKey(str)) {
                        throw new ZG0("The suggested name '" + str + "' for " + str2 + ' ' + mh1.f(i) + " is already one of the names for " + str2 + ' ' + mh1.f(((Number) PW0.d(linkedHashMap, str)).intValue()) + " in " + mh1);
                    }
                    linkedHashMap.put(str, Integer.valueOf(i));
                }
            }
        }
        return linkedHashMap.isEmpty() ? PW0.c() : linkedHashMap;
    }
}

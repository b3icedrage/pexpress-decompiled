package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4815k71 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C4815k71(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        switch (this.d) {
            case 0:
                C1758Ph0 c1758Ph0 = (C1758Ph0) obj;
                Intrinsics.checkNotNull(c1758Ph0);
                ?? values = ((C5025l71) this.e).b;
                Intrinsics.checkNotNullParameter(c1758Ph0, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = values.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (linkedHashMap.isEmpty()) {
                            linkedHashMap = null;
                        }
                        if (linkedHashMap == null) {
                            return null;
                        }
                        Iterator it2 = linkedHashMap.entrySet().iterator();
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (it2.hasNext()) {
                                int length = C1914Rh0.a((C1758Ph0) ((Map.Entry) next).getKey(), c1758Ph0).b().length();
                                do {
                                    Object next2 = it2.next();
                                    int length2 = C1914Rh0.a((C1758Ph0) ((Map.Entry) next2).getKey(), c1758Ph0).b().length();
                                    if (length > length2) {
                                        next = next2;
                                        length = length2;
                                    }
                                } while (it2.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry != null) {
                            return entry.getValue();
                        }
                        return null;
                    }
                    Map.Entry entry2 = (Map.Entry) it.next();
                    C1758Ph0 packageName = (C1758Ph0) entry2.getKey();
                    if (!Intrinsics.a(c1758Ph0, packageName)) {
                        Intrinsics.checkNotNullParameter(c1758Ph0, "<this>");
                        Intrinsics.checkNotNullParameter(packageName, "packageName");
                        Intrinsics.checkNotNullParameter(c1758Ph0, "<this>");
                        if (Intrinsics.a(c1758Ph0.d() ? null : c1758Ph0.e(), packageName)) {
                        }
                    }
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
                break;
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.a((String) this.e, C4719jg1.b);
                return Unit.a;
        }
    }
}

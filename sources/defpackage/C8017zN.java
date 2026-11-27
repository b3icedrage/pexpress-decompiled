package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8017zN implements Function2 {
    public final /* synthetic */ int d;

    public /* synthetic */ C8017zN(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        switch (this.d) {
            case 0:
                CoroutineContext acc = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                CoroutineContext coroutineContextL = acc.L(element.getKey());
                e eVar = e.d;
                if (coroutineContextL == eVar) {
                    return element;
                }
                d.a aVar = d.f;
                d dVar = (d) coroutineContextL.p(aVar);
                if (dVar == null) {
                    cVar = new c(element, coroutineContextL);
                } else {
                    CoroutineContext coroutineContextL2 = coroutineContextL.L(aVar);
                    if (coroutineContextL2 == eVar) {
                        return new c(dVar, element);
                    }
                    cVar = new c(dVar, new c(element, coroutineContextL2));
                }
                return cVar;
            case 1:
                char cCharValue = ((Character) obj).charValue();
                char cCharValue2 = ((Character) obj2).charValue();
                StringBuilder sb = new StringBuilder();
                sb.append(cCharValue);
                sb.append(cCharValue2);
                return sb.toString();
            default:
                ((Integer) obj).intValue();
                ((Boolean) obj2).booleanValue();
                return Unit.a;
        }
    }
}

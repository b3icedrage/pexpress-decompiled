package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.trading.usecases.UnsentBetIdsUseCaseBase$removeRealBalance$2", f = "UnsentBetIdsUseCaseBase.kt", l = {49, 49}, m = "invokeSuspend")
public final class C5667o92 extends AW1 implements Function1<JM<? super Set<? extends String>>, Object> {
    public Set d;
    public int e;
    public final /* synthetic */ C5877p92 g;
    public final /* synthetic */ X7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5667o92(C5877p92 c5877p92, X7 x7, JM jm) {
        super(1, jm);
        this.g = c5877p92;
        this.h = x7;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C5667o92(this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Set<? extends String>> jm) {
        return ((C5667o92) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        Set set;
        MN mn = MN.d;
        int i = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            C5877p92.a aVar = this.g.d;
            this.e = 1;
            obj = C4466ii.o(aVar, this);
            if (obj != mn) {
            }
            return mn;
        }
        if (i == 1) {
            C1795Pt1.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = this.d;
            C1795Pt1.b(obj);
        }
        return C5907pJ1.c(set, String.valueOf(((Number) obj).longValue()));
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        Set setH0 = CollectionsKt.h0(arrayList);
        this.d = setH0;
        this.e = 2;
        Object objInvoke = this.h.invoke(this);
        if (objInvoke != mn) {
            set = setH0;
            obj = objInvoke;
            return C5907pJ1.c(set, String.valueOf(((Number) obj).longValue()));
        }
        return mn;
    }
}

package defpackage;

import com.api.core.backend.domain.models.resultModels.ResultOk;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.updaters.AssetsUpdater$collectAssets$2", f = "AssetsUpdater.kt", l = {}, m = "invokeSuspend")
public final class C5576nk extends AW1 implements InterfaceC1060Gj0<ResultOk<? extends C7152vF>, Boolean, JM<? super Unit>, Object> {
    public /* synthetic */ ResultOk d;
    public /* synthetic */ boolean e;
    public final /* synthetic */ C6206qk g;

    /* JADX INFO: renamed from: nk$a */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return BG.a(((C6942uF) t2).j, ((C6942uF) t).j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5576nk(C6206qk c6206qk, JM<? super C5576nk> jm) {
        super(3, jm);
        this.g = c6206qk;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        ResultOk resultOk = this.d;
        boolean z = this.e;
        ArrayList arrayList = ((C7152vF) resultOk.a()).a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C6942uF c6942uF = (C6942uF) obj2;
            if (z || c6942uF.v != C6942uF.a.d) {
                arrayList2.add(obj2);
            }
        }
        C4923kf c4923kf = this.g.a;
        GP1 gp1 = c4923kf.q;
        gp1.getClass();
        gp1.m(null, arrayList2);
        GP1 gp2 = c4923kf.p;
        List listZ = CollectionsKt.Z(arrayList2, new a());
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listZ) {
            if (((C6942uF) obj3).e != 0) {
                arrayList3.add(obj3);
            }
        }
        C7152vF c7152vF = new C7152vF(CollectionsKt.f0(arrayList3), ((C7152vF) resultOk.a()).b);
        gp2.getClass();
        gp2.m(null, c7152vF);
        return Unit.a;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(ResultOk<? extends C7152vF> resultOk, Boolean bool, JM<? super Unit> jm) {
        boolean zBooleanValue = bool.booleanValue();
        C5576nk c5576nk = new C5576nk(this.g, jm);
        c5576nk.d = resultOk;
        c5576nk.e = zBooleanValue;
        return c5576nk.invokeSuspend(Unit.a);
    }
}

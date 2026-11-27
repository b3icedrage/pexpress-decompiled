package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Pg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.preferences.domain.repository.PreferencesRepositoryBase$remove$2", f = "PreferencesRepositoryBase.kt", l = {}, m = "invokeSuspend")
public final class C1756Pg1 extends AW1 implements Function2<Y11, JM<? super Unit>, Object> {
    public /* synthetic */ Object d;
    public final /* synthetic */ Set<InterfaceC7031ug1<?>> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1756Pg1(Set<? extends InterfaceC7031ug1<?>> set, JM<? super C1756Pg1> jm) {
        super(2, jm);
        this.e = set;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C1756Pg1 c1756Pg1 = new C1756Pg1(this.e, jm);
        c1756Pg1.d = obj;
        return c1756Pg1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Y11 y11, JM<? super Unit> jm) {
        return ((C1756Pg1) create(y11, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        Y11 y11 = (Y11) this.d;
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            AbstractC0662Bg1.a key = ((InterfaceC7031ug1) it.next()).getKey();
            y11.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            y11.c();
            y11.a.remove(key);
        }
        return Unit.a;
    }
}

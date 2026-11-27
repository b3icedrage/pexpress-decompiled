package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: wi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.navigation.adder.FragmentPartManagerImpl$addNewSimpleFragmentPart$2", f = "FragmentPartManagerImpl.kt", l = {}, m = "invokeSuspend")
public final class C7459wi0 extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
    public C7459wi0() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7459wi0(2, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        ((C7459wi0) create(bool2, jm)).invokeSuspend(Unit.a);
        return Boolean.TRUE;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.TRUE;
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageViewModelBase$getCurrentLanguage$2", f = "ChangeLanguageViewModelBase.kt", l = {}, m = "invokeSuspend")
public final class C1185Hz extends AW1 implements Function2<KN, JM<? super UL0>, Object> {
    public final /* synthetic */ List<UL0> d;
    public final /* synthetic */ C1263Iz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1185Hz(List<UL0> list, C1263Iz c1263Iz, JM<? super C1185Hz> jm) {
        super(2, jm);
        this.d = list;
        this.e = c1263Iz;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1185Hz(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super UL0> jm) {
        return ((C1185Hz) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        Object next;
        MN mn = MN.d;
        C1795Pt1.b(obj);
        String strJ = C1952Ru.j();
        List<UL0> list = this.d;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.a(((UL0) next).g, strJ));
        UL0 ul0 = (UL0) next;
        if (ul0 == null) {
            return !list.isEmpty() ? (UL0) CollectionsKt.F(list) : this.e.d.defaultValue();
        }
        return ul0;
    }
}

package defpackage;

import com.appsflyer.share.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AssetsDataSourceImpl$startWithNull$1", f = "AssetsDataSourceImpl.kt", l = {RequestError.NO_DEV_KEY}, m = "invokeSuspend")
public final class C3426dk extends AW1 implements Function2<InterfaceC6606sf0<Object>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;

    public C3426dk() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C3426dk c3426dk = new C3426dk(2, jm);
        c3426dk.e = obj;
        return c3426dk;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<Object> interfaceC6606sf0, JM<? super Unit> jm) {
        return ((C3426dk) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC6606sf0 interfaceC6606sf0 = (InterfaceC6606sf0) this.e;
            this.d = 1;
            if (interfaceC6606sf0.a(null, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}

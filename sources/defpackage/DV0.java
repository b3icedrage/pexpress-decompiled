package defpackage;

import android.content.Context;
import com.base.feature.stub.screens.stub_results.StubResultsFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DV0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ DV0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return ((BV0) this.b).a;
            case 1:
                Context context = (Context) ((C6) this.b).get();
                Intrinsics.checkNotNullParameter(context, "context");
                return new C5289mN1();
            case 2:
                return new StubResultsFragment((Sd2) ((OW) this.b).get());
            default:
                return new B72((InterfaceC5889pD1) ((InterfaceC1454Lk1) this.b).get());
        }
    }
}

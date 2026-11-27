package defpackage;

import androidx.fragment.app.i;
import com.api.core.BaseFragment;
import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2304Wg implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C2304Wg(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                JX1 failure = (JX1) obj;
                int i = AppImpl.G;
                Intrinsics.checkNotNullParameter(failure, "failure");
                ((InterfaceC3706f42) obj2).n(failure);
                return Unit.a;
            default:
                i it = (i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return (BaseFragment) obj2;
        }
    }
}

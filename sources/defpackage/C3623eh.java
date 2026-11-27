package defpackage;

import android.view.View;
import com.pexpress.tool.AppImpl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3623eh implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C3623eh(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ak0, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                String requestId = (String) obj;
                int i = AppImpl.G;
                Intrinsics.checkNotNullParameter(requestId, "requestId");
                ((InterfaceC3706f42) obj2).J(requestId);
                break;
            case 1:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((C2784ak0) obj2).invoke();
                break;
            default:
                Exception e = (Exception) obj;
                Intrinsics.checkNotNullParameter(e, "e");
                S02 s02 = (S02) obj2;
                if (!s02.l0) {
                    s02.l0 = true;
                    C1910Rg c1910Rg = U0.v;
                    if (c1910Rg != null) {
                        c1910Rg.invoke(e, OW0.b(new Pair("phase", "direction_calculation")));
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C3623eh(Function0 function0) {
        this.d = 1;
        this.e = (C2784ak0) function0;
    }
}

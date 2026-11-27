package defpackage;

import android.view.View;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: iY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4429iY implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ C4429iY(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                return Long.valueOf(((C6945uG) obj).a);
            case 1:
                Intrinsics.checkNotNullParameter((View) obj, "it");
                return Unit.a;
            default:
                ResultOk it = (ResultOk) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!(it.a() instanceof C2337Wr));
        }
    }
}
